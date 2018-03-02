package gui;

import gui.controllers.DialogController;
import gui.models.Telecommands;
import gui.utils.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import xmlcomponents.CommandsElement;
import xmlcomponents.XMLElement;

import java.io.*;


public class MainController {
    @FXML
    private TableView<Telecommands> table;

    @FXML
    private TableColumn<Telecommands,String> telecommandsColumn;

    @FXML
    private Button addBtn;

    @FXML
    private Text outputText;

    private Main mainApp;
    private XMLElement rootElement;

    public MainController(){}

    @FXML
    private void initialize(){
        telecommandsColumn.setCellValueFactory(tc -> tc.getValue().nameProperty());
    }

    @FXML
    private void handleDoubleClick(MouseEvent e){
        if(e.getClickCount() == 2)
            handleAdd();
    }

    @FXML
    private void handleAdd(){
        Telecommands t = table.getSelectionModel().getSelectedItem();
        System.out.println(t.toString());
        if(t != null){
            try {
                showNewTCDialog(t);
            }catch (Exception e){
                Utils.AlertUser(e.getMessage());
            }
        }
    }

    @FXML
    private void saveToFile(){
        File f;
        Stage saveFileStage = new Stage();

        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter ef =
                new FileChooser.ExtensionFilter("XML Files (*.xml)", "*.xml");
        fc.getExtensionFilters().add(ef);
        fc.setTitle("Save File as...");

        f = fc.showSaveDialog(saveFileStage);
        if(f != null){
            try {
                if(f.createNewFile()){
                    String xmlHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
                    String xmlBody = this.rootElement.toXMLString(0);
                    BufferedWriter outFile = new BufferedWriter(new FileWriter(f));
                    outFile.write(xmlHeader,0,xmlHeader.length());
                    outFile.newLine();
                    outFile.write(xmlBody,0,xmlBody.length());
                    outFile.close();
                }
            }catch (IOException e) {
                Utils.AlertUser(e.getMessage());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void closeApp(){
        mainApp.getPrimaryStage().close();
    }

    @FXML
    private void newXML(){
        this.rootElement = new CommandsElement();
        updateOutputText();
    }

    @FXML
    private void showAbout(){
        Alert info = new Alert(Alert.AlertType.INFORMATION);
        info.setTitle("UPMSat2 XML creator");
        info.setHeaderText(null);
        info.setContentText("This application generates a valid XML document that can be used " +
                "to test the UPMSat2's OBC.\n\n" +
                "Made by David Herrero Sánchez, the intern working in \n" +
                "the UPMSat2 project at ETSIINF-UPM (Universidad Politécnica de Madrid).\n\n" +
                "Github: https://github.com/David312");

        info.showAndWait();
    }

    private void showNewTCDialog(Telecommands t) throws IOException{
        String location = "controllers/";
        switch (t){
            case OPENLINK:
                location += "createOpenLink";
                break;
            case SET_LOST_COMM_TIMER:
                location += "createSetLostCommTimer";
                break;
            case CHANGE_MODE:
                location += "createChangeMode";
                break;
            case CHANGE_SAMPLING_PERIOD:
                location += "createChangeSamplingPeriod";
                break;
            case ENABLE_DIGITAL_SIGNAL:
                location += "createEnableDigitalSignal";
                break;
            case DISABLE_DIGITAL_SIGNAL:
                location += "createDisableDigitalSignal";
                break;
            case CHANGE_ADCS_CALIBRATION_PARAMETERS:
                location += "createChangeADCSCalibrationParameters";
                break;
            case CHANGE_ADCS_CONTROLLER_PARAMETERS:
                location += "createChangeADCSControllerParameters";
                break;
            case START_RW_EXPERIMENT:
                location +="createStartRWExperiment";
                break;
            case START_MTS_EXPERIMENT:
                location += "createStartMTSExperiment";
                break;
            default:
                throw new IllegalArgumentException("Telecommand not found");
        }
        location += ".fxml";
        showDialog(location, t.toString());
    }

    private void showDialog(String location, String title) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(location));
        Parent root = loader.load();
        Stage dialogStage = new Stage();
        dialogStage.setTitle("New " + title);
        dialogStage.setScene(new Scene(root));
        dialogStage.initOwner(mainApp.getPrimaryStage());
        dialogStage.initModality(Modality.WINDOW_MODAL);

        DialogController controller = loader.getController();
        controller.setXMLRoot(this.rootElement);
        controller.setDialogStage(dialogStage);
        dialogStage.showAndWait();
        updateOutputText();
    }

    private void updateOutputText(){
        this.outputText.setText(this.rootElement.toXMLString(0));
    }

    public void setMainApp(Main mainApp){
        ObservableList<Telecommands> l = FXCollections.observableArrayList();
        l.addAll(Telecommands.values());
        this.mainApp = mainApp;
        this.table.setItems(l);
        this.rootElement = new CommandsElement();
        updateOutputText();
    }
}

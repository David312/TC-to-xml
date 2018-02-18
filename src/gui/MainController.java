package gui;

import gui.controllers.DialogController;
import gui.models.Telecommands;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import xmlcomponents.CommandsElement;
import xmlcomponents.XMLElement;

import java.io.IOException;


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
    private void handleAdd(){
        Telecommands t = table.getSelectionModel().getSelectedItem();
        System.out.println(t.toString());
        if(t != null){
            try {
                showNewTCDialog(t);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
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

package gui.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.StatusSignals;

public class CreateEnableDigitalSignal implements DialogController{
    @FXML
    private ChoiceBox<String> choice;

    @FXML
    private Button addBtn;
    @FXML
    private Button cancelBtn;

    private Stage dialogStage;
    private XMLElement root;

    @FXML
    private void initialize(){}

    @FXML
    private void handleCancel(){
        this.dialogStage.close();
    }

    @FXML
    private void handleAdd(){
        try {
            StatusSignals s = StatusSignals.valueOf(this.choice.getValue());
            this.root.appendChild(TCFactory.newEnableDigitalSignal(s));
            this.dialogStage.close();
        }catch (Exception e){
            e.printStackTrace();
            showErrorDialog();
        }
    }

    private void showErrorDialog() {
    }

    @Override
    public void setDialogStage(Stage s) {
        ObservableList<String> items = FXCollections.observableArrayList();
        for(StatusSignals signal : StatusSignals.values())
            items.add(signal.toString());
        this.dialogStage = s;
        this.choice.setItems(items);
        this.choice.setValue(this.choice.getItems().get(0));
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }

}

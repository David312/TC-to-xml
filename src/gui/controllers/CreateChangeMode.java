package gui.controllers;

import gui.utils.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.OperatingModes;


public class CreateChangeMode implements DialogController{
    @FXML
    private TextField dueTime;
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
            OperatingModes m = OperatingModes.valueOf(this.choice.getValue());
            this.root.appendChild(TCFactory.newChangeMode(dueTime.getText(),m));
            this.dialogStage.close();
        }catch (IllegalArgumentException e){
            Utils.AlertUser(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void showErrorDialog() {
    }

    @Override
    public void setDialogStage(Stage s) {
        ObservableList<String> items = FXCollections.observableArrayList();
        for(OperatingModes mode : OperatingModes.values())
            items.add(mode.toString());
        this.dialogStage = s;
        this.choice.setItems(items);
        this.choice.setValue(this.choice.getItems().get(0));
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }
}

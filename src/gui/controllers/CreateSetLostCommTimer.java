package gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;

public class CreateSetLostCommTimer implements DialogController{

    @FXML
    private TextField input;
    @FXML
    private Button addBtn;
    @FXML
    private Button cancelBtn;

    private Stage dialogStage;
    private XMLElement root;

    @FXML
    private void initialize(){}

    @FXML
    private void handleAdd(){
        try {
            this.root.appendChild(TCFactory.newSetLostCommTimer(input.getText()));
            this.dialogStage.close();
        } catch (Exception e){
            e.printStackTrace();
            showErrorDialog();
        }
    }

    private void showErrorDialog() {
    }

    @FXML
    private void handleCancel(){
        this.dialogStage.close();
    }

    @Override
    public void setDialogStage(Stage s) {
        this.dialogStage = s;
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }
}

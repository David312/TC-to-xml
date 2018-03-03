package gui.controllers;

import gui.utils.Utils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;

public class CreateOpenLink implements DialogController{
    @FXML
    private TextField dueTime;
    @FXML
    private TextField visibilityField;

    @FXML
    private Button addBtn;
    @FXML
    private Button cancelBtn;

    private Stage dialogStage;
    private XMLElement root;

    @FXML
    private void initialize(){}

    public void setDialogStage(Stage s){
        this.dialogStage = s;
    }

    public void setXMLRoot(XMLElement root){
        this.root = root;
    }

    @FXML
    private void handleCancel(){
        this.dialogStage.close();
    }
    @FXML
    private void handleAdd(){
        try {
            this.root.appendChild(
                    TCFactory.newOpenLink(
                            dueTime.getText(),
                            visibilityField.getText()
                    )
            );
            this.dialogStage.close();
        } catch (IllegalArgumentException e){
            Utils.AlertUser(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void showErrorDialog() {
        // TODO: implement method
    }


}

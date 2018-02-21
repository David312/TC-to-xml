package gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.XMLElement;

import java.util.List;


public class CreateChangeADCSCalibrationParameters implements DialogController{
    @FXML
    private List<TextField> CM_MGM1;
    @FXML
    private List<TextField> CM_MGM2;
    @FXML
    private List<TextField> CM_MGM3;

    @FXML
    private List<TextField> CO_MGM1;
    @FXML
    private List<TextField> CO_MGM2;
    @FXML
    private List<TextField> CO_MGM3;

    @FXML
    private List<CheckBox> MGM_Working;

    @FXML
    private Button addBtn;
    @FXML
    private Button cancelBtn;

    private Stage dialogStage;
    private XMLElement root;

    @FXML
    private void initialize(){

    }

    @FXML
    private void handleAdd(){
        System.out.println(CM_MGM1);
        for(TextField t:CM_MGM1)
            System.out.println(t.getText());
        this.dialogStage.close();
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

package gui.controllers;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import xmlcomponents.XMLElement;


public class CreateChangeADCSCalibrationParameters implements DialogController{
    private Stage dialogStage;
    private XMLElement root;

    @FXML
    private void initialize(){}

    @Override
    public void setDialogStage(Stage s) {
        this.dialogStage = s;
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }
}

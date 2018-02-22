package gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;

import java.util.ArrayList;
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

    private List<List<String>> collectParameters(){
        List<List<String>> parameters = new ArrayList<List<String>>();

        // MGM_Working
        List<String> l = new ArrayList<>();
        for(CheckBox c: MGM_Working){
            if(c.isSelected())
                l.add(TCFactory.TRUE_VALUE);
            else
                l.add(TCFactory.FALSE_VALUE);
        }
        parameters.add(new ArrayList<>(l));

        // CM_MGM1
        l = new ArrayList<>();
        for(TextField t: CM_MGM1)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        // CO_MGM1
        l = new ArrayList<>();
        for(TextField t: CO_MGM1)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        // CM_MGM2
        l = new ArrayList<>();
        for(TextField t: CM_MGM2)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        // CO_MGM2
        l = new ArrayList<>();
        for(TextField t: CO_MGM2)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        // CM_MGM3
        l = new ArrayList<>();
        for(TextField t: CM_MGM3)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        // CO_MGM3
        l = new ArrayList<>();
        for(TextField t: CO_MGM3)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        return parameters;
    }

    @FXML
    private void handleAdd(){
        this.root.appendChild(TCFactory.newChangeADCSCalibrationParameters(collectParameters()));
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

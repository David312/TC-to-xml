package gui.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;
import xmlcomponents.tc.adcs.controllerparameters.Omega;

import java.util.ArrayList;
import java.util.List;

public class CreateChangeADCSControllerParameters implements DialogController{
    @FXML
    private List<CheckBox> MGT_Working;
    @FXML
    private TextField k_pb;
    @FXML
    private TextField k_pe;
    @FXML
    private List<TextField> omega;
    @FXML
    private TextField m_m;

    @FXML
    private Button addBtn;
    @FXML
    private Button cancelBtn;


    private Stage dialogStage;
    private XMLElement root;

    @FXML
    private void initialize(){}

    private List<List<String>> collectParameters(){
        List<List<String>> parameters = new ArrayList<List<String>>();
        List<String> l;

        // MGT_WORKING;
        l = new ArrayList<>();
        for(CheckBox c: MGT_Working){
            if(c.isSelected())
                l.add(TCFactory.TRUE_VALUE);
            else
                l.add(TCFactory.FALSE_VALUE);
        }
        parameters.add(new ArrayList<>(l));

        // K_PB
        l = new ArrayList<>();
        l.add(k_pb.getText());
        parameters.add(new ArrayList<>(l));

        // K_PE
        l = new ArrayList<>();
        l.add(k_pe.getText());
        parameters.add(new ArrayList<>(l));

        // M_M
        l = new ArrayList<>();
        l.add(m_m.getText());
        parameters.add(new ArrayList<>(l));

        // Omega
        l = new ArrayList<>();
        for(TextField t: omega)
            l.add(t.getText());
        parameters.add(new ArrayList<>(l));

        return parameters;
    }

    @FXML
    private void handleAdd(){
        this.root.appendChild(TCFactory.newChangeADCSControllerParameters(collectParameters()));
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

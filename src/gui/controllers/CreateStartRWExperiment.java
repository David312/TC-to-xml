package gui.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.RWTestTypes;


public class CreateStartRWExperiment implements DialogController {

    @FXML
    private ChoiceBox<String> choice;
    @FXML
    private TextField parameter;
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
        RWTestTypes test = RWTestTypes.valueOf(choice.getSelectionModel().getSelectedItem());
        this.root.appendChild(TCFactory.newStartRWExperiment(test, this.parameter.getText()));
        this.dialogStage.close();
    }


    @Override
    public void setDialogStage(Stage s) {
        ObservableList<String> l = FXCollections.observableArrayList();
        this.dialogStage = s;
        for(RWTestTypes t: RWTestTypes.values())
            l.add(t.toString());
        this.choice.setItems(l);
        this.choice.setValue(l.get(0));
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }
}

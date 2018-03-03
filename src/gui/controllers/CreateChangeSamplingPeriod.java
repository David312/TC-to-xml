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
import xmlcomponents.enumerates.AnalogSignalGroups;

public class CreateChangeSamplingPeriod implements DialogController {
    @FXML
    private TextField dueTime;
    @FXML
    private ChoiceBox<String> choice;
    @FXML
    private TextField period;

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
            AnalogSignalGroups g = AnalogSignalGroups.toEnum(this.choice.getValue());
            this.root.appendChild(TCFactory.newChangeSamplingPeriod(dueTime.getText(),g,this.period.getText()));
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
        for(AnalogSignalGroups group : AnalogSignalGroups.values())
            items.add(group.toString());
        this.dialogStage = s;
        this.choice.setItems(items);
        this.choice.setValue(this.choice.getItems().get(0));
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }
}

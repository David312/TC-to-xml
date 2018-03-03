package gui.controllers;

import gui.utils.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import xmlcomponents.TCFactory;
import xmlcomponents.XMLElement;
import xmlcomponents.enumerates.EssayCommands;

import java.util.ArrayList;
import java.util.List;

public class CreateStartMTSExperiment implements DialogController{
    @FXML
    private TextField dueTime;
    @FXML
    private List<CheckBox> MTS_T;
    @FXML
    private List<CheckBox> heaters;
    @FXML
    private List<CheckBox> reserved;
    @FXML
    private ChoiceBox<String> choices;
    @FXML
    private TextField duration;


    private Stage dialogStage;
    private XMLElement root;


    @FXML
    private void handleAdd(){
        List<String> parameters = new ArrayList<>();

        parameters.add(this.duration.getText());

        for(CheckBox c: MTS_T)
            parameters.add(Boolean.toString(c.isSelected()));

        for(CheckBox c: heaters)
            parameters.add(Boolean.toString(c.isSelected()));

        parameters.add(choices.getSelectionModel().getSelectedItem());

        for(CheckBox c: reserved)
            parameters.add(Boolean.toString(c.isSelected()));

        try{
            this.root.appendChild(TCFactory.newStartMTSExperiment(dueTime.getText(),parameters));
            this.dialogStage.close();
        }catch (IllegalArgumentException e){
            Utils.AlertUser(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void handleCancel(){
        this.dialogStage.close();
    }

    @Override
    public void setDialogStage(Stage s) {
        ObservableList<String> l = FXCollections.observableArrayList();
        for(EssayCommands e: EssayCommands.values())
            l.add(e.toString());
        this.choices.setItems(l);
        this.choices.setValue(EssayCommands.values()[0].toString());
        this.dialogStage = s;
    }

    @Override
    public void setXMLRoot(XMLElement root) {
        this.root = root;
    }
}

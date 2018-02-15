package gui;

import gui.models.Telecommands;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import xmlcomponents.CommandsElement;
import xmlcomponents.XMLElement;


public class MainController {
    @FXML
    private TableView<Telecommands> table;

    @FXML
    private TableColumn<Telecommands,String> telecommandsColumn;

    private Main mainApp;
    private XMLElement rootElement;

    public MainController(){}

    @FXML
    private void initialize(){
        telecommandsColumn.setCellValueFactory(tc -> tc.getValue().nameProperty());
    }

    public void setMainApp(Main mainApp){
        ObservableList<Telecommands> l = FXCollections.observableArrayList();
        l.addAll(Telecommands.values());
        this.mainApp = mainApp;
        this.table.setItems(l);
        this.rootElement = new CommandsElement();
    }
}

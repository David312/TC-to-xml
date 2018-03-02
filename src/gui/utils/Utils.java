package gui.utils;

import javafx.scene.control.Alert;

public class Utils {
    public static void AlertUser(String msg){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error detected");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}

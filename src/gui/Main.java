package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("mainView.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("UPMSat 2 XML Generator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        MainController controller = loader.getController();
        controller.setMainApp(this);
    }

    public Stage getPrimaryStage(){
        return this.primaryStage;
    }
    public static void main(String[] args) {
        launch(args);
    }
}

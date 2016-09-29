package Vista;

import Controlador.ConexionBD;
import Controlador.ControladorUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("Vista/sample.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("J&J-OS v1");
        stage.setScene(new Scene(root, 1000, 600));
        ControladorUI controller = loader.<ControladorUI>getController();
        controller.loadResources();
        stage.show();
    }

    public static void main(String[] args) {
        ConexionBD.conectar();
        launch(args);
    }
}

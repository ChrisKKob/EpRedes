import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("layout.fxml"));
        final Parent root = fxmlloader.load();
        Scene tela = new Scene(root);

        primaryStage.setTitle("Calendario");
        primaryStage.setScene(tela);
        primaryStage.show();
    }
}

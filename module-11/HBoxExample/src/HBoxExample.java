import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create buttons
        Button btn1 = new Button("Home");
        Button btn2 = new Button("Settings");
        Button btn3 = new Button("Logout");

        // Create an HBox layout with spacing of 15 pixels
        HBox hbox = new HBox(15, btn1, btn2, btn3);
        hbox.setAlignment(Pos.CENTER);

        // Create a scene with HBox as root node
        Scene scene = new Scene(hbox, 400, 200);

        primaryStage.setTitle("JavaFX HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

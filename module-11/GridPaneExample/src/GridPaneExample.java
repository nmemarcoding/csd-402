import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        // Create labels
        Text usernameLabel = new Text("Username:");
        TextField usernameField = new TextField();
        Text passwordLabel = new Text("Password:");
        TextField passwordField = new TextField();
        Button loginButton = new Button("Login");

        // Create GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setAlignment(Pos.CENTER);

        // Add elements to the grid
        gridPane.add(usernameLabel, 0, 0);
        gridPane.add(usernameField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(loginButton, 1, 2);

        // Create scene and display the stage
        Scene scene = new Scene(gridPane, 400, 200);
        stage.setTitle("JavaFX GridPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}

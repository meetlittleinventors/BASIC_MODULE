import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class MoodColorChanger extends Application {

    @Override
    public void start(Stage stage) {
        // Label
        Label label = new Label("How's your mood today?");
        
        // Buttons
        Button happyBtn = new Button("Happy");
        Button calmBtn = new Button("Calm");
        Button energeticBtn = new Button("Energetic");

        // VBox layout
        VBox vbox = new VBox(15, label, happyBtn, calmBtn, energeticBtn);
        vbox.setPadding(new Insets(20));

        // Initial background
        vbox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        // Button actions
        happyBtn.setOnAction(e -> 
            vbox.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)))
        );
        calmBtn.setOnAction(e -> 
            vbox.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)))
        );
        energeticBtn.setOnAction(e -> 
            vbox.setBackground(new Background(new BackgroundFill(Color.ORANGE, CornerRadii.EMPTY, Insets.EMPTY)))
        );

        // Scene & Stage
        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("Mood Color Changer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

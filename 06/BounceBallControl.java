import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class BounceBallControl extends Application {

  @Override
  public void start(Stage primaryStage) {
    BallPane ballPane = new BallPane();

    ballPane.setOnMousePressed(e -> ballPane.pause());
    ballPane.setOnMouseReleased(e -> ballPane.play());

    ballPane.setOnKeyPressed(e -> {
      if (e.getCode() == KeyCode.UP) {
        ballPane.increaseSpeed();
      } else if (e.getCode() == KeyCode.DOWN) {
        ballPane.decreaseSpeed();
      }
    });

    Scene scene = new Scene(ballPane, 300, 300);
    primaryStage.setTitle("Bounce Ball Control");
    primaryStage.setScene(scene);
    primaryStage.show();

    ballPane.requestFocus();
  }

}

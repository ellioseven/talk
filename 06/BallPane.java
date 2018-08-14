import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {

  public final double radius = 20;

  private double x = radius, y = radius;

  private double dx = 1, dy = 1;

  private Circle circle = new Circle(x, y, radius);

  private Timeline animation;

  public BallPane() {
    circle.setFill(Color.GREEN);
    getChildren().add(circle);
    KeyFrame keyframe = new KeyFrame(Duration.millis(50), e -> moveBall());
    animation = new Timeline(keyframe);
    animation.setCycleCount(Timeline.INDEFINITE);
    animation.play();
  }

  public void play() {
    animation.play();
  }

  public void pause() {
    animation.pause();
  }

  public void increaseSpeed() {
    double rate = animation.getRate() + 0.1;
    animation.setRate(rate);
  }

  public void decreaseSpeed() {
    double rate = animation.getRate() > 0 ? animation.getRate() - 0.1 : 0;
    animation.setRate(rate);
  }

  public DoubleProperty rateProperty() {
    return animation.rateProperty();
  }

  protected void moveBall() {
    if (x < radius || x > getWidth() - radius) {
      // Change ball move direction.
      dx *= -1;
    }

    if (y < radius || y > getHeight() - radius) {
      // Change ball move direction.
      dy *= -1;
    }

    x += dx;
    y += dy;

    circle.setCenterX(x);
    circle.setCenterY(y);
  }

}

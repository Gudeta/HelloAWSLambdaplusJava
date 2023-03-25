package StreamApiLearn;

import java.util.Objects;

public class Ball {
    BallColor ballColor;
    int radius;
    double weight;

    public Ball(BallColor ballColor, int radius, double weight) {
        this.ballColor = ballColor;
        this.radius = radius;
        this.weight = weight;
    }

    public BallColor getBallColor() {
        return ballColor;
    }

    public int getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    public void setBallColor(BallColor ballColor) {
        this.ballColor = ballColor;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return radius == ball.radius && Double.compare(ball.weight, weight) == 0 && ballColor == ball.ballColor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballColor, radius, weight);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ballColor=" + ballColor +
                ", radius=" + radius +
                ", weight=" + weight +
                '}';
    }
}

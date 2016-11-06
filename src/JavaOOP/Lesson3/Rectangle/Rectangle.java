package JavaOOP.Lesson3.Rectangle;
import static JavaOOP.Lesson3.Rectangle.Validator.checkSize;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        checkSize(width);
        checkSize(height);

        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        checkSize(width);
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        checkSize(height);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

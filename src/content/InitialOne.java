/**
 * Katarzyna Karakow
 * 991627844
 * Assignment 1
 * Feb 5 2021
 */
package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InitialOne extends Stage {

    /** Creates text shape **/
    private final Text text1 = new Text(80, 50, "Katarzyna Karakow");
    private final Font font = new Font("Verdana", 24);

    /** Creates Initial 'K' Shape **/
    //Main rectangle
    private Rectangle rect1 = new Rectangle(75, 100, 50, 350);
    //Central Square rectangle
    private Rectangle rect2 = new Rectangle(130, 250, 50, 50);
    //Up middle rectangle
    private Rectangle rect3 = new Rectangle(180, 200, 50, 50);
    //Down middle rectangle
    private Rectangle rect4 = new Rectangle(180, 300, 50, 50);
    //Up last rectangle
    private Rectangle rect5 = new Rectangle(230, 150, 50, 50);
    //Down middle rectangle
    private Rectangle rect6 = new Rectangle(230, 350, 50, 50);
    //Up circle
    private Circle circ1 = new Circle(300, 125, 30);
    //Down circle
    private Circle circ2 = new Circle(300, 425, 30);

    private Pane pane = new Pane(text1, rect1, rect2, rect3, rect4, rect5, rect6, circ1, circ2);
    private Scene scene = new Scene(pane, 400, 500);

    /**
     * Sets Rectangles, Circles and Text shapes, 
     * and scene
     */
    public InitialOne() {

        setRectangle();
        setCircle();
        setText();
        setScene(scene);
    }

    /**
     * Adds filling and stroke color, 
     * and Sets Stroke width to Rectangles
     */
    private void setRectangle() {

        rect1.setFill(Color.PINK);
        rect1.setStroke(Color.HOTPINK);
        rect1.setStrokeWidth(5);

        rect2.setFill(Color.HOTPINK);
        rect2.setStroke(Color.PINK);
        rect2.setStrokeWidth(5);

        rect3.setFill(Color.PINK);
        rect3.setStroke(Color.HOTPINK);
        rect3.setStrokeWidth(5);

        rect4.setFill(Color.PINK);
        rect4.setStroke(Color.HOTPINK);
        rect4.setStrokeWidth(5);

        rect5.setFill(Color.HOTPINK);
        rect5.setStroke(Color.PINK);
        rect5.setStrokeWidth(5);

        rect6.setFill(Color.HOTPINK);
        rect6.setStroke(Color.PINK);
        rect6.setStrokeWidth(5);
    }

    /**
     * Adds filling and stroke color, 
     * and Sets Stroke width to Circles
     */
    private void setCircle() {

        circ1.setFill(Color.PINK);
        circ1.setStroke(Color.HOTPINK);
        circ1.setStrokeWidth(5);

        circ2.setFill(Color.PINK);
        circ2.setStroke(Color.HOTPINK);
        circ2.setStrokeWidth(5);
    }

    /** Adds filling and font family to text shape */
    private void setText() {

        text1.setFill(Color.BLUE);
        text1.setFont(font);
    }
}

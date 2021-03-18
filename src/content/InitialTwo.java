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
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InitialTwo extends Stage {

    /** Creates text shape **/
    private final Text text1 = new Text(80, 50, "Katarzyna Karakow");
    private final Font font = new Font("Verdana", 24);

    /** Creates Initial 'K' Shape **/
    //Creates llipse shape
    private Ellipse elli1 = new Ellipse(105, 275, 25, 175);
    //Creates upper arc
    private Arc arc1 = new Arc(130, 275, 225, 225, 25, 25);
    //Creaters down arc
    private Arc arc2 = new Arc(130, 275, 225, 225, -25, -25);

    private Pane pane = new Pane(text1, elli1, arc1, arc2);
    private Scene scene = new Scene(pane, 400, 500);

    /**
     * Sets Ellipse, Arcs and Text shapes, and scene
     */
    public InitialTwo() {

        setArc();
        setEllipse();
        setText();
        setScene(scene);
    }

    /**
     * Adds filling and stroke color, 
     * and Sets Stroke width to Ellipse
     */
    private void setEllipse() {
        elli1.setFill(Color.LIGHTBLUE);
        elli1.setStroke(Color.BLUE);
        elli1.setStrokeWidth(5);
    }

    /**
     * Adds filling and stroke color, 
     * and Sets Stroke width to Arcs
     */
    private void setArc() {
        arc1.setFill(Color.BLUE);
        arc1.setStroke(Color.LIGHTBLUE);
        arc1.setStrokeWidth(5);
        arc1.setType(ArcType.ROUND);

        arc2.setFill(Color.BLUE);
        arc2.setStroke(Color.LIGHTBLUE);
        arc2.setStrokeWidth(5);
        arc2.setType(ArcType.ROUND);
    }

    /** Adds filling and font family to text shape **/
    private void setText() {
        text1.setFill(Color.HOTPINK);
        text1.setFont(font);
    }

}

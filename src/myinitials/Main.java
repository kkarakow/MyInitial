/**
 * Katarzyna Karakow
 * 991627844
 * Assignment 1
 * Feb 5 2021
 */
package myinitials;

import content.InitialOne;
import content.InitialTwo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    /** Calls to other two Stages **/
    private InitialOne one = new InitialOne();
    private InitialTwo two = new InitialTwo();

    /**
     * Crates Stages. 
     * Sets stages title and position. 
     * Makes Stages visible.
     */
    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Image");
        //Creates Image and sets it's height and width
        ImageView cat = new ImageView("images/IMG_3478.jpeg");
        cat.setFitHeight(500);
        cat.setFitWidth(400);

        Pane pane = new Pane(cat);
        Scene scene = new Scene(pane, 400, 500);

        //Initial One Stage
        one.setTitle("Initial One");
        one.setResizable(false);
        one.setY(200);
        one.setX(100);
        one.show();
        //Initial Two Stage    
        two.setTitle("Initial Two");
        two.setResizable(false);
        two.setY(200);
        two.setX(525);
        two.show();
        //Primary Stage with Image
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setY(200);
        primaryStage.setX(950);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}

//Brett Fuller
//CSD-402 Assignment 11.2
//3/2/2025
//Used the second example from https://www.geeksforgeeks.org/javafx-flowpane-class/ as a starting point for my script
//Changed it to use a no argument constructor, and used setters to set the orientation and set the gaps.
//Modified the language, added more buttons, and changed their labels.


// Java Program to create a FlowPane
// set its orientation, set the gaps
// add buttons and add it to the stage
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.shape.*;

public class FlowPane_1 extends Application {

    // launch the application
    public void start(Stage stage)
    {

        try {

            // set title for the stage
            stage.setTitle("Brett's FlowPane adapted from Geeks 4 Geeks");

            // create a FlowPane
            FlowPane flow_pane = new FlowPane();

            //Use the setOrientation method to change the orientation.
            flow_pane.setOrientation(Orientation.VERTICAL);

            //Use the setHgap method to change the horrizontal gap between elements
            flow_pane.setHgap(20.0);

            //use the setVgap method to set the vertical gap between elements
            flow_pane.setVgap(20.0);

            // add buttons - updated the example code to create 12 instead of 10
            for (int i = 0; i < 12; i++) {

                // add nodes to the flow pane
                flow_pane.getChildren().add(new Button("Brett's Button "
                        + (int)(i + 1)));
            }

            // create a scene
            Scene scene = new Scene(flow_pane, 400, 300);

            // set the scene
            stage.setScene(scene);

            stage.show();
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}
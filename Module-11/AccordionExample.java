//Brett Fuller
//CSD-402 Assignment 11.2
//3/2/2025

//Used the example from https://jenkov.com/tutorials/javafx/accordion.html as a starting point for my script
//Changed the titles and labels of the panes to more closely resemble the examples given in my report.
//Also switched from using 3 getPanes().add() to using 1 getpanes().addAll().

//This program creates a simple Accordion style layout with 3 expandable nodes.
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        //Create the accordion object.
        Accordion accordion = new Accordion();

        //Create the three titled panes for the three nodes and subnodes on the accordion.
        TitledPane pane1 = new TitledPane("Electronics" , new Label("Show all Electronics categories"));
        TitledPane pane2 = new TitledPane("Grocery"  , new Label("Show all Grocery categories"));
        TitledPane pane3 = new TitledPane("Sporting Goods", new Label("Show all Sporting Goods categories"));

        //add all the Titled panes to the accordion
        accordion.getPanes().addAll(pane1, pane2, pane3);

        //add the accordion to the VBOX
        VBox vBox = new VBox(accordion);
        //add the vbox to the scene
        Scene scene = new Scene(vBox);
        //add the scene to the stage
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
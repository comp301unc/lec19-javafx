package com.comp301.lec19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/** Tutorial adapted from: https://docs.oracle.com/javafx/2/get_started/hello_world.htm */
public class App extends Application {
  @Override
  public void start(Stage stage) {
    // Set the Stage title
    stage.setTitle("Hello, World!");

    // Create a new Pane to hold the UI components
    StackPane pane = new StackPane();

    // Create a Button component
    Button btn = new Button();
    btn.setText("Say 'Hello, World'");
    btn.setOnAction(event -> System.out.println("Hello, World!"));

    // Add the Button to the Pane
    pane.getChildren().add(btn);

    // Set the Scene
    Scene scene = new Scene(pane, 300, 250);
    stage.setScene(scene);

    // Show the Stage on the screen
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}

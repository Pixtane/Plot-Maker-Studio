package com.example.learningfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

public class NewBlockController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public AnchorPane plots;

    protected boolean isDrag = false;
    private int startX;
    private int startY;

    @FXML
    void DropEnded(MouseDragEvent event) {
        System.out.println("Drop Ended");
        Line conector = new Line();
        conector.setStartX(startX);
        conector.setStartY(startY);

        conector.setEndX(event.getSceneX());
        conector.setEndX(event.getSceneY());

        plots.getChildren().add(conector);
    }

    @FXML
    void gradFromDetected(MouseEvent event) {
        System.out.println("Drag Detected");
    }

    @FXML
    void initialize() {

    }

}

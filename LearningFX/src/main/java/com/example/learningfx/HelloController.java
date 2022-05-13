//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.learningfx;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import eu.mihosoft.vrl.workflow.FlowFactory;
import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private AnchorPane plot = new AnchorPane();

    @FXML
    public AnchorPane plots;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void AboutMe(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AboutWindow.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("About GYG");
        stage.setScene(scene);
        stage.show();


    }

    DraggableMaker draggableMaker = new DraggableMaker();

    @FXML
    void AddPlotBlock(ActionEvent event) throws IOException {
        // create a new flow object (see tutorial 1)
        VFlow flow = FlowFactory.newFlow();

        // create a leaf node (see tutorial 1)
        VNode n = flow.newNode();

        // create subflow
        VFlow subflow = flow.newSubFlow();

        // add nodes to the subflow
        VNode sn1 = subflow.newNode();
        VNode sn2 = subflow.newNode();



        AnchorPane card = new AnchorPane();
        card.setMinHeight(100);
        card.setMinWidth(225.0D);
        card.setLayoutX(25);
        card.setLayoutY(25);
        card.setStyle("-fx-background-color: grey");
        draggableMaker.makeDraggable(card);

        /*
        TextArea maintitle = new TextArea();
        maintitle.setMaxSize(200, 50);
        maintitle.setLayoutX(10);
        maintitle.setLayoutY(10);

        Button addPhoto = new Button();
        addPhoto.setLayoutX(10);
        addPhoto.setLayoutY(10);
         */


        //card.getChildren().add(maintitle);

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("PlotBlock.fxml"));
        card.getChildren().addAll((Parent)fxmlLoader2.load());


        plots.getChildren().add(card);
    }

    @FXML
    void CloseProgram(ActionEvent event) {
        this.SaveFileF((ActionEvent)null);
        Platform.exit();
    }

    @FXML
    void NewFile(ActionEvent event) {
        this.SaveFileF((ActionEvent)null);
    }

    @FXML
    void LicenseShow(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LicenseWindow.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Shortcuts");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void OpenFileF(ActionEvent event) {
    }

    @FXML
    void SaveFileF(ActionEvent event) {
    }

    @FXML
    void ShortcutsShow(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ShortCutsWindow.fxml"));
        Scene scene = new Scene((Parent) fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Shortcuts");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void initialize() {
        assert plots != null : "fx:id=\"plots\" was not injected: check your FXML file 'hello-view.fxml'.";

    }
}
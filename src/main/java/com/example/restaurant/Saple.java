package com.example.restaurant;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Saple {


    void ErrorPassOrName(String message) throws FileNotFoundException {
        Stage stage = new Stage();
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");
        Text text = new Text(message + ", try again!");
        text.setFill(Color.WHITE);
        HBox hBox = new HBox(8,text);
        hBox.setAlignment(Pos.CENTER);
        HBox hBox1 = new HBox(8, ok, cancel);
        hBox1.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(25, hBox,hBox1);
        vBox.setAlignment(Pos.CENTER);
        StackPane stackPane = new StackPane(vBox);
        stackPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(stackPane,450, 200);
        text.setStyle("-fx-font-weight: 500;-fx-font-size: 14");
        ok.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-radius: 7px;-fx-background-radius: 7px; -fx-border-color: black");
        cancel.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-radius: 7px;-fx-background-radius: 7px;-fx-border-color: black");
        stackPane.setStyle("-fx-background-color: #061251");
        stage.setScene(scene);
        stage.show();
        ok.setOnAction(e -> {
            Stage stage1 = (Stage) ok.getScene().getWindow();
            stage1.close();

        });
        cancel.setOnAction(e -> {
            Stage stage1 = (Stage) cancel.getScene().getWindow();
            stage1.close();
        });
    }

}

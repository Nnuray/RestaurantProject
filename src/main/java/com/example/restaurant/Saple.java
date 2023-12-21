package com.example.restaurant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Saple {
    @FXML
    private Pane pane;



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

    @FXML
    VBox vbox;
@FXML
GridPane grid;

    @FXML
    void reservationClicked(ActionEvent event) {
        VBox h = new VBox();
        Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\red wine.png");
        ImageView i = new ImageView(img);
        i.setFitHeight(200);
        i.setFitWidth(200);
        h.setSpacing(30);
        Text text = new Text("isbvhuabcliwa");
        text.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                "    -fx-font-size: 40px;\n" +
                "    -fx-font-weight: regular;");
        h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
        h.getChildren().addAll(i,text);
        h.setLayoutX(100);
        grid.getChildren().add(h);
    }


    public void italianClicked(ActionEvent event) {
        VBox h = new VBox();
        Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\PROSECCO.jpg");
        ImageView i = new ImageView(img);
        i.setFitHeight(200);
        i.setFitWidth(200);
        h.setSpacing(30);
        Text text = new Text("isbvhuabcliwa");
        text.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                "    -fx-font-size: 40px;\n" +
                "    -fx-font-weight: regular;");
        h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
        h.getChildren().addAll(i,text);


    }

    public void chineseClicked(ActionEvent event) {
    }

    public void ordersClicked(ActionEvent event) {
    }

    public void contacUsClicked(ActionEvent event) {
    }
}

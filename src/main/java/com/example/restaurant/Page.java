package com.example.restaurant;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Page {

        @FXML
        private Text amount;

        @FXML
        private Text amount1;

        @FXML
        private Text amount11;

        @FXML
        private Text amount111;

        @FXML
        private Text amount1111;

        @FXML
        private Text amount12;

        @FXML
        private Text amount121;

        @FXML
        private Text amount122;

        @FXML
        private Text amount123;

        @FXML
        private Text amount124;

        @FXML
        private Text amount125;

        @FXML
        private Text amount1251;

        @FXML
        private Text amount1252;

        @FXML
        private Text amount12521;

        @FXML
        private Text amount12522;

        @FXML
        private Text amount1253;

        @FXML
        private Button bolognese3050;

        @FXML
        private BorderPane border;

        @FXML
        private Button calamari3000;

        @FXML
        private Button chicken2450;

        @FXML
        private Button chinese;

        @FXML
        private ScrollPane chinesePane;

        @FXML
        private Button coke600;

        @FXML
        private Button contacUs;

        @FXML
        private Button drinks;

        @FXML
        private ScrollPane drinksPane;

        @FXML
        private Button dumplings2300;

        @FXML
        private Button fish2500;

        @FXML
        private Button italian;

        @FXML
        private ScrollPane italianPane;

        @FXML
        private Pane coke;

        @FXML
        private Pane sorrel;

        @FXML
        private Button lemonade700;

        @FXML
        private Button lobster2520;

        @FXML
        private Button minus;

        @FXML
        private Button minus1;

        @FXML
        private Button minus11;

        @FXML
        private Button minus111;

        @FXML
        private Button minus1111;

        @FXML
        private Button minus12;

        @FXML
        private Button minus121;

        @FXML
        private Button minus122;

        @FXML
        private Button minus123;

        @FXML
        private Button minus124;

        @FXML
        private Button minus125;

        @FXML
        private Button minus1251;

        @FXML
        private Button minus1252;

        @FXML
        private Button minus12521;

        @FXML
        private Button minus12522;

        @FXML
        private Button minus1253;

        @FXML
        private Button mojito750;

        @FXML
        private Button noodles3200;

        @FXML
        private Button orders;

        @FXML
        private Button plus;

        @FXML
        private Button plus1;

        @FXML
        private Button plus11;

        @FXML
        private Button plus111;

        @FXML
        private Button plus1111;

        @FXML
        private Button plus12;

        @FXML
        private Button plus121;

        @FXML
        private Button plus122;

        @FXML
        private Button plus123;

        @FXML
        private Button plus124;

        @FXML
        private Button plus125;

        @FXML
        private Button plus1251;

        @FXML
        private Button plus1252;

        @FXML
        private Button plus12521;

        @FXML
        private Button plus12522;

        @FXML
        private Button plus1253;

        @FXML
        private Button pollo2900;

        @FXML
        private Button prosecco900;

        @FXML
        private Button reservation;

        @FXML
        private Button salmon2700;

        @FXML
        private Button sorrel450;

        @FXML
        private Button tea500;

        @FXML
        private Button tofu2600;

        @FXML
        private VBox vbox;

        @FXML
        private ScrollPane ordersPane;

        @FXML
        void bolognese3050Clicked(ActionEvent event) {

        }

        @FXML
        void calamari3000Clicked(ActionEvent event) {

        }

        @FXML
        void chicken2450Clicked(ActionEvent event) {

        }

        @FXML
        void chineseClicked(ActionEvent event) {
             border.setCenter(chinesePane);
        }

        @FXML
        void coke600Clicked(ActionEvent event) {
                HBox hbox = new HBox();
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\2160Antons_0922_LizClayman_00118.jpg");
                imageView.setImage(img);
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                hbox.getChildren().add(imageView);
                vbox.setSpacing(10);
                vbox.getChildren().add(hbox);
        }

        @FXML
        void contacUsClicked(ActionEvent event) {

        }

        @FXML
        void drinksClicked(ActionEvent event) {
                border.setCenter(drinksPane);
        }

        @FXML
        void dumplings2300Clicked(ActionEvent event) {
                HBox hbox = new HBox();
                ImageView imageView = new ImageView();
                hbox.setStyle("-fx-background-color:purple");
                hbox.setMaxSize(300,200);
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\7789Antons_0922_LizClayman_00011.jpg");
                imageView.setImage(img);
                imageView.setFitWidth(100);
                imageView.setFitHeight(100);
                hbox.getChildren().add(imageView);
                vbox.setSpacing(10);
                vbox.getChildren().addAll(hbox);

        }

        @FXML
        void fish2500Clicked(ActionEvent event) {

        }

        @FXML
        void italianClicked(ActionEvent event) {
        border.setCenter(italianPane);
        }

        @FXML
        void lemonade700Clicked(ActionEvent event) {
        }

        @FXML
        void lobster2520Clicked(ActionEvent event) {

        }

        @FXML
        void minusClicked(ActionEvent event) {

        }

        @FXML
        void mojito750Clicked(ActionEvent event) {

        }

        @FXML
        void noodles3200Clicked(ActionEvent event) {

        }

        @FXML
        void ordersClicked(ActionEvent event) {
                border.setCenter(ordersPane);

        }

        @FXML
        void plusClicked(ActionEvent event) {

        }

        @FXML
        void pollo2900Clicked(ActionEvent event) {

        }

        @FXML
        void prosecco900Clicked(ActionEvent event) {

        }

        @FXML
        void reservationClicked(ActionEvent event) {

        }

        @FXML
        void salmon2700Clicked(ActionEvent event) {

        }

        @FXML
        void sorrel450Clicked(ActionEvent event) {
                vbox.getChildren().add(sorrel);

        }

        @FXML
        void tea500Clicked(ActionEvent event) {

        }

        @FXML
        void tofu2600Clicked(ActionEvent event) throws FileNotFoundException {
       ErrorPassOrName("Added to the Cart");
        }

        void ErrorPassOrName(String message) throws FileNotFoundException {
                Stage stage = new Stage();
                Button ok = new Button("OK");
                Button cancel = new Button("Cancel");
                Text text = new Text(message);
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

        //sdfcds

    }





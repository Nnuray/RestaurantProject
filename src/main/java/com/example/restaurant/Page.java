package com.example.restaurant;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Page implements Menu{

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
        private Button mojito750;

        @FXML
        private Button noodles3200;

        @FXML
        private Button orders;

        @FXML
        private Button pollo2900;

        @FXML
        private Button prosecco900;


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

        private int total;


        List<MenuItem> list = new ArrayList<>();


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
               ProgressBar p = new ProgressBar(0);
                Timeline task = new Timeline(
                        new KeyFrame(
                                Duration.ZERO,
                                new KeyValue(p.progressProperty(), 0)
                        ),
                        new KeyFrame(
                                Duration.seconds(2),
                                new KeyValue(p.progressProperty(), 1)
                        )
                );
                task.playFromStart();
                MenuItem m = new MenuItem("dumplings",2300,1);
                list.add(m);
                BaseRestaurant b = new BaseRestaurant();
                int x = b.calculateTotal(list);
                Text text = new Text(String.valueOf(x));
                text.setLayoutX(23);
                vbox.setSpacing(10);
                vbox.getChildren().addAll(hbox,p,text);





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
        }



        //sdfcds

    }





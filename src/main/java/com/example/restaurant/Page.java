package com.example.restaurant;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
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
                MenuItem m = new MenuItem(new Text("Calamri"),600,1);
                HBox h = new HBox();
                h.setMaxSize(300,300);
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\chinese.png");
                ImageView i = new ImageView(img);
                i.setFitHeight(200);
                i.setFitWidth(250);
                h.setSpacing(20);
                Insets buttonInsets = new Insets(100, 20, 10, 20);;
                Text price = new Text(String.valueOf(m.getPrice()));
                m.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                Button cancel = new Button("cancel");
                cancel.setStyle("-fx-font-size:10px");
                cancel.setPrefSize(50,50);
                h.setMargin(cancel,buttonInsets);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;" + "-fx-font-size:15px;");
                h.getChildren().addAll(i,m.getName(),cancel,price);
                h.setLayoutX(50);

                vbox.getChildren().add(h);
        }

        @FXML
        void chicken2450Clicked(ActionEvent event) {
                HBox hbox = new HBox();
             Pane pane = new Pane();
             pane.setMaxWidth(400);
             pane.setMaxHeight(200);
             pane.setStyle("-fx-border-color:black");
             hbox.getChildren().add(pane);
             vbox.getChildren().add(hbox);

        }

        @FXML
        void chineseClicked(ActionEvent event) {
             border.setCenter(chinesePane);
        }

        @FXML
        void coke600Clicked(ActionEvent event) {
                MenuItem m = new MenuItem(new Text("Coke"),600,1);
                HBox h = new HBox();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\red wine.png");
                ImageView i = new ImageView(img);
                i.setFitHeight(200);
                i.setFitWidth(200);
                h.setSpacing(30);
                m.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                Button cancel = new Button("cancel");
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                h.getChildren().addAll(i,m.getName(),cancel);
                h.setLayoutX(50);

                vbox.getChildren().add(h);


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
//                MenuItem m = new MenuItem("dumplings",2300,1);
//                list.add(m);
                BaseRestaurant b = new BaseRestaurant();
                int x = b.calculateTotal(list);
                Text text = new Text(String.valueOf(x));
                text.setLayoutX(23);
                vbox.setSpacing(10);
                vbox.getChildren().addAll(hbox,p,text);





        }

        @FXML
        void fish2500Clicked(ActionEvent event) {
//                MenuItem m = new MenuItem("fish",2500,1);


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





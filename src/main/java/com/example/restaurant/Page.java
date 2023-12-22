package com.example.restaurant;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
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


public class Page implements Observer{


        @FXML
        private TextField customer;

        @FXML
        private BorderPane border;

        @FXML
        private ScrollPane chinesePane;


        @FXML
        private ScrollPane drinksPane;

        @FXML
        private ScrollPane italianPane;

        @FXML
        private VBox vbox;

        @FXML
        private ScrollPane ordersPane;

        private int total;

        @FXML
        private Text totalText;
        @FXML
        private VBox lastVbox;
        @FXML
        private ScrollPane payementScroll;



        List<MenuItem> list = new ArrayList<>();


        @FXML
        void bolognese3050Clicked(ActionEvent event) {
                CuisineFactory bologneseFactory  = new ItalianCuisineFactory();
                bologneseFactory.createCuisine("Bolognese",3050);
                MenuItem bolognese = new MenuItem(new Text("Bolognese"),3050,bologneseFactory);
                list.add(bolognese);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\bolognese.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("3050");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(bolognese);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                bolognese.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(bolognese.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }

        @FXML
        void calamari3000Clicked(ActionEvent event) {
                CuisineFactory calamariFactory  = new ItalianCuisineFactory();
                calamariFactory.createCuisine("Calamari",3000);
                MenuItem calamari = new MenuItem(new Text("Calamari"),3000,calamariFactory);
                list.add(calamari);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\image.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("3000");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(calamari);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                calamari.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(calamari.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }

        @FXML
        void chicken2450Clicked(ActionEvent event) {
                CuisineFactory chickenFactory  = new ChineseCuisineFactory();
                chickenFactory.createCuisine("Fried Chicken",2450);
                MenuItem chicken = new MenuItem(new Text("Fried Chicken"),2450,chickenFactory);
                list.add(chicken);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\chinese.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2450");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(chicken);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                chicken.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(chicken.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);

        }

        @FXML
        void chineseClicked(ActionEvent event) {
             border.setCenter(chinesePane);
        }

        @FXML
        void coke600Clicked(ActionEvent event) {
                DrinksFactory cokeFactory  = new DietCokeFactory();
                MenuItem coke = new MenuItem(new Text("Coke"),600,cokeFactory);
                list.add(coke);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\diet coke.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("600");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(coke);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                coke.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(coke.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);


        }

        @FXML
        void drinksClicked(ActionEvent event) {
                border.setCenter(drinksPane);
        }

        @FXML
        void dumplings2300Clicked(ActionEvent event) {
                CuisineFactory dumplingsFacory  = new ChineseCuisineFactory();
                dumplingsFacory.createCuisine("Dumplings",2300);
                MenuItem dumplings = new MenuItem(new Text("Dumplings"),2300,dumplingsFacory);
                list.add(dumplings);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\chinese2.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2300");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(dumplings);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                dumplings.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(dumplings.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);




        }

        @FXML
        void fish2500Clicked(ActionEvent event) {
                CuisineFactory fishFactory  = new ChineseCuisineFactory();
                fishFactory.createCuisine("Fish Soup",2500);
                MenuItem fish = new MenuItem(new Text("Fish Soup"),2500,fishFactory);
                list.add(fish);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\fish.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2500");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(fish);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                fish.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(fish.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);


        }

        @FXML
        void italianClicked(ActionEvent event) {
        border.setCenter(italianPane);
        }

        @FXML
        void lemonade700Clicked(ActionEvent event) {
                DrinksFactory lemonadeFactory  = new LemonadeFactory();
                MenuItem lemonade = new MenuItem(new Text("Lemonade"),700,lemonadeFactory);
                list.add(lemonade);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\brownlemonade.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("700");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(lemonade);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                lemonade.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(lemonade.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }

        @FXML
        void lobster2520Clicked(ActionEvent event) {
                CuisineFactory lobsterFactory  = new ItalianCuisineFactory();
                lobsterFactory.createCuisine("Lobster",2520);
                MenuItem lobster = new MenuItem(new Text("Lobster Bisque"),2520,lobsterFactory);
                list.add(lobster);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\image (1).png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2520");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(lobster);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                lobster.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(lobster.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);

        }

        @FXML
        void mojito750Clicked(ActionEvent event) {
                DrinksFactory mojito  = new MojitoFactory();
                MenuItem mmojito = new MenuItem(new Text("Mojito"),750,mojito);
                list.add(mmojito);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\MOJITO.jpg");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text name = new Text("Mojito");
                Text price = new Text("750");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(mmojito);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                     "-fx-border-radius:20px;\n" +
                     "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                name.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                  "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(name,price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);

        }

        @FXML
        void noodles3200Clicked(ActionEvent event) {
                CuisineFactory noodlesFactory  = new ChineseCuisineFactory();
                noodlesFactory.createCuisine("Noodles",3200);
                MenuItem noodles = new MenuItem(new Text(" Lo Mein Noodles"),3200,noodlesFactory);
                list.add(noodles);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\boiled.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("3200");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(noodles);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                noodles.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(noodles.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);

        }

        @FXML
        void ordersClicked(ActionEvent event) {
                border.setCenter(ordersPane);

        }


        @FXML
        void pollo2900Clicked(ActionEvent event) {
                CuisineFactory polloFactory  = new ItalianCuisineFactory();
                polloFactory.createCuisine("Pollo Al Forno",2900);
                MenuItem pollo = new MenuItem(new Text("Pollo Al Forno"),2900,polloFactory);
                list.add(pollo);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\image (2).png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2900");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(pollo);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                pollo.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(pollo.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);

        }

        @FXML
        void prosecco900Clicked(ActionEvent event) {
                DrinksFactory proseccoFactory  = new ProseccoFactory();
                MenuItem prosecco = new MenuItem(new Text("Prosecco"),900,proseccoFactory);
                list.add(prosecco);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\PROSECCO.jpg");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("900");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(prosecco);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                prosecco.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(prosecco.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }


        @FXML
        void salmon2700Clicked(ActionEvent event) {
                CuisineFactory salmonFactory  = new ItalianCuisineFactory();
                salmonFactory.createCuisine("Salmon Salad",2700);
                MenuItem salmon = new MenuItem(new Text("Salmon Salad"),2700,salmonFactory);
                list.add(salmon);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\image (4).png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2700");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(salmon);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                salmon.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(salmon.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }

        @FXML
        void sorrel450Clicked(ActionEvent event) {
                DrinksFactory sorrelFactory  = new SorrelFactory();
                MenuItem sorrel = new MenuItem(new Text("Sorrel"),450,sorrelFactory);
                list.add(sorrel);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\sm.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("450");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(sorrel);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                sorrel.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(sorrel.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);

        }

        @FXML
        void tea500Clicked(ActionEvent event) {
                DrinksFactory icedTeaFactory  = new IcedTeaFactory();
                MenuItem iced = new MenuItem(new Text("Iced Tea"),500,icedTeaFactory);
                list.add(iced);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("CC:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\tea.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("500");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(iced);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                iced.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(iced.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }

        @FXML
        void tofu2600Clicked(ActionEvent event) throws FileNotFoundException {
                CuisineFactory tofuFactory  = new ChineseCuisineFactory();
                tofuFactory.createCuisine("Tofu",2600);
                MenuItem tofu = new MenuItem(new Text("Tofu"),2600,tofuFactory);
                list.add(tofu);
                VBox v = new VBox();
                HBox h = new HBox();
                h.setStyle("-fx-border-color:black;"+"-fx-border-radius:10px");
                ImageView imageView = new ImageView();
                Image img = new Image("CC:\\Users\\ПК\\IdeaProjects\\Restaurant\\src\\main\\resources\\com\\example\\restaurant\\tofu.png");
                imageView.setImage(img);
                imageView.setFitWidth(270);
                imageView.setFitHeight(180);
                Text price = new Text("2600");
                Button cancel = new Button("Cancel");
                cancel.setPrefSize(100,35);
                cancel.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                                vbox.getChildren().remove(h);
                                list.remove(tofu);
                        }
                });
                cancel.setStyle("-fx-background-color:fffff;\n" +
                        "-fx-border-radius:20px;\n" +
                        "-fx-border-color:gray;");
                cancel.setLayoutX(100);
                tofu.getName().setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                price.setStyle("  -fx-font-family: \"Berlin Sans FB\", sans-serif;\n" +
                        "    -fx-font-size: 40px;\n" +
                        "    -fx-font-weight: regular;");
                h.setSpacing(10);
                v.setSpacing(7);
                vbox.setSpacing(10);
                v.getChildren().addAll(tofu.getName(),price,cancel);
                h.getChildren().addAll(imageView,v);
                vbox.getChildren().add(h);
        }

        @FXML
        void payementClicked(ActionEvent event) {
                Cart c = new BaseRestaurant();
                total = c.calculateTotal(list);
                totalText.setText("Total: " + total);
                border.setCenter(payementScroll);

        }

        @FXML
        void payClicked(ActionEvent event) {
                ProgressBar p = new ProgressBar(0);
                Timeline task = new Timeline(
                        new KeyFrame(
                                Duration.ZERO,
                                new KeyValue(p.progressProperty(), 0)
                        ),
                        new KeyFrame(
                                Duration.seconds(4),
                                new KeyValue(p.progressProperty(), 1)
                        )
                );
                p.setPrefSize(300,30);
                task.playFromStart();
                lastVbox.getChildren().add(p);
                lastVbox.setLayoutX(220);
                p.progressProperty().addListener(new ChangeListener<Number>() {
                        @Override
                        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                                // Check if the progress is complete (1.0)
                                if (newValue.doubleValue() >= 1.0) {
                                        // Update the status label or perform any post-progress completion action
                                        foodIsDone(list,customer.getText() + ",your Food Is done");

                                        // You can append text, update UI, or trigger any other actions here
                                }
                        }
                });

        }

        @Override
        public void foodIsDone(List<MenuItem> list,String message) {
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
                text.setStyle("-fx-background-color:white;-fx-font-weight: 500;-fx-font-size: 14");
                ok.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-radius: 7px;-fx-background-radius: 7px; -fx-border-color: black");
                cancel.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-radius: 7px;-fx-background-radius: 7px;-fx-border-color: black");
                stackPane.setStyle("-fx-background-color: brown");
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





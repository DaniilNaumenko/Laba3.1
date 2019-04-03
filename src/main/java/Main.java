/*import People.*;
import Object.Food;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

*//**
 * lab 2.
 * Chef can cook and eat food.
 * The programmer can write code and eat.
 * After the meal, both return the taste of the food they ate.
 * The Main class creates a graphical user interface.
 * @since 30.03.2019
 * @author Naumenka Daniil *//*
public class Main extends Application {

    *//**
     * Entry Point
     * @param args command line arguments (not used)
     *//*
    public static void main (String[] args) {
        Application.launch(args);
    }

    *//**
     * Creature GUI
     * @param primaryStage начальная сцена приложения
     *//*
    @Override
    public void start (Stage primaryStage) {
        final Proger proger = new Proger ("Юрий Луцик");
        final Cook cook = new Cook ("тамара Семёновна");
        final Farmer farmer = new Farmer ("Семён Семёныч");

        final ArrayList<Food> foodList = new ArrayList<Food>();

        HBox root = new HBox();
        VBox Vcook = new VBox();
        VBox Vproger = new VBox();
        VBox Vfarmer = new VBox();

        Button Bcook = new Button("Приготовить!");
        Button BeatProger = new Button("Скушать!");
        Button BeatCook = new Button("Скушать!");
        Button Bcode = new Button ("Кодить!");
        Button Bplant = new Button("Посадить");
        Button Bwater = new Button ("Полить");
        Button Bcollect = new Button ("Собрать урожай");
        Button BeatFarmer = new Button ("Скушать");

        Bcook.setMinWidth(150);
        BeatProger.setMinWidth(150);
        BeatCook.setMinWidth(150);
        Bcode.setMinWidth(150);
        Bplant.setMinWidth(150);
        Bwater.setMinWidth(150);
        Bcollect.setMinWidth(150);
        BeatFarmer.setMinWidth(150);

        final Label planted = new Label("Посажено овощей: 0");
        final Label watered = new Label("Посажено и полито: 0");
        final Label collected = new Label ("Собрано урожая: 0");
        final TextField TfoodName = new TextField("");
        TfoodName.setPrefSize(150, 15);

        final TextArea console = new TextArea("Ваш код будет туть");
        console.setPrefSize(150, 200);
        console.setFont(new Font("Courier New", 12));
        console.setWrapText(true);

        final ListView<String> ListFood = new ListView<String>();
        ListFood.setPrefSize(150, 200);
        final ObservableList<String> List = FXCollections.observableArrayList();

        Vcook.getChildren().addAll (ListFood, TfoodName, Bcook, BeatCook);
        Vproger.getChildren().addAll(console, Bcode, BeatProger);
        Vfarmer.getChildren().addAll(planted, watered, collected, Bplant, Bwater, Bcollect, BeatFarmer);
        root.getChildren().addAll(Vcook, Vproger, Vfarmer);

        Bcook.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (TfoodName.getText().equals("")||farmer.getVegetSize()==0) {
                    ShowFoodAlert();
                    throw new IllegalArgumentException(" вы не ввели название блюда или фермер не вырастил урожай");
                }
                else {
                    cook.cook(foodList, TfoodName.getText(), farmer.getLast());
                    List.add (TfoodName.getText());
                    farmer.deleteVeget();
                    ListFood.setItems(List);
                    TfoodName.setText("");
                    collected.setText("Собрано урожая: "+ farmer.getVegetSize());
                }
            }
        }));
        //проверка на нажатие кнопки кушать
        BeatCook.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
            *//*if (foodList.isEmpty()) {
                throw new IllegalArgumentException("список блюд пуст, увы");
            }
            else {*//*
                cook.eat(foodList);
                List.remove(List.size() - 1);
                ListFood.setItems(List);
               *//* }*//*
            }
        }));
        BeatFarmer.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                *//*if (foodList.isEmpty()) {
                    throw new IllegalArgumentException("список блюд пуст, увы");
                }
                else{*//*
                        farmer.eat(foodList);
                        List.remove(List.size() - 1);
                        ListFood.setItems(List);

               *//* }*//*
            }
        }));
        BeatProger.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                *//*if (foodList.isEmpty()) {
                    throw new IllegalArgumentException("список блюд пуст, увы");
                }
                    else {*//*
                    proger.eat(foodList);
                    List.remove(List.size() - 1);
                    ListFood.setItems(List);
                *//*}*//*
            }
        }));
        *//*EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
             *//**//*   if (foodList.isEmpty()) {
                    throw new IllegalArgumentException("список блюд пуст, увы");
                }
                else {*//**//*
                    cook.eat(foodList);
                    List.remove(List.size() - 1);
                    ListFood.setItems(List);
               *//**//* }*//**//*
            }
        };

        BeatCook.setOnMouseClicked(eventHandler);
        BeatFarmer.setOnMouseClicked(eventHandler);
        BeatProger.setOnMouseClicked(eventHandler);*//*

        Bcode.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                console.setText(proger.coding());
            }
        }));
        TfoodName.setOnKeyPressed((new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode()== KeyCode.ENTER) {
                    *//*if (TfoodName.getText().equals("") || farmer.getVegetSize()==0) {
                        ShowFoodAlert();
                        throw new IllegalArgumentException(" voy voy");
                    }*//*
                    *//*else {*//*
                        cook.cook(foodList ,TfoodName.getText(), farmer.getLast());
                        List.add (TfoodName.getText());
                        farmer.deleteVeget();
                        TfoodName.setText("");
                        ListFood.setItems(List);
                        collected.setText("Собрано урожая: "+ farmer.getVegetSize());
                   *//* }*//*
                }
            }
        }));

        Bplant.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                farmer.plant();
                planted.setText("Посажено овощей: "+ farmer.getPlanted());
            }
        }));
        Bwater.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                farmer.water();
                watered.setText("Посажено и полито: "+ farmer.getWatered());
                planted.setText("Посажено овощей: "+ farmer.getPlanted());
            }
        }));
        Bcollect.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                farmer.collect();
                watered.setText("Посажено и полито: "+ farmer.getWatered());
                planted.setText("Посажено овощей: "+ farmer.getPlanted());
                collected.setText("Собрано урожая: "+ farmer.getVegetSize());
            }
        }));
        Scene scene = new Scene (root);
        primaryStage.setTitle("Laba 3");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void ShowFoodAlert() {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle ("А-та-та");
        alert.setHeaderText(null);
        alert.setContentText("непорядок! введите название блюда или дождитесь пока фермер выростит овощи");
        alert.showAndWait();
    }

}*/
/////////////////////////////////////////////////////////////////
import People.*;
        import Object.Food;


        import javafx.application.Application;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.EventHandler;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.scene.input.KeyCode;
        import javafx.scene.input.KeyEvent;
        import javafx.scene.input.MouseEvent;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.VBox;
        import javafx.scene.text.Font;
        import javafx.stage.Stage;

        import java.util.ArrayList;

/**
 * lab 3.
 * Chef can cook and eat food.
 * The programmer can write code and eat.
 * After the meal, both return the taste of the food they ate.
 * The Main class creates a graphical user interface.
 * @since 30.03.2019
 * @author Naumenka Daniil*/
public class Main extends Application {

    /**
 * Entry Point
 * @param args command line arguments (not used)
 */
    public static void main (String[] args) {
        Application.launch(args);
    }

   /**
 * Creature GUI
 * @param primaryStage initial scene of the application
*/
    @Override
    public void start (Stage primaryStage) {
        final Proger proger = new Proger ("");
        final Cook cook = new Cook ("");
        final Farmer farmer = new Farmer ("");

        final ArrayList<Food> foodList = new ArrayList<Food>();

        HBox root = new HBox();
        VBox Vcook = new VBox();
        VBox Vproger = new VBox();
        VBox Vfarmer = new VBox();

        Button Bcook = new Button("To cook");
        Button BeatProger = new Button("To eat");
        Button BeatCook = new Button("To eat");
        Button Bcode = new Button ("Code");
        Button Bplant = new Button("Plant");
        Button Bwater = new Button ("Water");
        Button Bcollect = new Button ("Harvesting");
        Button BeatFarmer = new Button ("To eat");

        Bcook.setMinWidth(150);
        BeatProger.setMinWidth(150);
        BeatCook.setMinWidth(150);
        Bcode.setMinWidth(150);
        Bplant.setMinWidth(150);
        Bwater.setMinWidth(150);
        Bcollect.setMinWidth(150);
        BeatFarmer.setMinWidth(150);

        final Label planted = new Label("Planted vegetables: 0");
        final Label watered = new Label("Planted and watered: 0");
        final Label collected = new Label ("Harvest: 0");
        final TextField TfoodName = new TextField("");
        TfoodName.setPrefSize(150, 15);

        final TextArea console = new TextArea("Here you can write code");
        console.setPrefSize(150, 200);
        console.setFont(new Font("Courier New", 12));
        console.setWrapText(true);

        final ListView<String> ListFood = new ListView<String>();
        ListFood.setPrefSize(150, 200);
        final ObservableList<String> List = FXCollections.observableArrayList();

        Vcook.getChildren().addAll (ListFood, TfoodName, Bcook, BeatCook);
        Vproger.getChildren().addAll(console, Bcode, BeatProger);
        Vfarmer.getChildren().addAll(planted, watered, collected, Bplant, Bwater, Bcollect, BeatFarmer);
        root.getChildren().addAll(Vcook, Vproger, Vfarmer);

        Bcook.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (TfoodName.getText().equals("")||farmer.getVegetSize()==0) {
                    ShowFoodAlert();
                    throw new IllegalArgumentException("You didn't enter the name of the dish or the farmer didn't grow a crop");
                }
                else {
                    cook.cook(foodList, TfoodName.getText(), farmer.getLast());
                    List.add (TfoodName.getText());
                    farmer.deleteVeget();
                    ListFood.setItems(List);
                    TfoodName.setText("");
                    collected.setText("Harvest: "+ farmer.getVegetSize());
                }
            }
        }));

        BeatCook.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                cook.eat(foodList);
                List.remove(List.size() - 1);
                ListFood.setItems(List);
            }
        }));
        BeatFarmer.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                farmer.eat(foodList);
                List.remove(List.size() - 1);
                ListFood.setItems(List);
            }
        }));
        BeatProger.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                proger.eat(foodList);
                List.remove(List.size() - 1);
                ListFood.setItems(List);
            }
        }));

        Bcode.setOnMouseClicked((new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                console.setText(proger.coding());
            }
        }));
        TfoodName.setOnKeyPressed((new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode()== KeyCode.ENTER) {
                    cook.cook(foodList ,TfoodName.getText(), farmer.getLast());
                    List.add (TfoodName.getText());
                    farmer.deleteVeget();
                    TfoodName.setText("");
                    ListFood.setItems(List);
                    collected.setText("Harvest: "+ farmer.getVegetSize());
                }
            }
        }));

        Bplant.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                farmer.plant();
                planted.setText("Vegetables planted: "+ farmer.getPlanted());
            }
        }));
        Bwater.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                farmer.water();
                watered.setText("Planted and watered: "+ farmer.getWatered());
                planted.setText("Vegetables planted: "+ farmer.getPlanted());
            }
        }));
        Bcollect.setOnMouseClicked((new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                farmer.collect();
                watered.setText("Planted and watered: "+ farmer.getWatered());
                planted.setText("Vegetables planted: "+ farmer.getPlanted());
                collected.setText("Harvest: "+ farmer.getVegetSize());
            }
        }));
        Scene scene = new Scene (root);
        primaryStage.setTitle("Laba 3");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private void ShowFoodAlert() {
        Alert alert = new Alert (Alert.AlertType.INFORMATION);
        alert.setTitle ("How is that?");
        alert.setHeaderText(null);
        alert.setContentText("Disorder! Enter a dish name or let the farmer grow vegetables.");
        alert.showAndWait();
    }
}

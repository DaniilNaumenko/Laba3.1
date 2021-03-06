package com.people.tasting;

import сooking.facilities.com.Food;
import javafx.scene.control.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Programmer extends Human {
    private static final int RAND_SIZE = 150;
    private final int MIN_RAND = 50;
    private final String alphabet = ("QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890(){}[]<>=!,");

    public Programmer() {
        super();
    }

    public Programmer(String name) {
        super (name);
    }

    @Override
    void eat(List<Food> foodList) {

    }

    public String coding() {
        int size = new Random().nextInt(RAND_SIZE) + MIN_RAND;
        String code = "";
        for (int i=0; i<size; i++) {
            char next_symbol = alphabet.charAt (new Random().nextInt(alphabet.length()));
            code += next_symbol;
        }
        return code;
    }

    public void eat(ArrayList<Food> foodList) {
        if (foodList == null || foodList.isEmpty()) {
            throw new IllegalArgumentException("The list of dishes is empty");
        } else {
            Food f = foodList.get(foodList.size() - 1);
            foodList.remove(foodList.size() - 1);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Delicious");
            alert.setHeaderText(null);
            alert.setContentText("It seems to taste this dish: " + f.tasteToString().toLowerCase() + "\n" +
                    "It was delicious, I will go on to create code");
            alert.showAndWait();
        }
    }
}


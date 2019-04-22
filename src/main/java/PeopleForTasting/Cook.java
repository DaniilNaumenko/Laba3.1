package PeopleForTasting;

import List.Taste;
import CookingFacilities.Food;
import CookingFacilities.Veget;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cook extends Human {
    public Cook() {
        super();
    }

    public Cook (String name) {
        super (name);
    }

    public void cook (List<Food> foods, String name, Veget veget) {
        int rand = new Random().nextInt(4);
        Food f = new Food(name);
        switch (rand) {
            case 0: f.setTaste(Taste.SWEET); break;
            case 1: f.setTaste(Taste.SOUR); break;
            case 2: f.setTaste(Taste.SALTY); break;
            case 3: f.setTaste(Taste.BITTER); break;
        }
        f.setVeget(veget);
        foods.add(f);
    }

    public void eat(List<Food> foodList) {
        if (foodList == null||foodList.isEmpty()) {
            throw new IllegalArgumentException("The list of dishes is empty");
        }
        else {
                Food f = foodList.get(foodList.size() - 1);
                foodList.remove(foodList.size() - 1);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Delicious");
                alert.setHeaderText(null);
                alert.setContentText("It seems to taste this dish: " + f.tasteToString().toLowerCase() + "\n" +
                        "Vegetable: " + f.getVeget().vegetableToString().toLowerCase() + ", Dish color: " + f.getVeget().colorToString().toLowerCase() + "\n" +
                        "Next time add salt");
                alert.showAndWait();
            }
            }
}

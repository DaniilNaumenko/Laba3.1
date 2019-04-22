package PeopleForTasting;

import CookingFacilities.Food;
import CookingFacilities.Veget;
import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Human {


    private int planted;
    private int watered;
    private ArrayList<Veget> vegetable = new ArrayList<Veget>();

    public int getVegetSize() {
        return vegetable.size();
    }

    public int getPlanted() {
        return planted;
    }

    public int getWatered() {
        return watered;
    }

    public Farmer () {
        super();
        planted = 0;
        watered = 0;
    }

    public Farmer (String name) {
        super (name);
        planted = 0;
        watered = 0;
    }

    public void plant() {
        planted++;
    }

    public void water() {
        if (planted <= 0) {
            throw new IllegalArgumentException("First, you need to plant a plant)");
        }
        else {
            planted--;
            watered++;
        }
    }

    public void collect () {
        if (watered <= 0) {
            throw new IllegalArgumentException("Plants need to be watered");
        }
        else{
            watered--;
            Veget veget = new Veget();
            veget.setRandVeget();
            veget.setName("Enums.Vegetable");
            vegetable.add(veget);
        }
    }

    public Veget getLast() {
        return vegetable.get(vegetable.size()-1);
    }

    public void deleteVeget() {
        vegetable.remove(vegetable.size()-1);
    }

    public void eat(List<Food> foodList) {
        if (foodList == null || foodList.isEmpty()) {
            throw new IllegalArgumentException("The list of dishes is empty");
        } else {
            Food f = foodList.get(foodList.size() - 1);
            foodList.remove(foodList.size() - 1);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Delicious");
            alert.setHeaderText(null);
            alert.setContentText("It seems to taste this dish: " + f.tasteToString().toLowerCase() + "\n" +
                    "Dish color: " + f.getVeget().colorToString().toLowerCase() + "\n" +
                    "It can be made better if I add other fertilizers");
            alert.showAndWait();
        }

    }
}

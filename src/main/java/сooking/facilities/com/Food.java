package сooking.facilities.com;

import list.com.Color;
import list.com.Taste;
import list.com.Vegetable;

public class Food extends Item {
    private Taste taste;
    private Veget veget;

    public Food (String name) {
        super(name);
        this.taste = Taste.TASTELESS;
    }

    public Food (Taste taste, String name) {
        super (name);
        this.taste = taste;
    }

    public Food (Taste taste, String name, Veget veget) {
        super (name);
        this.taste = taste;
        this.veget = veget;
    }

    public void setVeget (Veget veget) {
        this.veget = veget;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste (Taste taste) {
        this.taste = taste;
    }

    public Color getColor () {
        return veget.getColor();
    }

    public Veget getVeget() {
        return this.veget;
    }

    public Vegetable getVegetable() {
        return veget.getVegetable();
    }

    public String tasteToString() {
        switch(taste) {
            case SWEET: return "Sweet";
            case SOUR: return "Sour";
            case SALTY: return "Salty";
            case BITTER: return "Bitter";
        }
        return "Tasteless";
    }
}

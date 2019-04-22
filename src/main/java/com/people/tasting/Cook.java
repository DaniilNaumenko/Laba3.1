package com.people.tasting;

import java.util.List;

class Food {

    private Taste taste;
    private Veget veget;

    public Food(String name) {}

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public void setVeget(Veget veget) {
        this.veget = veget;
    }

    public Taste getTaste() {
        return taste;
    }
}

enum Veget{
    PEPPER
}

enum Taste {
    SWEET, SOUR, SALTY, BITTER
}

class Cook {
    IRandom randomGenerator;

    public Cook(IRandom randomGenerator){
        this.randomGenerator = randomGenerator;
    }

    public void cook(List<Food> foods, String name, Veget veget) {
        int rand = randomGenerator.nextInt(4);
        Food f = new Food(name);
        switch (rand) {
            case 0:
                f.setTaste(Taste.SWEET);
                break;
            case 1:
                f.setTaste(Taste.SOUR);
                break;
            case 2:
                f.setTaste(Taste.SALTY);
                break;
            case 3:
                f.setTaste(Taste.BITTER);
                break;
        }
        f.setVeget(veget);
        foods.add(f);
    }

}

interface IRandom {
    int nextInt(int i);
}


package demo.TH1.animals;

import demo.TH1.edible.Iedible;

public class Chicken extends Animal implements Iedible {
    @Override
    public String makeSound() {
        return "Chicken: Cục tác!";
    }

    @Override
    public String howToEat() {
        return "Thịt được!";
    }
}

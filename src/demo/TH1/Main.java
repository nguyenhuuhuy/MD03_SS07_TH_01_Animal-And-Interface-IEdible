package demo.TH1;

import demo.TH1.animals.Animal;
import demo.TH1.animals.Tiger;
import demo.TH1.animals.Chicken;
import demo.TH1.edible.Iedible;
import demo.TH1.fruit.Apple;
import demo.TH1.fruit.Fruit;
import demo.TH1.fruit.Orange;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {   // so sánh xem thằng class Chicken có phải là con thằng animal ko đúng trả về true
            Iedible edible = (Chicken) animal; // ép từ bố animal sang thằng bố nuôi Iedible
                System.out.println(edible.howToEat());
            }
        }

        System.out.println("<-------------------------------------------------------------------------------------------------->");
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
//            System.out.println(fruit.hashCode());
        }
    }
}

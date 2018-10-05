import java.util.ArrayList;

public class Zookeper {

    private String name;

    public Zookeper(String name) {
        this.name = name;
    }

    public void feedAnimals(ArrayList<Animal> animals, String food) {
        System.out.println( this.name + " is feeding " + food + " to " + Integer.toString( animals.size() ) + " of "
                + Integer.toString( Animal.populationCount() ) + " total animals");

        for (Animal animal : animals) {
            animal.eat(food);
        }


    }

}



public class Animal {
    private static int population;
    public String name;
    public String favoriteFood;

    public Animal(String name, String favoriteFood) {
        population++;
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == this.favoriteFood) {
            System.out.println("YUM!!! " + this.name + " wants more " + food );
        }
        else {
            this.sleep();
        }

    }

    public static int populationCount() {
        return population;
    }



}

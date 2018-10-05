public class Unicorn extends Animal {

    public Unicorn(String name) {
        super(name,"marshmallows" );
    }

    public void sleep() {
        System.out.println(this.name + " sleeps in a cloud");
    }

    public void eat(String food) {
        super.eat(food);
        if (food == favoriteFood) {
            this.sleep();
        }
    }



}

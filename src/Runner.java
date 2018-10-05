import java.util.ArrayList;

public class Runner {


    public static void main(String[] args) {

        Zookeper zoebot = new Zookeper("Zoebot");
        zoebot.feedAnimals(new ArrayList<Animal>() {{
            add(new Tiger("Tigger"));
            add(new Bear("Pooh"));
            add(new Unicorn("Rarity"));
            add(new Giraffe("Gemma"));
            add(new Bee("Stinger"));
        }}, "meat");

    }


}

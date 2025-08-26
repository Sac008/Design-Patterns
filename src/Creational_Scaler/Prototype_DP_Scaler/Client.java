package Creational_Scaler.Prototype_DP_Scaler;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        bird1.setAge(3);
        bird1.setColor("Black");
        bird1.setWeight(200);

        Sparrow sparrow1 = new Sparrow();
        sparrow1.setAge(1);
        sparrow1.setColor("White");
        sparrow1.setWeight(100);

        Crow crow1 = new Crow();
        crow1.setAge(2);
        crow1.setColor("Red");
        crow1.setWeight(250);


        List<Bird> parents = List.of(
                  sparrow1,
                  crow1,
                  bird1
        );

        List<Bird> children = new ArrayList<>();

        for(Bird b: parents) {
            children.add(b.clone());
        }
        System.out.println("Done");

        Crow sweetSoundCrow = new Crow();
        sweetSoundCrow.setSound("koooo");

        Crow divineSoundCrow = new Crow();
        divineSoundCrow.setSound("hmmmmmmmm");

        BirdRegistry birdRegistry = new BirdRegistry();
        birdRegistry.registerBird("sweetSoundCrow", sweetSoundCrow);
        birdRegistry.registerBird("divineSoundCrow", divineSoundCrow);

        List<String> crowSounds = List.of(
                "sweetSoundCrow",
                "divineSoundCrow"
        );

        List<Bird> requestedBirds = new ArrayList<>();

        for(String crowSound: crowSounds) {
            requestedBirds.add(birdRegistry.getBird(crowSound));
        }
    }
}

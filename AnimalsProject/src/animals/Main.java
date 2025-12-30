package animals;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    Animal Chicken = new Animal("Chicken",2,eatingHabit.OMNIVORE);
    Fish Tuna = new Fish("Tuna",eatingHabit.CARNIVORE);

    ArrayList<Animal> list = new ArrayList<>();
    list.add(Chicken);
    list.add(Tuna);

    Collections.sort(list);

    for(Animal a : list){
        System.out.println(a);
    }

    Animal Chicken2 = new Animal("Chicken",2,eatingHabit.OMNIVORE);

        System.out.println(HaveSameName(Chicken,Chicken2));
    }

    public static boolean HaveSameName(Animal a1, Animal a2){
        return a1.getName().equals(a2.getName());
    }

}

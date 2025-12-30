package animals;

public class Fish extends Animal{
    public Fish(String name, eatingHabit eatingHabit) {
        super(name, 0, eatingHabit);
    }

    @Override
    public String toString() {
        return getName() + " - " + getEatingHabit();
    }
}

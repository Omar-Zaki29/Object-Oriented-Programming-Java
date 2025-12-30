package animals;

public class Animal implements Comparable <Animal>{
    private String name;
    private int numberOfLegs;
    private eatingHabit eatingHabit;

    public void setName(String name) {
        if (name.length() > 100){
            throw new NameTooLongException("Name is too long!");
        }
        this.name = name;
    }

    public void setName() {
        this.name = "unknown";
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public eatingHabit getEatingHabit() {
        return eatingHabit;
    }

    public Animal() {
    }

    public Animal(String name, int numberOfLegs, eatingHabit eatingHabit) {
        if (name.length() > 100){
            throw new NameTooLongException("Name is too long!");
        }
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.eatingHabit = eatingHabit;
    }

    @Override
    public String toString() {
        return name + " (" + numberOfLegs + " legs) - " + eatingHabit + "!";
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }
}

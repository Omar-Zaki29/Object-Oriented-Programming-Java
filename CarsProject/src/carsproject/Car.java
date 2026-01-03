package carsproject;

import java.util.Objects;

public class Car {
    private String Brand;
    private String type;
    private int registrationyear;
    private int colorcode;

    public String getBrand() {
        return Brand;
    }

    public String getType() {
        return type;
    }

    public int getRegistrationyear() {
        return registrationyear;
    }

    public int getColorcode() {
        return colorcode;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRegistrationyear(int registrationyear) {
        this.registrationyear = registrationyear;
    }

    public void setColorcode(int colorcode) {
        this.colorcode = colorcode;
    }

    public Car(String brand, String type, int registrationyear, int colorcode) {
        Brand = brand;
        this.type = type;
        this.registrationyear = registrationyear;
        this.colorcode = colorcode;
    }

    @Override
    public String toString(){
        String colorName = switch(colorcode){
          case 0 -> "Black";
          case 1 -> "Red";
          case 2 -> "Green";
          case 3 -> "Blue";
          case 4 -> "Yellow";
          case 5 -> "Orange";
          default -> "unknown";
        };
        return Brand + ", " + type + ", " + colorName + "(" + registrationyear + ")";
    }

    public void setColorcode(String colorName){
        if (colorName.equalsIgnoreCase("black")) {
            this.colorcode = 0;
        } else if (colorName.equalsIgnoreCase("red")) {
            this.colorcode = 1;
        } else if (colorName.equalsIgnoreCase("green")) {
            this.colorcode = 2;
        } else if (colorName.equalsIgnoreCase("blue")) {
            this.colorcode = 3;
        } else if (colorName.equalsIgnoreCase("yellow")) {
            this.colorcode = 4;
        } else if (colorName.equalsIgnoreCase("orange")) {
            this.colorcode = 5;
        } else {
            this.colorcode = -1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return registrationyear == car.registrationyear && colorcode == car.colorcode && Objects.equals(Brand, car.Brand) && Objects.equals(type, car.type);
    }

}

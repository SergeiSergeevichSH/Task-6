package web.Model;

import org.springframework.stereotype.Component;


public class Car {
    private String model;
    private String color;
    private int yearOfProduction;


    public Car(String model, String color, int yearOfProduction) {
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Модель = " + model +
                ", Цвет = " + color +
                ", Год выпуска = " + yearOfProduction;
    }
}

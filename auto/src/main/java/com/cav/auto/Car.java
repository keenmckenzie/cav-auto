package com.cav.auto;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean dadsFave(Car car) {
        String modelName = car.getModel();
        if (modelName.equals("Cadillac")) {
            return true;
        } else {
            return false;
        }
    }
}
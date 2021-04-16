package com.kodilla.testing.shape;

class Triangle implements Shape {

    private final String name;
    private final double field;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return field;
    }
}

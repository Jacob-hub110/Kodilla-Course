package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private final List<Shape> figuresList = new ArrayList<>();

    public List<Shape> getFiguresList() {
        return figuresList;
    }

    public void addFigure(Shape shape){
        figuresList.add(shape);
    }


    public void removeFigure(Shape shape){
        figuresList.remove(shape);
    }

    public String getFigure(int n){
        return figuresList.get(n).toString();
    }

public void showFigures() {
    for (int i = 0; i < figuresList.size(); i++) {
        System.out.println(figuresList.get(i));
    }
}

}
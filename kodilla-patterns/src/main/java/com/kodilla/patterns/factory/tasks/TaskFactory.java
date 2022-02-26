package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String typeOfTask) {
        switch (typeOfTask) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "products", 10.0);
            case PAINTING:
                return new PaintingTask("Painting", "blue", "clouds");
            case DRIVING:
                return new DrivingTask("Driving", "home", "car");
            default:
                return null;
        }
    }
}

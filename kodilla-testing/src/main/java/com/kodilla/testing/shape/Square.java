package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String shape;
    String field;

    public Square(String shape, String field) {
        this.shape = shape;
        this.field = field;
    }

    public String getShapeName() {
        return this.shape;
    }

    public String getField() {
        return this.field;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Square square = (Square)o;
            return this.shape.equals(square.shape) && this.field.equals(square.field);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.shape, this.field});
    }
}
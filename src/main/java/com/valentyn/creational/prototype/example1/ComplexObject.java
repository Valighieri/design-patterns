package com.valentyn.creational.prototype.example1;

public class ComplexObject implements Cloneable {
    private final int id;
    private final String name;
    private final Cat cat;

    public ComplexObject(int id, String name, Cat cat) {
        this.id = id;
        this.name = name;
        this.cat = cat;
    }

    @Override
    protected ComplexObject clone() {
        try {
            return (ComplexObject) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return "ComplexObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}

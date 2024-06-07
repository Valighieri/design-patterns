package com.valentyn.creational.prototype.example1;

class Demo {
    public static void main(String[] args) {
        ComplexObject complexObject = new ComplexObject(1,"Dante", new Cat("Tony"));
        ComplexObject clone = complexObject.clone();
        ComplexObject clone2 = complexObject.clone();

        System.out.println(complexObject);
        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(complexObject == clone);
        System.out.println(complexObject == clone2);

    }
}

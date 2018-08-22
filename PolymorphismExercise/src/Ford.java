/*
Create a base class called Car
It should have a few fields that would be appropriate for a generic car class. engine, cylinders, wheels, etc.
Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true.
Cylinders and names would be passed parameters.

Create appropriate getters

Create some methods like startEngine, accelerate, and brake

show a message for each in the base class
Now create 3 sub classes for your favorite vehicles.
Override the appropriate methods to demonstrate polymorphism in use.
put all classes in the one java file (this one).
 */

import Ford.Ford;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders,String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car --> startEngine()";
    }
    public String accelerate(){
        return "Car --> accelerate()";
    }
    public String brake(){
        return "Car --> brake()";
    }

}
class Toyota extends Car{

    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Toyota --> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Toyota --> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota --> brake()";
    }
}
public class Main {

    public static void main(String[] args) {

        Car car = new Car(8 , "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Toyota toyota = new Toyota(6 , "LE");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());


    }
}

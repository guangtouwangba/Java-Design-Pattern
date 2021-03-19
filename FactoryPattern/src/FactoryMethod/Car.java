package FactoryMethod;

/**
 * @author lenovo
 */

public class Car implements Vehicle{
    @Override
    public void run(){
        System.out.println("FactoryMethod.Car is running");
    }
}

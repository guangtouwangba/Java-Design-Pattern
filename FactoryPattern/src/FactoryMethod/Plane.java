package FactoryMethod;

public class Plane implements Vehicle{
    @Override
    public void run() {
        System.out.println("FactoryMethod.Plane is flying");
    }
}

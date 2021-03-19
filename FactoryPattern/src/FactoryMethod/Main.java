package FactoryMethod;

/**
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        // 在这边可以自己选择驾驶的方式
        Vehicle vehicle = new Plane();
        vehicle.run();
    }
}

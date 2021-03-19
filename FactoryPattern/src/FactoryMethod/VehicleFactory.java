package FactoryMethod;


/**
* 简单工厂
*
 * * @author lenovo
 * */
public class VehicleFactory {
    public Car createCar(){
        // 可以在这边实现权限的限制
        return new Car();
    }

    public Plane createPlane(){
        // 在此处实现权限的限制
        return new Plane();
    }
}

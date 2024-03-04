public class Fi {
    public static void main(String[] args) {
        Car v1 = new Car();
        v1.printSpeedLimit();
    }
}

class Vehicle {
    final int speedLimit = 80;

    public void printSpeedLimit() {
        System.out.println("old speed linit:" +speedLimit);
    }
}

class Car extends Vehicle {
    int speedLimit;

    public Car() {
        speedLimit = 100;
    }
}
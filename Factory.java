package Victor.Martins;

public abstract class Factory {
    public Car create(String requestedGrade){
        Car car = retrieverCar(requestedGrade);
        car = prepareCar(car);
        return  car;
    }
    private Car prepareCar(Car car){
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }
    abstract Car retrieverCar(String requestedGrade);
}

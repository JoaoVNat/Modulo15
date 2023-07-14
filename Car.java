package Victor.Martins;

public abstract class Car {
    private static int horsePower;
    private static String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }
    public static void startEngine(){
        System.out.println(Car.class.getSimpleName());
        System.out.println("The " + fuelSource + "engine has been started, and is ready to utilize" + horsePower);
    }
    public void clean(){
        System.out.println("Car has been cleaned, and the" + color.toLowerCase() + "color shine");
    }
    public void mechanicCheck(){
        System.out.println("Car has been checked by the mechanic. Everything looks good!");
    }
    public void fuelCar(){
        System.out.println("Car is being filled with" + fuelSource.toLowerCase());
    }
}

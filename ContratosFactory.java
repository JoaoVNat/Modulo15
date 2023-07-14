package Victor.Martins;

public class ContratosFactory extends Factory{
    @Override
    Car retrieverCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new MercedesCar(100,"Cheio", "prata");
        }else{
            return null;
        }
    }
}

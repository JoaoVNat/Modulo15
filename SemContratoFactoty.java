package Victor.Martins;

public class SemContratoFactoty extends Factory {
    @Override
    Car retrieverCar(String requestedGrade) {
        if("A".equals(requestedGrade)){
            return new BmwCar(300, "cheio", "azul");
        }else {
            return null;
        }
    }
}

package Victor.Martins;

public class Demo {
    public static void main(String[] args){
        Customer cliente = new Customer("A",false);
        Factory factory = getFactory(cliente);
        factory.create(cliente.getGradeResquest());
        Car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if(cliente.hasCompanyContract()){
            return new ContratosFactory();
        }else {
            return new SemContratoFactoty();
        }
    }
}

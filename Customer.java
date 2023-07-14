package Victor.Martins;

public class Customer {
    private String gradeResquest;
    private boolean hasCompanyContract;

    public Customer(String gradeResquest, boolean hasCompanyContract){
        this.gradeResquest = gradeResquest;
        this.hasCompanyContract = hasCompanyContract;
    }



    public boolean hasCompanyContract(){
        return hasCompanyContract;
    }
    public String getGradeResquest(){
        return gradeResquest;
    }
}

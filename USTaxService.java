public class USTaxService implements TexService {

    private double interestRate;

    public USTaxService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return this.interestRate;
    }
}

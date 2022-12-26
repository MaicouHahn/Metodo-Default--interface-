public class BrazilTaxService implements TexService{
    
    private double interestRate;

    public BrazilTaxService(double interestRate) {
        this.interestRate = interestRate;
        
    }

    public double getInterestRate(){
        return this.interestRate;
    }
}

import java.security.InvalidParameterException;

public interface TexService {
    
    double getInterestRate();

    default double payment(double amount,int months){

        if(months<1){
            throw new InvalidParameterException("Number of months must be superior to 1");
        }

        return amount*Math.pow(1+getInterestRate()/100,months);
    }

}

public class App{
    public static void main(String[] args) {

        TexService tsv1 = new BrazilTaxService(2.0);
        TexService tsv2 = new USTaxService(1.0);

        System.out.println(String.format("%.2f", tsv2.payment(200,3)));
        System.out.println(String.format("%.2f", tsv1.payment(200, 3)));
       
    }
}
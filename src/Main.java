//Calculate BMT using java class BMT
public class Main {
    public static void main(String[] args) {
        /*
        float heightInCm = 175;
        int weightInKilo = 75;
        float BMT = weightInKilo/((heightInCm/100)*(heightInCm/100));
        System.out.printf("%.1f", BMT);
         */

        int heightInCm = 175;
        int weightInKilo = 75;
        BmiService service = new BmiService();
        float BMI = service.calculate(heightInCm, weightInKilo);
        System.out.printf("%.1f", BMI);

    }
}

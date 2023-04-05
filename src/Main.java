public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int index = service.calculate(75, 1.87);

        System.out.println("BMI index is: " + index);

    }

}
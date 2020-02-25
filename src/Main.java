public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(60.0, 1.75);
        System.out.println(bmi);
    }
}

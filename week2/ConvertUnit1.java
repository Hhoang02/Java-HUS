public class ConvertUnit1 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        double inch = Math.round(x * 39.3700787 * 100.0) / 100.0;
        System.out.println(inch);
    }
}

public class ThreeSort {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = Math.max(Math.max(a,b), c);
        int min = Math.min(Math.min(a,b), c);
        int mid = a + b + c - max - min;

        System.out.println(min + " " + mid + " " + max);
    }
}

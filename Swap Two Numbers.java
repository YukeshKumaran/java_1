public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped values: a = " + a + ", b = " + b);
    }
}

public class fibonacci{
    public static void main(String[] args) {

        int a = 0, b = 1;

        System.out.print("Fibonacci series up to 50: ");
        System.out.print(a + " ");
        while (b <= 100) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

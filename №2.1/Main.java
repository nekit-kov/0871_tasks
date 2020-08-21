public class Main {

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

    public static int min(int a, int b, int c) {
        if (a<b) {
            if (a<c) { return a; }
            else if (c <= a) { return c; }
        }
        else if (b < c)  { return b; }
        return c;
        }
}

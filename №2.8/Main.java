public class Main {
    public static void main(String[] args) {
        String a = "8888888888";
        char[] w= new char[10];
        for (int i = 1; i<=10;i++) {
            a.getChars(0, i, w, 0);
            System.out.println(w);
        }
    }
}

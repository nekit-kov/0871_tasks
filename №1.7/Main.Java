import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Чтобы рассчитать объем воды,введите следующие параметры");
        System.out.print("Длина = ");
        int a = scan.nextInt();
        System.out.print("Ширина = ");
        int b = scan.nextInt();
        System.out.print("Высота = ");
        int c = scan.nextInt();
        System.out.println(a*b*c*1000+" литров");
        }
    }

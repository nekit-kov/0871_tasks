import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Укажите путь к файлу, чтобы прочитать из него набор целых чисел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        String str;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (temp % 2 == 0) {
                arrayList.add(temp);
            }
        }
        scanner.close();
        reader.close();
        Collections.sort(arrayList);
        for (Integer arr : arrayList) {
            System.out.println(arr);
        }
    }
}

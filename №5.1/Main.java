import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> city = new ArrayList<>();
        List<String> Sername = new ArrayList<>();
        System.out.println("Введите города и фамилии семей,проживающих в них: ");
        System.out.println("1 строка-Город");
        System.out.println("2 строка-Фамилия и т.д.");
        System.out.println("Подтвердить- 2 раза Энтер");
        while (true) {
            String siti = reader.readLine();
            if (siti.isEmpty()) {
                break;
            }

            String familiya = reader.readLine();
            if (familiya.isEmpty()) {
                break;
            }
            city.add(siti);
            Sername.add(familiya);
        }
        System.out.println("Вы ввели Фамилию: " + Sername);
        System.out.println("Вы ввели Город: " + city);
        String cityfind = "000";
        System.out.println("Выберите город для поиска семей,проживающих в нем : ");
        while (true) {
            cityfind = reader.readLine();
            System.out.println("Поиск проживающих в городе : " + cityfind);
            if (city.lastIndexOf(cityfind) == -1) System.out.println("Не найдено");
            if (city.lastIndexOf(cityfind) >= 0) {
                System.out.println("Найден город : " + (1 + city.lastIndexOf(cityfind)));
                String findFamily = Sername.get(city.lastIndexOf(cityfind));
                System.out.println("В г." + cityfind + " живут : " + findFamily);
            }

            System.out.println("Выберите следующий город:");
        }
    }
}

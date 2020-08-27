public class Cat {
    public int age;
    public int weight;
    public int strength;
    public Cat() {
    }
    public boolean fight(Cat anotherCat) {
        int i = 0;
        if (this.age > anotherCat.age) i++;
        else if (this.age < anotherCat.age) i--;
        if (this.strength > anotherCat.strength) i++;
        else if (this.strength < anotherCat.strength) i--;
        if (this.weight > anotherCat.weight) i++;
        else if (this.weight < anotherCat.weight) i--;
        if (i>1) return true;
        else if (i<1) return false;
        return false;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cat1.age = 40;
        cat1.weight = 4;
        cat1.strength = 300;
        cat2.age = 10;
        cat2.weight = 6;
        cat2.strength = 400;
        cat3.age = 25;
        cat3.weight = 20;
        cat3.strength = 600;
        cat4.age = 20;
        cat4.weight = 15;
        cat4.strength = 600;
        System.out.println("Кот 1: Возраст " + cat1.age + " /  Вес " + cat1.weight + " /  Сила " + cat1.strength);
        System.out.println("Кот 2: Возраст " + cat2.age + " /  Вес " + cat2.weight + " /  Сила " + cat2.strength);
        System.out.println("Кот 3: Возраст " + cat3.age + " /  Вес " + cat3.weight + " /  Сила " + cat3.strength);
        System.out.println("Кот 4: Возраст " + cat4.age + " /  Вес " + cat4.weight + " /  Сила " + cat4.strength);
        if (cat1.fight(cat2)) {System.out.println("Кот 1 победил Кота 2");}  else System.out.println("Кот 2 победил Кота 1");
        if (cat1.fight(cat3)) {System.out.println("Кот 1 победил Кота 3");}  else System.out.println("Кот 3 победил Кота 1");
        if (cat1.fight(cat4)) {System.out.println("Кот 1 победил Кота 4");}  else System.out.println("Кот 4 победил Кота 1");
        if (cat2.fight(cat3)) {System.out.println("Кот 2 победил Кота 3");}  else System.out.println("Кот 3 победил Кота 2");
        if (cat2.fight(cat4)) {System.out.println("Кот 2 победил Кота 4");}  else System.out.println("Кот 4 победил Кота 2");
        if (cat3.fight(cat4)) {System.out.println("Кот 3 победил Кота 4");}  else System.out.println("Кот 4 победил Кота 3");
    }
}

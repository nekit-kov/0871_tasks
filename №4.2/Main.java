public class Main {
    public static void main(String[] args) {
            Mouse jerryMouse = new Mouse("Jerry", 7, 6);
            Cat tomasCat = new Cat("Tomas" ,42,50);
            Dog dykeDog = new Dog("Dyke",65,15);
        }
    }
class Mouse {
    String name;
    int length;
    int tail_size;

    public Mouse(String name, int length, int tail_size) {
        this.name = name;
        this.length = length;
        this.tail_size = tail_size;
    }
}
    class Cat {
        String name;
        int length;
        int tail_size;

        public Cat(String name, int length, int tail_size) {
            this.name = name;
            this.length = length;
            this.tail_size = tail_size;
        }
    }
    class Dog {
        String name;
        int length;
        int tail_size;

        public Dog(String name, int length, int tail_size) {
            this.name = name;
            this.length = length;
            this.tail_size = tail_size;
        }
    }

 public class Main{
        public static void main(String[] args) {
            Horse black = new Horse("Блэк",250,210,60);
            black.run();
            Pegas billy = new Pegas("Билли",300,280,100);
            billy.fly();
        }
    }
    abstract class Animal {
        String name;
        int length;
        int height;
        int speed;
        public Animal(String name, int length, int height, int speed) {
            this.name = name;
            this.length = length;
            this.height = height;
            this.speed = speed;
        }
    }
    class Horse extends Animal {
        public Horse(String name, int length, int height, int speed) {
            super(name,length,height,speed);
        }
        public void run() { System.out.println("Я поскакал"); }
    }
    class Pegas extends Horse {
        public Pegas(String name, int length, int height, int speed) {
            super(name,length,height,speed);
        }
        public void fly() {
            System.out.println("Я полетел");
        }
        }

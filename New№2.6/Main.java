public class Main {
        public static void main(String[] args) {
                String a=" | ";
                String b="| ";
                for (int i=1; i<11; i++){
                        for (int j=1; j<11; j++){
                                System.out.print(i*j);
                                System.out.print(i*j<11?a:b);
                        }
                        System.out.println();
                }
        }
}

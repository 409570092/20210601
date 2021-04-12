package hsiuying.Racing;

public class RacingGame {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunnable h3 = new HorseRunnable();
        Thread thread = new Thread(h3);
        h1.start();
        h2.start();
   }
}

/*        String name1 = "Horse1";
        Horse h2 = new Horse();
        h2.start();
        for (int i = 0; i<10000; i++){
            System.out.println(name1 + " " + i);
       }
*/
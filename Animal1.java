	
import java.util.Random;

class Animal implements Runnable {
    private String name;          // fields for animal class
    private int position;
    private int speed;
    private int restMax;
    private static boolean winner = false;
    private Food sharedFood;

    public Animal(String name, int speed, int restMax, Food sharedFood) {
        this.name = name;
        this.speed = speed;
        this.restMax = restMax;
        this.sharedFood = sharedFood;
        this.position = 0;
    }


    

    public void run() {
        Random random = new Random();     //providing random # for sleep
        while (!winner && position < 120) {    //creating loop till position 120 yards
            try {
                Thread.sleep(random.nextInt(restMax));        
                position += speed;

                System.out.printf("%s is running. Current position: %d%n", name, position);    
                if (position >= 120) {    //determining whether the animal has won, if not stop to eat and allow next animal to run
                    winner = true;
                    System.out.printf("%s wins the race!%n", name);
                } else {
                    sharedFood.eat(name);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	

}

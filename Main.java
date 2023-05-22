
public class Main {
	  public static void main(String[] args) {
	        Food sharedFood = new Food();
	        Animal hare = new Animal("Hare", 9, 220, sharedFood);  // creating animals and filling in fields
	        Animal tortoise = new Animal("Tortoise", 5, 165, sharedFood);

	        Thread hareThread = new Thread(hare);                // creating threads
	        Thread tortoiseThread = new Thread(tortoise);

	        hareThread.start();         //initiating threads
	        tortoiseThread.start(); 
	    }
	}

	class Food {
	    public synchronized void eat(String animalName) {
	        System.out.printf("%s starts eating.%n", animalName);    //indicates when animal starts eating
	        try {
	            if ("Hare".equals(animalName)) {           //determining which animal eats
	                Thread.sleep(300);
	            } else {
	                Thread.sleep(150);
	            }
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.printf("%s finishes eating.%n", animalName);  //indicates when animal is done eating
	    }
	}
	
	



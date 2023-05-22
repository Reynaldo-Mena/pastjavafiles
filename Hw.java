	import java.util.ArrayList;

public class Hw {

	  
	  public static void main(String[] args) {
		  											
	    ArrayList<Integer> listA = new ArrayList<>();		// create the array lists
	    ArrayList<Integer> listB = new ArrayList<>();
	    
	    
	    long start_time, end_time;		 // variables to store nanoseconds
	    int n = 50000; 	// size of the ArrayList

	    											
	    for (int i = 0; i < n; i++) {			// fill ArrayList with random numbers	
	      
	      int random = (int) (Math.random() * Integer.MAX_VALUE);    // get the random numbers 
	     
	      listA.add(random);         // add random numbers to the ArrayLists
	      listB.add(random); 
	    }

	    
	    start_time = System.nanoTime();    // store the start time
	    selection_sort(listA); 			// sort list
	    
	    end_time = System.nanoTime();     // store the end time
	   
	    System.out.println(        //print the time it takes to sort array list
	      "Selection sort time " + "{Number of elements in list=" + n + "}:   " + (end_time - start_time)
	    );

	    
	    start_time = System.nanoTime();    //repeat same steps for list B
	    bubble_sort(listB); 
	   
	    end_time = System.nanoTime();
	 
	    System.out.println(
	      "Bubble sort time " + "{Number of elements in list=" + n + "}:      " + (end_time - start_time)
	    );
	  }

	  
//##################################################################################################################################################################################################################	  
	  
	  
	  // bubble sort function 
	 
	  static void bubble_sort(ArrayList<Integer> list) {
	    
		  
	    for (int i = 0; i < list.size(); i++) {   // loop through array list
	      
	      for (int j = 0; j < list.size() - 1 - i; j++) {
	                                                
	        if (list.get(j) > list.get(j + 1)) {   // if the current index's value is greater than the next index's value
	         
	          int temp = list.get(j);         // swap values
	          list.set(j, list.get(j + 1));
	          list.set(j + 1, temp);
	         }
	        }
	     }
	  }

	  
	  
	  
//##################################################################################################################################################################################################################	  
	 	  
	  
	  // selection sort function
	  
	  static void selection_sort(ArrayList<Integer> list) {
	  
	    for (int i = 0; i < list.size(); i++) {   //loop through array list
	      
	 
	      int min = list.get(i);      // get the index of the smallest number in the array list
	      int min_index = i;     // index of smallest number

	     
	      for (int j = i + 1; j < list.size(); j++) {     // loop through the array list
	        
	        if (list.get(j) < min) {     // if the current element is smaller than the smallest number
	       
	          min = list.get(j);     // update index 
	          min_index = j;
	        }
	      }

	      
	      list.set(min_index, list.get(i));   // swap smallest number with current index
	      list.set(i, min);    // set current index with smallest number
	    }
	  }
}

	  
//##################################################################################################################################################################################################################	  
	  

	

	
	
	



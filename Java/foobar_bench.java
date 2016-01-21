/**
  *
  * Beschreibung
  *
  * @version 1.0 (28.11.2014)
  * @Landei 
  */

public class foobar_bench {
  
  public static void main(String[] args) {
    String input, error;  
    do {
      
      int zahl, ziffer, ziffer2, eingabe;
      double timeStart, timeEnd;
      
      zahl = 0;
      timeStart = 0;
      timeEnd = 0;
      
      eingabe = InOut.readInt("Input number range: ");
      
      do {
        timeStart = System.currentTimeMillis();
        
        ++zahl;
        ziffer = zahl % 5;
        ziffer2 = zahl % 3;
        
        if (ziffer !=0 && ziffer2 !=0) {
          System.out.println(zahl);
        } // end of if
        
        else if(ziffer == 0 && ziffer2 == 0){
          System.out.println("foobar");
        } // end of if-else
        
        else if(ziffer == 0){
          System.out.println("bar");
        } // end of if-else
        
        else if(ziffer2 == 0){
          System.out.println("foo");
        } // end of if-else
        
      } while (zahl < eingabe); // end of do-while
      
      timeEnd = System.currentTimeMillis();
      
      System.out.println("Time required: " +((timeEnd - timeStart)/1000) +"sek.");
      
      input = InOut.readString("Try again? (y/n)");
      
      if (input.equals("n")) System.exit(0);
    } while (input.equals("y")); // end of do-while  
  } // end of main
  
} // end of class foobar-bench

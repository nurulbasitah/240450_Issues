
package issue04_exercise;

public class sequential{
    
    public static void randomMaxnum() throws InterruptedException{
    int numbers[] = new int[1000000];       
    for(int i = 0; i < 1000000; i++) {
      numbers[i] = (int)(Math.random()*1000000 + 1);
      //System.out.println("Numbers Generated: " + numbers[i]); 
    }//end for loop
    
    int max  = numbers[0];
    for (int i= 0; i<numbers.length ; i++){
        if (numbers[i]>max){
            max = numbers[i];
            //System.out.println(max);
        }
}

    }
        public static void main(String [] args) throws InterruptedException{
        long startTime = System.nanoTime();
        randomMaxnum();
        long endTime = System.nanoTime();
        long output = endTime - startTime;
        double result = (double) output/1000000000.0;
        System.out.printf("\n Sequential program = %.9f seconds",result );
    }
    
    
}

   
        

    


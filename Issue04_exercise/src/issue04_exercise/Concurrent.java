package issue04_exercise;

public class Concurrent{
       
    public static class number extends Thread{
        public void run(){
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
}
         public static void main(String [] args){
        long startTime = System.nanoTime();
        number cuba = new number();
        Thread thread1 = new Thread(cuba);
        Thread thread2 = new Thread(cuba);
        
        thread1.start();
        thread2.start();
        long endTime = System.nanoTime();
        long output = endTime - startTime;
        double result = (double) output/1000000000.0;
        System.out.printf("\n Concurrent program = %.9f seconds",result );
             
        
    }
    
    
    
}

import java.util.concurrent.TimeUnit;


public class primeOne{
    public static void main(String[] args) {

    long startTime = System.currentTimeMillis();

int prime = 0;
for (int num=3; num<1000; num++){

    for (int i=num-1;i>1; i--){

        if (num%3==0){
            break;
        }

      prime = 0;
     if(num%i==0){
         prime = 1;
         break;
     }}if (prime==0){
        System.out.println(num);
     }
    
    }
     long endTime = System.currentTimeMillis();
     long timeElapsed = endTime - startTime;
     System.out.println("Execution time in milliseconds: " + timeElapsed);
    
}}
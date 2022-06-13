import java.util.concurrent.TimeUnit;
import java.util.Stack;


public class PrimeThree{
    public static void main(String[] args) {

    long startTime = System.currentTimeMillis();

    Stack<Integer> primes = new Stack<>();

int prime = 0;


for (int num=3; num<1000000; num+=2){

    

    for (int i=num-1;i>1; i--){

      prime = 0;
     if(num%i==0){
         prime = 1;
         break;
     }}if (prime==0){
         primes.push(num);
        //System.out.println(num);
     }
    }
        System.out.println(primes);
     long endTime = System.currentTimeMillis();
     long timeElapsed = endTime - startTime;
     System.out.println("Execution time in milliseconds: " + timeElapsed);
    
}}
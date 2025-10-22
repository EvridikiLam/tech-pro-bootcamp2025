import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        
        //brute force algorithm
        int n;
        n = 17;
        boolean isPrime = true;
        
        for (int i=2; i<=n; i++){
            if (n%1 == 0)
                isPrime = false;
                break;
        }

        if (isPrime) {
            System.out.println("It's a prime number");
        }
        else {
            System.out.println("It's not a prime number");
        }

      

    }

}
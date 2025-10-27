public class Primefactors {
    public static void main(String[] args) {
        int input_number = 57;
        int temp_number = input_number;

        while (!isPrime(temp_number)){
            for (int i=2;i<=temp_number;i++){
                if (temp_number%i==0) {
                    System.out.println("Prime factor: " + i);
                    temp_number = temp_number/i;
                }
                else {
                    System.out.println("Prime Factor: " + temp_number);
                }
            }
        }


    }

public static boolean isPrime(int n) {
    for (int i=2;i<=n; i++) {
        if (n%i==0) {
            return false;
        }
    }
            return true;

}
    }
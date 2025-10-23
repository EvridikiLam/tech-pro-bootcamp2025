public class sumofvalues {
    public static void main(String[] args) {
        int[] values = {1,2,31,14,25,31,52,621,14,13,521,62};

        //
        int  temp = values[0];
        int summ = 0;
        for (int i=0; i<values.length; i++){
            summ = summ + values[i];
        }
        System.out.println("The summ is: " + summ);
    }
}
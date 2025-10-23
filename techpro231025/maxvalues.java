public class maxvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] values = { 456 ,3 , 45, 55, 77, 32};

       int max = values[0];
        for (int i=0;i<values.length;i++){
            if (values[i]>max) {
                max = values[i];
            }
     }
     System.out.println("The max value of the array is:" + max);
  }

}
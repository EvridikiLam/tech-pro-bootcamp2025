public class minvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] values = { 456 ,3 , 45, 55, 77, 32};

       int min = values[0];
        for (int i=0;i<values.length;i++){
            if (values[i]<min) {
                min = values[i];
            }
     }
     System.out.println("The min value of the array is:" + min);
  }

}

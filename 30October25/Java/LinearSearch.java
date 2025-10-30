public class LinearSearch {

    public static void main (String[] args) {
        System.out.println("Hello");
        float[] dataset = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1, 3, 5, 61, 8, 7,8,2,7};

        System.out.println("Size: " + dataset.length);
        int result;
        result = DoLinearSearch(4,dataset);
        System.out.println(result);
    }

    public static int DoLinearSearch (float key, float[] array) {
        
        for(int i=0;i<array.length;i++) { 

            System.out.println("Comparing");
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }

}
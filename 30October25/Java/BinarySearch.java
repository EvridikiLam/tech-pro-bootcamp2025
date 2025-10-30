public class BinarySearch {

    public static void main (String[] args) {
        System.out.println("Hello");
        float[] dataset = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 5};

        int result;
        result = DoBinarySearch(4,dataset);
        System.out.println(result);
    }

    public static int DoBinarySearch (float key, float[] array) {
        
        for(int i=0;i<array.length;i++) { 
            if (array[i] == key) {
                return i;
            }
        }

        return -1;
    }

}
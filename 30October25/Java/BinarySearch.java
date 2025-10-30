public class BinarySearch {

    public static void main (String[] args) {
        System.out.println("Hello");
        float[] dataset = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170};

        System.out.println("Size: " + dataset.length);
        int result;
        result = DoBinarySearch(30,dataset);
        System.out.println(result);
    }

    public static int DoBinarySearch (float key, float[] array) {
        
        int i=0;
        int start = 0;
        int stop = array.length-1;
        int current = 0;
        int previous = current;

        if (array[start] > key){
            return -1;
        }
        if (array[stop] < key) {
            return -1;
        }

        while (array[current] !=key) {
            System.out.println("Comparing");
            if (array[current] < key) {
                start = current;
            }
            if (array[current]> key) {
                stop = current;
            }
            previous = current;
            current = (start + stop)/2;
            if (previous == current) {
                return -1;
            }
        }
        return current;

    }

}
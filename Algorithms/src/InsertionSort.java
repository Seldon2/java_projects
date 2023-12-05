public class InsertionSort implements Algorithm{
    @Override
    public int[] sort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i;
            while (j > 0 && array[j-1] > key){
                array[j] = array[j-1];
                j = j - 1;
            }
            array[j] = key;
        }
        return array;
    }
}

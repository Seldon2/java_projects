public class DataGenerator {
    static public int[] generateData(int size){
        int[] data = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = (int)(Math.random() * 100);
        }
        return data;
    }

    static public int[] generateData(int size, int min, int max){
        int[] data = new int[size];
        for(int i = 0; i < size; i++){
            data[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return data;
    }

    static public void printData(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

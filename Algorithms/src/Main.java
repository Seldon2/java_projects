public class Main {
    public static void main(String[] args) {
        int[] data = DataGenerator.generateData(10);
        DataGenerator.printData(data);
        Sorter sorter = new Sorter();
        sorter.setAlgo(new InsertionSort());
        int[] sortedData = sorter.doSort(data);
        DataGenerator.printData(sortedData);
    }
}
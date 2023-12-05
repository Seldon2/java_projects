public class Sorter {
    private Algorithm algorithm;
    public void setAlgo(Algorithm algorithm){
        this.algorithm = algorithm;
    }
    public int[] doSort(int[] array){
        return algorithm.sort(array);
    }
}

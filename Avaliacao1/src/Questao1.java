public class Questao1 {
    public static void main(String[] args) throws Exception {
        int[] array = { 5, 2, 4, 6, 1, 3, 9, 8, 7, 10, 19, 18, 17, 16, 15, 14, 13, 12 };
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.sort(0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

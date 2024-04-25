public class Question_5 {
//    Given an array, we have to sort.
    public static void main(String[] args) {
//        int[] array= {2, 3, 6, 8, 10, 12 ,15, 17, 18};
        int[] array= {2, 3, 8, 10, 6, 18, 17, 12 ,15};
        MergeSort.mergeSort(array,0,array.length-1);
        for(int ar : array){
            System.out.print(" "+ar);
        }
    }

}

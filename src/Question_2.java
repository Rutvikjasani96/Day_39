public class Question_2 {
//    Given an array, sort in ascending order but, we can only swap adjacent elements.
    public static void main(String[] args) {
        int[] array = {3,-1,6,9,4,2,5,4};
        BubbleSort.bubble_sort(array);
        for(int ar : array){
            System.out.print(" "+ar);
        }
    }
}

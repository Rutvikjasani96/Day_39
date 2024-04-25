public class Question_1 {
//    given n array element, find Kth Smallest Element.
    public static void main(String[] args) {
        int[] array = {-1,2,4,8,6,7,5,10};
        SelectionSort.stable_sort(array);
        for(int ar : array){
            System.out.print(" "+ar);
        }
    }
}

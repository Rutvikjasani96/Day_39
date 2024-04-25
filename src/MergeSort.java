public class MergeSort {
    static void mergeSort(int[] array,int s,int e){
        if(s==e){
            return;
        }
        int mid=(e+s)/2;
        mergeSort(array,s,mid);
        mergeSort(array,mid+1,e);
        Question_4.merge(array, s, mid, e);
    }
}

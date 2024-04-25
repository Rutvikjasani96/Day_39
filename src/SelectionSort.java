public class SelectionSort {
    static void stable_sort(int[] array){
        for(int i=0;i<array.length;i++){
            int min=array[i],ind=i;
            for(int j=i;j<array.length;j++){
                if(array[j]<min){
                    min=array[j];
                    ind=j;
                }
            }
            swap(array,i,ind);
        }
    }
    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

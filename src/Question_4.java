public class Question_4 {
//    Given n array elements & 3 indices s, m, e.
    public static void main(String[] args) {
        int[] array = {4, 8, -1, 2, 6, 3, 4, 7, 13, 0};
        merge(array,2,4,8);
        for(int ar: array){
            System.out.print(" "+ar);
        }
    }
    static void merge(int[] array,int s,int m,int e){
        int p1=s,p2=m+1,p3=0;
        int[] temp = new int[e-s+1];
        while(p1<=m && p2<=e){
            if(array[p1]<array[p2]){
                temp[p3] = array[p1];
                p1++;
                p3++;
            }else{
                temp[p3] = array[p2];
                p2++;
                p3++;
            }
        }
        while(p1<=m){
            temp[p3] = array[p1];
            p1++;
            p3++;
        }
        while(p2<=e){
            temp[p3] = array[p2];
            p2++;
            p3++;
        }
        for(int i=0;i< temp.length;i++){
            array[i+s] = temp[i];
        }
    }
}

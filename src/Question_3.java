public class Question_3 {
//    given 2 Sorted arrays a[n], b[m], Merge & Create & Return a Sorted array.
    public static void main(String[] args) {
        int[] a = {-5, 1, 3, 7, 10, 12, 15};
        int[] b = {-4, 0, 2, 8, 9};
        int[] c = mergeTwoSortedArray(a,b);
        for(int i : c){
            System.out.print(" "+i);
        }
    }
    static int[] mergeTwoSortedArray(int[] a,int[] b){
        int n = a.length;
        int m = b.length;
        int[] c = new int[n+m];
        int p1=0,p2=0,p3=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]){
                c[p3]=a[p1];
                p1++;
                p3++;
            }else{
                c[p3]=b[p2];
                p2++;
                p3++;
            }
        }
        while(p1<n){
            c[p3]=a[p1];
            p1++;
            p3++;
        }
        while(p2<m){
            c[p3]=b[p2];
            p2++;
            p3++;
        }
        return c;
    }
}

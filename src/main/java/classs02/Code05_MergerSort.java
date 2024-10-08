package classs02;

/**
 * 归并排序
 * 思想：将一个数组分为两部分，分别对两部分进行排序，然后分别进行比较
 * @author: dongxiaoxu
 * @date: 2024/8/18
 */
public class Code05_MergerSort {
    //todo
    public static void mergeSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        mergeSort(arr,0, arr.length-1);
    }

    public static void mergeSort(int[] arr,int l,int r){
        if(l==r){
            return;
        }
        int mid = l+((r-l)>>1);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);

    }

    private static void merge(int[] arr,int l,int m,int r) {
        int[] help = new int[r-l+1]; //辅助数组
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        while(p1<=m && p2<=r){
            help[i++] = arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while(p1<=m){
            help[i++] = arr[p1++];
        }
        while(p2<=r){
            help[i++] = arr[p2++];
        }

        for (i=0;i< help.length;i++){
            arr[l+i] =  help[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,1,6,7,9,8};
        mergeSort(arr);
    }
}

package class01;

/**
 * 插入排序
 * @author dongxiaoxu
 * @date 2024/08/17
 */
public class Code03_InsertSort {
    public static void InsertSort(int[] arr){
        if(arr==null || arr.length<2){
            return;
        }
        for(int i=0;i< arr.length;i++){
            for(int j=i-1;j>=0 && arr[j]>arr[j+1];j--){
                swap(arr,j,j-1);
            }
        }
    }

    public static void swap(int[] arr, int i,int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
}

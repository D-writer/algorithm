package class01;

/**
 * 冒泡排序
 * @author dongxiaoxu
 * @DATE 2024/08/17
 */
public class Code01_BubbleSort {
    public static void BubbleSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        for(int e=arr.length-1;e>0;e--){
            for(int i=0;i<e;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
    }

    /**
     * 交换顺序
     * @param arr 数组
     * @param i 大值
     * @param j 小值
     */
    public static void swap(int[] arr,int i,int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }

    public static void main(String[] args) {

    }
}

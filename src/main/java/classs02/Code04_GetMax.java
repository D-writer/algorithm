package classs02;

/**
 * 递归方法找出数组最大值
 * @author dongxiaoxu
 * @date 2024/08/18
 */
public class Code04_GetMax {
    public static void GetMax(int[] arr){
        int process = Process(arr, 0, arr.length - 1);
        System.out.println(process);
    }

    public static int Process(int[] arr, int l, int r){
        if(l == r){
            return arr[r];
        }
        int midle= l+((r-l)>>1);
        int leftMax = Process(arr,l,midle);
        int rightMax = Process(arr,midle+1,r);
        return Math.max(leftMax,rightMax);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,4,8,9,1};
        GetMax(arr);
    }
}

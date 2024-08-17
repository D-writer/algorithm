package class01;

/**
 * 异或运算
 * 一个整数数组中，如果已知有两种数出现了奇数次，其他所有的数都出现了偶数次，怎么样找到这两种数
 * @author dongxiaoxu
 * @date 2024/08/17
 */
public class Code02_EvenTimesOddTimes {
    public static void EvenTimesOddTimes(int[] arr){
        //todo 进行计算
        //查找数组中第一个出现奇数次的数
        int eor = 0;
        for(int i:arr){
             eor ^=i;
        }

        int rightone = eor & (~eor+1); //取出最右边第一个不为0的数与a^b进行异或
        int hasOne = 0;
        for(int i:arr){
            if((rightone&i)!=0){
                hasOne ^=i;
            }
        }

        System.out.println(hasOne + "  "+(eor^hasOne));
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,15,15,15,4,4,4,4,5,5,5};
        EvenTimesOddTimes(arr);
    }
}

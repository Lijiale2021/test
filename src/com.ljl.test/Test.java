import java.util.*;

public class Test {
    public static void main(String[] args) {
        //三行火柴
        int[]arr1=new int[3];
        int[]arr2=new int[5];
        int[]arr3=new int[7];
        //true表示a  false表示b
        boolean flag=true;
        //每次随机在第几行拿
        Random r1=new Random();
        //每车次随机拿多少根
        Random r2=new Random();
        //每行还有多少根
        int len1=arr1.length;
        int len2=arr2.length;
        int len3=arr3.length;
        do {
            int count = r2.nextInt(7);
            int i = r1.nextInt(3);
            switch (i + 1) {
                case 1:
                    if (len1==0){
                        break;
                    }
                    flag = !flag;
                    if (count >= len1) {
                        len1 = 0;
                        break;
                    }
                    len1 = len1 - count;
                    break;
                case 2:
                    if (len2==0){
                        break;
                    }
                    flag = !flag;
                    if (count >= len2) {
                        len2 = 0;
                        break;
                    }
                    len2 = len2 - count;
                    break;
                case 3:
                    if (len3==0){
                        break;
                    }
                    flag = !flag;
                    if (count >= len3) {
                        len3 = 0;
                        break;
                    }
                    len3 = len3 - count;
                    break;
                default:
                    break;
            }
        } while (len1 != 0 || len2 != 0 || len3 != 0);
        System.out.println("result:"+flag);
    }
}

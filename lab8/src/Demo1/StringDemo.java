package Demo1;

public class StringDemo {
    String str1=new String("2240129346");
    String str2="吴鸿源";

    public static void main(String[] args) {
        StringDemo obj=new StringDemo();
        obj.str1=obj.str2;

        StringBuilder sb=new StringBuilder();
        sb.append(2023);
        sb.append("广州软件学院");
        System.out.println(obj.str1);
        System.out.println(obj.str2);
        System.out.println(sb);

        int[] nums={1,2,3,4,5,6,7,8,9,10};
        for(int num:nums){
            System.out.println(num);
        }
        String[] strs=new String[5];
     /*   strs[0]="zhangsan1";
        strs[1]="zhangsan2";
        strs[2]="zhangsan3";
        strs[3]="zhangsan4";
        strs[4]="zhangsan5";*/
        for(int i=0;i<=4;i++){
            strs[i]="lisi"+i;
            System.out.println(strs[i]);
        }
    }
}

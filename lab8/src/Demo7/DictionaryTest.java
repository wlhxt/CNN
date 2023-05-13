package Demo7;

import java.util.*;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> word= new HashMap();
        word.put("potato","土豆");
        word.put("tomato","西红柿");
        word.put("peach","桃");
        word.put("pear","梨");
        Scanner sn=new Scanner(System.in);
        System.out.println("请输入要查询的单词：");
        while (sn.hasNext()){
            String s=sn.next();
            if(s!=null&&!s.equals("")){
                if(word.get(s)!=null){
                    System.out.println("单词的中文意思是："+word.get(s));
                }else{
                    System.out.println("该单词不存在");
                }
            }else{
                System.out.println("请输入要查询的单词：");
            }
        }
    }
}

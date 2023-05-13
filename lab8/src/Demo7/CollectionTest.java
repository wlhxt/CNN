package Demo7;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        System.out.println("===============Set集合接口的应用 start===============");
        Set<String> set=new HashSet<>();
        //Set<String> set=new LinkedHashSet<>();
        //Set<String> set=new TreeSet<>();
        Collections.addAll(set,"区别","应用","Map接口","与","Java泛型","List接口","Set接口");
        System.out.println("第一种输出方式，默认调用toString()方法输出:");
        System.out.println(set);
        System.out.println("第二种输出方式，使用迭代器逐个遍历:");
        Iterator<String> interator=set.iterator();
        while (interator.hasNext()){
            System.out.println(interator.next());
        }
        System.out.println("第三种输出方式，使用加强for循环逐个遍历:");
        for(String it:set){
            System.out.println(it);
        }
        System.out.println("===============Set集合接口的应用 end=================");
        System.out.println("**************List集合接口的应用 start***************");
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"区别","应用","Map接口","与","Java泛型","List接口","Set接口");
        System.out.println("第一种输出方式，默认调用toString()方法输出:");
        System.out.println(list);
        System.out.println("第二种输出方式，使用迭代器逐个遍历:");
        Iterator<String> interator1=list.iterator();
        while (interator1.hasNext()){
            System.out.println(interator1.next());
        }
        System.out.println("第三种输出方式，使用加强for循环逐个遍历:");
        for(String it1:list){
            System.out.println(it1);
        }
        System.out.println("**************List集合接口的应用 end*****************");
        System.out.println("+++++++++++++++Map集合接口的应用 start+++++++++++++++");
        String[] s={"区别","应用","Map接口","与","Java泛型","List接口","Set接口"};
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<s.length;i++){
            map.put(i+1,s[i]);
        }
        System.out.println("第一种输出方式，默认调用toString()方法输出:");
        System.out.println(map);
        System.out.println("第二种输出方式，使用for循环逐个遍历:");
        for(int i=1;i<= map.size();i++){
            System.out.println(i+"="+map.get(i));
        }
        System.out.println("第三种输出方式，使用Map.keySet()方法逐个遍历:");
        Set<Integer> keys= map.keySet();
        for(Integer i:keys){
            System.out.println(i+"="+map.get(i));
        }
        System.out.println("+++++++++++++++Map集合接口的应用 end+++++++++++++++++");
    }
}

package Demo5;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set set1=new HashSet();
        //1.添加元素
        //(1)添加元素，不去接收它的返回值，
        // 当添加元素发生重复时，返回值为flase
        set1.add(2);
        boolean add=set1.add(2);
        System.out.println(add);
        //(2)添加元素，不去接收它的返回值
        set1.add("a");
        set1.add("c");
        //2.查询
        Object[] array=set1.toArray();
        //用Object类型数组来接收集合通过toArray转换成的数组
        System.out.println(Arrays.toString(array));
        //通过数组里的toString方法来遍历数组
        //3.删除
        set1.remove(2);
        System.out.println(set1);
    }
}

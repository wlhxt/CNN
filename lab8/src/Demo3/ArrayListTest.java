package Demo3;
import java.util.List;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        List list1=new ArrayList();
        List list2=new ArrayList();
        //1.添加元素
        //(1)添加元素
        list1.add(10);
        list1.add(20);
        list2.add("a");
        list2.add("b");
        System.out.println(list1);
        //(2)在list1中下标为1的位置添加元素
        list1.add(1,30);
        System.out.println(list1);
        //(3)在list2中下标为1的位置添加list1的所有元素
        list2.addAll(1,list1);
        System.out.println(list2);
        //2.删除
        list2.remove(1);
        System.out.println(list2);
        //3.修改
        //把list2中下标为2的元素修改为“c”
        list2.set(2,"c");
        System.out.println(list2);
        //4.查询
        Object object = list2.get(3);
        System.out.println(object);
    }
}

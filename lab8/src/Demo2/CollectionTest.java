package Demo2;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionTest {
    public static void main(String[] args) {
        //因为接口要通过类来实现
        Collection col1=new ArrayList();
        Collection col2=new ArrayList();
        //1.添加元素
        //（1）添加元素
        col1.add(10);
        col1.add(new String("hellow"));
        System.out.println(col1);
        //（2）添加col1中的所有元素
        col2.addAll(col1);
        System.out.println(col2);
        //2.删除
        //(1)删除col1中的元素10
        col1.remove(10);
        System.out.println(col1);
        //（2）删除col1中与col2中相同的元素
        col1.removeAll(col2);
        System.out.println(col1);
        //(3)删除col1中与col2中相同的元素，如果有删除返回true
        boolean retainAll= col1.retainAll(col2);
        System.out.println(retainAll);
        //3.清空
        col2.clear();
        System.out.println(col2);
        //4.查询
        int size=col1.size();
        System.out.println(size);
        //5.打印集合中所有的元素
        System.out.println(col1);
        //这里会默认调用collection的子类Arraylist中的重写的toString方法，
        //由于ArrayList中没有对toString方法进行重写，但它的父类对tostring进行了重写
        //6.contains:查询集合中是否包含某个元素
        col1.add("Hellow");
        boolean contains= col1.contains("Hellow");
        System.out.println(contains);
        //7.containsAll:
        col2.add(10);
        col2.add("Hellow");
        boolean containsAll= col2.containsAll(col1);
        System.out.println(containsAll);
    }
}

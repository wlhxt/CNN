package Demo4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            int next=(int) iterator.next();
            if(next==2){
                iterator.remove();
            }else{
                System.out.println(next);
            }
        }
        System.out.println(list);
    }
}

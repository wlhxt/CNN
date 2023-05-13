package Demo6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaptraverseTest {
    public static void main(String[] args) {
        Map map=new HashMap();
        //1.添加数据
        map.put(1001L,"张三");
        map.put(1002L,"李四");
        map.put(1003L,"王五");
        map.put(1004L,"小二");
        //2.遍历map集合
        Set entrySet=map.entrySet();
        //map.entrySet实现了Set接口，Set通过map.entrySet()得到一个Set集合，
        // 集合里面元素即键值对默认类型为Object,可以通过泛型来规定类型为Map.Entry,
        // 也可以通过强制类型转化，把Object类型转化为Map.Entry，
        // 通过调用Map.Entry的getKey和getValue来获得键值对相应的值，赋值给Object类型的变量，然后打印输出
        for(Object obj: entrySet){
            if(obj instanceof Map.Entry){
                //obj运行时的类型是map.entrySet（）的类型，
                // 而map.enterSet（）里面有interator（）方法--》（在map.enterSet（）里面new实例化了一个EntrySet类，EntrySet类里面有一个interatir()方法）
                //interator（）方法又以EntryIterator类作为返回值，这是一个迭代器，里面只有next()方法，该next()方法的返回值是nextNode()方法，
                // 而nextNode()方法的返回值类型是Node,而Node类型是Map.Entry接口的实现类，不恰当的可以理解为map.enterSet（）实现了Map.Entry接口，返回值类型为Map.Entry类型
                //*** instanceof +++，当***的运行时的类型（看右边）为+++的实例化（继承）或***的运行时的类型（看右边）是+++的实现类（实现）时，返回值类型为true
                // 所以obj instanceof Map.Entry的判断为true(因为obj实现了Map.Entry接口)
                Map.Entry entry =(Map.Entry) obj;
                //获得entry中的键
                // Map.Entry接口里面包含了getKey和getValue方法
                // Map.Entry类重写getKey和getValue方法
                Object key=entry.getKey();
                Object value=entry.getValue();
                System.out.println(key+"="+value);
            }
        }
    }
}

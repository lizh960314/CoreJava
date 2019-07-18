package chapter5.objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj ){
        if (obj == null) {
            return null;
        }
        if (visited.contains(obj)) {
            return "...";
        }
        visited.add(obj);
        Class cl = obj.getClass();
        if (cl == String.class) {
            return (String) obj;
        }
        if (cl.isArray()) {
            //返回表示数组组件类型的 Class。如果此类不表示数组类，则此方法返回 null。
            String r = cl.getComponentType() + "[]{";
//           Array 类提供了动态创建和访问 Java 数组的方法。
//           getLength 如果对象不是数组，抛出 IllegalArgumentException
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {
                    r += ",";
                }
//              get 返回指定数组对象中索引组件的值。如果该值是一个基本类型值，则自动将其包装在一个对象中。
                Object val = Array.get(obj, i);
//              getComponentType()判定指定的 Class 对象是否表示一个基本类型。
//              有九种预定义的 Class 对象，表示八个基本类型和 void。这些类对象由 Java 虚拟机创建，与其表示的基本类型同名，即 boolean、byte、char、short、int、long、float 和 double。
//              这些对象仅能通过下列声明为 public static final 的变量访问，也是使此方法返回 true 的仅有的几个 Class 对象。
                if (cl.getComponentType().isPrimitive()) {
                    r += val;
                } else {
                    r += toString(val);
                }
            }
        }

        String r = cl.getName();
        //查询这个类和他的超类的所有域
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields,true);
//          获得所有域的名字
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("[")) {
                        r += ",";
                    }
                    r += f.getName();
                    try {
                        Class t = f.getType();
                        Object val = f.get(obj);
                        if (t.isPrimitive()) {
                            r += val;
                        } else {
                            r += toString(val);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl =cl.getSuperclass();
        } while (cl != null);
        return r;
    }
}

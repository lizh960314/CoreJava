import chapter5.arrayList.Employee;

/**
 * @author 李志豪
 * @date 2019/7/10 19:26:34
 * @description
 */
public class test {
    public static void main(String[] args) {
//        int x = 10;
//        double y=20.2;
//        long z = 10L;
//        String str = ""+x+y*z;
//        System.out.println(str);

//        boolean flag=10%2==1&&10/3==0&&1/0==0;
//        System.out.println(flag);

//        int i=10;
//        float f =1.3;
//         //出错double-float损失

//        System.out.println(inc(10)+inc(8)+inc(-10));
//        //35

//        int num = 2147483647;
//        num +=2L;
//        System.out.println(num);
//        //-2147483647

//        int sum = 0;
//        for (int i = 0; i <10 ; i++) {
//            sum +=i;
//            if (i%3==0){
//                break;
//            }
//        }
//        System.out.println(sum);

//        boolean a=1==0;
//        byte b=200;
//        System.out.println(b);

//        String str = "";
//        for (int i = 0; i < 5; i++) {
//            str+=i;
//        }
//        System.out.println(str);

//        int num = 2147483647;
//        num +=2;
//        System.out.println(num);

//        float [][] f1={{1,2f,1.4f},{4.3f,4.5f}};
//        Object oo = f1;
//        f1[1]=oo;
//        System.out.println(f1[1]);

        Employee e = new Employee();

//        Class c1 = e.getClass();
//        System.out.println(c1.getName());


        String className = "java.util.Random";
        try {
            Class c2 = Class.forName(className);
            System.out.println(c2.getName());
        }catch (ClassNotFoundException e1){
            e1.getStackTrace();
        }

//        Class c3 = Employee.class;
//        System.out.println(c3.getName());


    }
//
//    public  static int inc(int temp){
//        if (temp>0){
//            return temp*2;
//        }
//        return -1;
//    }



}

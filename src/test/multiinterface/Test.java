package test.multiinterface;

/**
 * @Title: Test
 * @Description:
 * @Company: hjsj
 * @Create time: 2023/12/26 16:54
 * @Author: huangwq
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("test.multiinterface.MultiInterface");
            FirstInterface firstInterface = (FirstInterface) cls.newInstance();
            System.out.println(firstInterface instanceof FirstInterface);
            System.out.println(firstInterface instanceof SecondInterface);
            firstInterface.add();
            SecondInterface secondInterface = (SecondInterface) cls.newInstance();
            System.out.println(secondInterface instanceof FirstInterface);
            System.out.println(secondInterface instanceof SecondInterface);
            secondInterface.add();
            secondInterface.add("1");
            secondInterface.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

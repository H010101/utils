package test;

/**
 * @Title: ExtendsTest
 * @Description:
 * @Company: hwqing
 * @Create time: 2023/10/26 10:26
 * @Author: hwqing
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        B b = new B();
        b.method1();
        b.method2();
    }
}


class A {
    public void method1() {
        System.out.println("父：1");
    }

    public void method2() {
        this.method3();
    }

    private void method3() {
        System.out.println("父：3");
        this.method1();
    }
}
class B extends A {
    public void method1() {
        System.out.println("子：1");
    }
}
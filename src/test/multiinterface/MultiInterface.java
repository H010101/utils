package test.multiinterface;

/**
 * @Title: MultiInterface
 * @Description: 多接口实现测试
 * @Company: hjsj
 * @Create time: 2023/12/26 16:46
 * @Author: huangwq
 * @Version 1.0
 */
public class MultiInterface implements FirstInterface, SecondInterface {


    @Override
    public void add() {
        System.out.println("add method execution!");
    }

    @Override
    public void add(String str) {
        System.out.println("add method execution! value = " + str);
    }

    @Override
    public void delete() {
        System.out.println("delete method execution!");
    }
}

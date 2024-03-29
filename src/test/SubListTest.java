package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Substring
 * @Description:
 * @Company: hwqing
 * @Create time: 2023/10/9 18:04
 * @Author: hwqing
 * @Version 1.0
 */
public class SubListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        System.out.println(list.subList(1,1));
        System.out.println(list.subList(1,2));
        System.out.println(list.subList(1, 5));
    }
}

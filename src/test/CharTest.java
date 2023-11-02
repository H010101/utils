package test;

/**
 * @Title: CharTest
 * @Description:
 * @Company: hjsj
 * @Create time: 2023/10/27 13:32
 * @Author: huangwq
 * @Version 1.0
 */
public class CharTest {
    public static void main(String[] args) {
        String str1 = "A";
        String str2 = String.valueOf((char) (str1.charAt(0) + 1));
        System.out.println(str2);
    }
}

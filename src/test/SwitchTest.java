package test;

/**
 * @Title: SwitchTest
 * @Description:
 * @Company: hwqing
 * @Create time: 2023/10/26 18:04
 * @Author: hwqing
 * @Version 1.0
 */
public class SwitchTest {
    public static void main(String[] args) {
        String text = "1";
        switch (text){
            case "1":
                System.out.println("1");
            case "2":
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }
}

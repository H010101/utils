package test;

/**
 * @Title: SubStringBuilderTest
 * @Description:
 * @Company: hjsj
 * @Create time: 2024/2/26 14:51
 * @Author: huangwq
 * @Version 1.0
 */
public class SubStringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sql = new StringBuilder();
        sql.append("0123456789");
        sql.setLength(sql.length() - 1);
        System.out.println(sql);
    }
}

package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Title: RoundedUp
 * @Description:
 * @Company: hjsj
 * @Create time: 2024/1/22 16:06
 * @Author: huangwq
 * @Version 1.0
 */
public class RoundedUp {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("3.2");
        System.out.println(bigDecimal.setScale(0, RoundingMode.CEILING));
    }
}

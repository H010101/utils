package utils;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @Title: NumberFormatter
 * @Description:
 * @Company: hwqing
 * @Create time: 2023/11/6 15:03
 * @Author: hwqing
 * @Version 1.0
 */
public class NumberFormatter {

    /**
     * 格式化数字类型
     *
     * @param numberStr  要进行格式化的字符串
     * @param scale      小数位数
     * @param autoLength 自动长度标识  true：保留小数时舍去多余的0
     */
    public static String numberFormat(String numberStr, int scale, boolean autoLength) throws Exception {
        // 为空直接返回空
        if (StringUtils.isBlank(numberStr)) {
            return "";
        }
        // 返回值
        String returnNum = numberStr;
        try {
            // 格式化符号
            String symbol = autoLength ? "#" : "0";
            // 处理小数位数
            StringBuilder formatPattern = new StringBuilder("0");
            if (scale > 0) {
                formatPattern.append(".");
                for (int i = 0; i < scale; i++) {
                    formatPattern.append(symbol);
                }
            }
            // 格式化
            DecimalFormat decimalFormat = new DecimalFormat(formatPattern.toString());
            returnNum = decimalFormat.format(Double.parseDouble(returnNum));
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("numberFormat error!");
        }
        return returnNum;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(NumberFormatter.numberFormat("0E-8", 2, false));
    }
}

package utils;

import java.util.Random;

/**
 * 生成32位随机字符串
 */
public class Char32Generated {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int LENGTH = 32;

    public static String generateChar32() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(LENGTH);

        for (int i = 0; i < LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(generateChar32());
    }
}
package test;

/**
 * @Title: Rectangle
 * @Description:
 * @Create time: 2023/11/28 15:49
 * @Version 1.0
 */
public class Rectangle {
    /**
     * 每日一题Java&web：
     * 给定一个仅包含0和1、大小为rows x cols的二维二进制矩阵，找出只包含1的最大矩形，并返回其面积。
     */
    public static void main(String[] args) {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        // [
        // ["1","1","1","1","1","1","1","1"],
        // ["1","1","1","1","1","1","1","0"],
        // ["1","1","1","1","1","1","1","0"],
        // ["1","1","1","1","1","0","0","0"],
        // ["0","1","1","1","1","0","0","0"]
        // ]

        System.out.println(new Rectangle().maximalRectangle(matrix));
    }

    public int maximalRectangle(char[][] matrix) {
        int num = 0;
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        // 起始行
        for (int rowBegin = 0; rowBegin < rowLength; rowBegin++) {
            // 结束行
            for (int rowEnd = rowLength - 1; rowEnd >= rowBegin; rowEnd--) {
                // 起始列
                for (int colBegin = 0; colBegin < colLength; colBegin++) {
                    // 结束列
                    for (int colEnd = colLength - 1; colEnd >= colBegin; colEnd--) {
//                        int calcNum = this.calcNumByIndex(rowBegin, rowEnd, colBegin, colEnd, matrix);
//                        if (calcNum > num) {
//                            num = calcNum;
//                        }
                        int calcNum = 0;
                        index :for (int rowIndex = rowBegin; rowIndex <= rowEnd; rowIndex++) {
                            for (int colIndex = colBegin; colIndex <= colEnd; colIndex++) {
                                if (matrix[rowIndex][colIndex] == '1') {
                                    calcNum++;
                                } else {
                                    calcNum = 0;
                                    colEnd = colIndex - 1;
                                    break index;
                                }
                            }
                        }
                        if (calcNum > num) {
                            num = calcNum;
                        }
                    }
                }
            }
        }
        return num;
    }

    private int calcNumByIndex(int rowBegin, int rowEnd, int colBegin, int colEnd, char[][] matrix) {
        int calcNum = 0;
        for (int rowIndex = rowBegin; rowIndex <= rowEnd; rowIndex++) {
            for (int colIndex = colBegin; colIndex <= colEnd; colIndex++) {
                if (matrix[rowIndex][colIndex] == '1') {
                    calcNum++;
                } else {
                    return 0;
                }
            }
        }
        return calcNum;
    }
}

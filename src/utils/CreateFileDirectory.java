package utils;
import java.io.File;

/**
 * @Title: CreateFileDirectory
 * @Description:
 * @Company: hwqing
 * @Create time: 2023/9/27 18:02
 * @Author: hwqing
 * @Version 1.0
 */
public class CreateFileDirectory {
    public static void createDirectory(String packageName, String directoryPath) {
        String path = directoryPath + File.separator + packageName.replace(".", File.separator).replace("/", File.separator);
        File directory = new File(path);
        directory.mkdirs();

        if (directory.exists()) {
            System.out.println("文件目录创建成功！");
        } else {
            System.out.println("文件目录创建失败！");
        }
    }

    public static void main(String[] args) {
        String packageName = "com.hjsj.hrms.module.performance.targetcard";
        packageName = "hrms/module/performance/plan";
        String directoryPath = "C:\\Users\\hwqin\\Desktop\\广州打捞局";

        createDirectory(packageName, directoryPath);
    }
}

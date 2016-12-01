package demo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Created by wolf on 2016/11/29.
 * @author wolf
 * 生产百万大数据
 */
public class LargerData {
    public static String path = "F:\\DataFile\\LargerData.txt";
    public static void writeData(){
        try {
        File largerData = new File(path);
        if(!largerData.exists()){
            //如果不存在这创建该文件
            largerData.createNewFile();
        }
            FileWriter fw = new FileWriter(largerData);
            BufferedWriter bf = new BufferedWriter(fw);
            for (long i=0;i<10000000;i++){
                bf.write(String.valueOf(i));
                bf.newLine();
            }
            bf.flush();
            bf.close();
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

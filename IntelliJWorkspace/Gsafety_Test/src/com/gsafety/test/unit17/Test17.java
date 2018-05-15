package com.gsafety.test.unit17;

import java.io.*;

public class Test17 {

    //将文字写入文件
    public static boolean strToFile(String str, File f){
        if (f.exists()){
            f.delete();
            System.out.println("存在的文件"+f.getName()+"已删除！");
        }
        try {
            f.createNewFile();
            System.out.println("文件"+f.getName()+"已创建！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(str);
            fw.close();
            System.out.println("写入文件"+f.getName()+"成功！");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入要创建的文件名称：");
        try {
            String str = br.readLine();
            File file = new File(str);
            while (file.exists()){
                System.out.println("已存在该文件，请重新输入名称：");
                str = br.readLine();
                file = new File(str);
            }
            System.out.println("请输入要存入文件的内容：");
            str=br.readLine();
            Test17.strToFile(str, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package main.java;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
public class Main {

    public static void bufferWrite(){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
            out.write("test");
            out.close();
            System.out.println("文件创建成功");
        } catch (IOException e){
        }
    }

    public static void bufferRead(){
        try{
            BufferedReader in = new BufferedReader(new FileReader("test.txt"));
            String str;
            while((str=in.readLine())!=null)
                System.out.println(str);
            System.out.println(str);
        } catch (IOException e){
        }
    }

    public static void createFile(){
        try{
            String fileName = "delFile.txt";
            File file = new File(fileName);
            delFile(fileName);
            if(file.createNewFile())
                System.out.println(file.getName()+" 创建成功");
            else
                System.out.println(file.getName()+" 创建失败");
            delFile(fileName);
        }
        catch (Exception e){
        }
    }

    public static void delFile(String fileName){
        try{
            File file = new File(fileName);
            if(file.delete())
                System.out.println(file.getName()+" 已删除.");
            else
                System.out.println("文件删除失败");
        }
        catch (Exception e){
        }
    }

    public static void copyContentBuffer(){
        try {
            String srcFile = "srcFile.txt";
            String destFile = "destFile.txt";
            String str;
            BufferedWriter out1 = new BufferedWriter(new FileWriter(srcFile, true));
            out1.write("string to be copied\n");
            out1.close();
            BufferedReader in1 = new BufferedReader(new FileReader(srcFile));
            BufferedWriter out2 = new BufferedWriter(new FileWriter(destFile));
            BufferedReader in2 = new BufferedReader(new FileReader(destFile));
            while((str = in1.readLine())!=null)
                out2.write(str);
            in1.close();
            out2.close();
            while((str = in2.readLine())!=null)
                System.out.println(str);
            in2.close();
        }
        catch (IOException e){
        }
    }

    public static void copyContentByte(){
        try {
            String srcFile = "srcFile.txt";
            String destFile = "destFile.txt";
            int dataSize = 10000;
            byte[] data = new byte[dataSize];
            Arrays.fill(data, (byte)0xFF);
            String str;
            FileOutputStream out1 = new FileOutputStream(new File(srcFile));
            out1.write(data);
            out1.close();
            FileInputStream in1 = new FileInputStream(new File(srcFile));
            FileOutputStream out2 = new FileOutputStream(new File(destFile));
            FileInputStream in2 = new FileInputStream(new File(destFile));
            while((dataSize = in1.read(data)) > 0)
                out2.write(data);
            in1.close();
            out2.close();
            while((dataSize = in2.read(data))> 0)
                System.out.println(dataSize);
            in2.close();
        }
        catch (IOException e){
        }
    }

    public static void createTmpFile(){
        try {
            File tmpFile = File.createTempFile("pattern", ".txt");
            if(tmpFile.exists())
                System.out.println("临时文件创建完成");
            tmpFile.deleteOnExit();
            BufferedWriter out = new BufferedWriter(new FileWriter(tmpFile));
            out.write("aString");
            out.close();
        }
        catch (IOException e){
        }
    }

    public static void changeTime(){
        try{
            File fileToChange = new File("fileToChange.txt");
            fileToChange.createNewFile();
            Date filetime = new Date(fileToChange.lastModified());
            System.out.println(filetime.toString());
            fileToChange.setLastModified(0);
            filetime = new Date(fileToChange.lastModified());
            System.out.println(filetime.toString());
            if(fileToChange.delete())
                System.out.println("文件已经删除");
        }
        catch (Exception e){
        }
    }

    public static void main(String args[]){

    }
}
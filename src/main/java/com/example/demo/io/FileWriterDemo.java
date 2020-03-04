package com.example.demo.io;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;

import java.io.PrintWriter;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter("E:\\test\\b.txt");
        FileReader fileReader = new FileReader("E:\\test\\douyin_user_ids.txt");
//        fileWriter.write(fileReader.readString());
        fileWriter.append("abc");
        PrintWriter printWriter = fileWriter.getPrintWriter(false);
    }
}

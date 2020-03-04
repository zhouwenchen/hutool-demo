package com.example.demo.io;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

/**
 * 文件和流的操作
 */
public class IoUtilDemo {
    public static void main(String[] args) {
        try  {
            BufferedInputStream in = FileUtil.getInputStream("E:\\test\\douyin_user_ids.txt");
            BufferedOutputStream out = FileUtil.getOutputStream("E:\\test\\douyin_user_ids2.txt");
            long copysize = IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);
            System.out.println(copysize);
        }catch (Exception e){
        }
    }
}

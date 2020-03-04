package com.example.demo.io;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.watch.SimpleWatcher;
import cn.hutool.core.io.watch.WatchMonitor;
import cn.hutool.core.io.watch.Watcher;
import cn.hutool.core.io.watch.watchers.DelayWatcher;
import cn.hutool.core.lang.Console;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.WatchEvent;

/**
 * 文件监听机制
 */
public class WatchMonitorDemo {
    public static void main(String[] args) {
        // 实现了所有的方法
//        Watch();
        // 简单的方式，不需要实现所有的方法
//        WatchSimpleDate();
        File file = FileUtil.file("E:\\test\\b.txt");
        WatchMonitor.createAll("E:\\test", new DelayWatcher(new SimpleWatcher(){
            @Override
            public void onModify(WatchEvent<?> event, Path currentPath) {
                Console.log("{}->{}",event.context(),currentPath);
            }
        },3000)).start();
    }

    private static void WatchSimpleDate() {
        File file = FileUtil.file("E:\\test\\b.txt");
        WatchMonitor watchMonitor = WatchMonitor.create(file, WatchMonitor.ENTRY_MODIFY);
        watchMonitor.setWatcher(new SimpleWatcher(){
            @Override
            public void onModify(WatchEvent<?> event, Path currentPath) {
                Object context = event.context();

                Console.log("文件被修改了，是否检查文件的内容\t" + context+"\t" + currentPath);
            }
        }).start();
    }

    private static void Watch() {
        File file = FileUtil.file("E:\\test\\b.txt");
        WatchMonitor watchMonitor = WatchMonitor.create(file, WatchMonitor.ENTRY_MODIFY);
        watchMonitor.setWatcher(new Watcher() {
            @Override
            public void onCreate(WatchEvent<?> watchEvent, Path path) {
                Object obj = watchEvent.context();
                Console.log("创建：{}->{}",path,obj);
            }

            @Override
            public void onModify(WatchEvent<?> watchEvent, Path path) {
                Object obj = watchEvent.context();
                Console.log("修改：{}-> {}", path, obj.toString());
            }

            @Override
            public void onDelete(WatchEvent<?> watchEvent, Path path) {
                Object obj = watchEvent.context();
                Console.log("删除：{}-> {}", path, obj);
            }

            @Override
            public void onOverflow(WatchEvent<?> watchEvent, Path path) {
                Object obj = watchEvent.context();
                Console.log("Overflow：{}-> {}", path, obj);
            }
        });
        //设置监听目录的最大深入，目录层级大于制定层级的变更将不被监听，默认只监听当前层级目录
        watchMonitor.setMaxDepth(1);
        //启动监听
        watchMonitor.start();
    }
}

package com.example.demo.ext;

import cn.hutool.system.*;

/**
 *
 */
public class SystemUtilDemo {
    public static void main(String[] args) {
        // 运行时信息，包括内存总大小、已用大小、可用大小等
        RuntimeInfo runtimeInfo = SystemUtil.getRuntimeInfo();
        System.out.println(runtimeInfo);

        HostInfo hostInfo = SystemUtil.getHostInfo();
        System.out.println(hostInfo);

        UserInfo userInfo = SystemUtil.getUserInfo();
        System.out.println(userInfo);

        OsInfo osInfo = SystemUtil.getOsInfo();
        System.out.println(osInfo);

        JavaRuntimeInfo javaRuntimeInfo = SystemUtil.getJavaRuntimeInfo();
        System.out.println(javaRuntimeInfo);
    }
}

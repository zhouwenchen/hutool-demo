package com.example.demo.util;

import cn.hutool.core.lang.ObjectId;
import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

/**
 * IDUtil的工具类
 */
public class IdUtilDemo {
    public static void main(String[] args) {
        String s = IdUtil.simpleUUID();
        String s1 = IdUtil.randomUUID();
        String s2 = IdUtil.fastUUID();
        System.out.println(s +"\r\n" + s1 +"\r\n"+s2);

        //生成类似：5b9e306a4df4f8c54a39fb0c
        String id = ObjectId.next();

        //方法2：从Hutool-4.1.14开始提供
        String id2 = IdUtil.objectId();
        System.out.println(id +"\r\n"+id2);


        //参数1为终端ID
        //参数2为数据中心ID
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        long id3 = snowflake.nextId();
        System.out.println(id3);
    }
}

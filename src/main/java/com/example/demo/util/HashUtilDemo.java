package com.example.demo.util;

import cn.hutool.core.util.HashUtil;

/**
 * HashUtil 的 demo 的测试
 * additiveHash 加法hash
 * rotatingHash 旋转hash
 * oneByOneHash 一次一个hash
 * bernstein Bernstein's hash
 * universal Universal Hashing
 * zobrist Zobrist Hashing
 * fnvHash 改进的32位FNV算法1
 * intHash Thomas Wang的算法，整数hash
 * rsHash RS算法hash
 * jsHash JS算法
 * pjwHash PJW算法
 * elfHash ELF算法
 * bkdrHash BKDR算法
 * sdbmHash SDBM算法
 * djbHash DJB算法
 * dekHash DEK算法
 * apHash AP算法
 * tianlHash TianL Hash算法
 * javaDefaultHash JAVA自己带的算法
 * mixHash 混合hash算法，输出64位的值
 */
public class HashUtilDemo {
    public static void main(String[] args) {
        int i = HashUtil.rotatingHash("a",10 );
        System.out.println(i);
        
    }
}

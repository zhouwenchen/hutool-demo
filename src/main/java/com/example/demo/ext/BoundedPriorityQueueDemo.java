package com.example.demo.ext;

import cn.hutool.core.collection.BoundedPriorityQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public class BoundedPriorityQueueDemo {
    public static void main(String[] args) {
        BoundedPriorityQueue queue = new BoundedPriorityQueue<Integer>(5);
        //初始化队列，使用自定义的比较器
        queue = new BoundedPriorityQueue<Integer>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        //定义了6个元素，当元素加入到队列中，会按照从小到大排序，当加入第6个元素的时候，队列末尾（最大的元素）将会被抛弃
        int[] arr = new int[]{8,1,2,5,6,4,7,0};

        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        // 队列转化成list集合
        ArrayList arrayList = queue.toList();
        System.out.println(queue);

    }
}

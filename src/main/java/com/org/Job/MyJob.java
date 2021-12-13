package com.org.Job;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author HP
 * @Date 2021/11/29 14:09
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class MyJob {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void abc(){
        System.out.println(sdf.format(new Date()));
    }
}

package com.org;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Author HP
 * @Date 2021/12/4 12:45
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class Test {
    public static void main(String[] args) {
       // 获取当前月份
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.MARCH,1);
        instance.set(Calendar.DAY_OF_MONTH,0);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
        String format = dateFormat.format(instance.getTime());
        System.out.println("本月最后一天是："+format);
    }
}

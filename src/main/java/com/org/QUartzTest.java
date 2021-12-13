package com.org;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
/**
 * @Author HP
 * @Date 2021/11/29 14:21
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

public class QUartzTest {

    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:application-Quartz.xml");
        System.in.read();
    }
}

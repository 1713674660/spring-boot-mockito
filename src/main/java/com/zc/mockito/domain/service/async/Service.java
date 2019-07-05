package com.zc.mockito.domain.service.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Classname Service
 * @Description TODO
 * @Date 2019/7/5 16:55
 * @Author is zhangchi
 */
@Component
public class Service {

    @Async("ThreadPoolTest")
    public void print(){
        System.out.println(Thread.currentThread().getName()+":开始执行print方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":结束执行print方法");
    }

    @Async("ThreadPoolTest")
    public void printTest(){
        System.out.println(Thread.currentThread().getName()+":开始执行printTest方法");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":结束执行printTest方法");
    }

}

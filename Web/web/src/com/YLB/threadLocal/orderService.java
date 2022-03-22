package com.YLB.threadLocal;

public class orderService {
    public void createOrder(){
        String name = Thread.currentThread().getName();
        System.out.println("orderService当前线程["+name+"]中保存的数据是："+ThreadLocalTest.threadLocal.get());
        new orderDao().saveOrder();
    }
}

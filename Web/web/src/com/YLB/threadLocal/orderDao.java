package com.YLB.threadLocal;

public class orderDao {
    public void saveOrder(){
        String name = Thread.currentThread().getName();
        System.out.println("orderDao当前线程["+name+"]中保存的数据是："+ThreadLocalTest.threadLocal.get());
    }
}

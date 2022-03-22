package com.example.webflux.reactor8;

import java.util.Observable;

public class ObserveDemo extends Observable {
    public static void main(String[] args) {
        ObserveDemo observeDemo = new ObserveDemo();
//        添加观察者
        observeDemo.addObserver((o,arg)->{
            System.out.println("发生变化");
        });

        observeDemo.addObserver((o,arg)->{
            System.out.println("收到被观察者通知，准备改变");
        });
//        数据变化
        observeDemo.setChanged();
//        通知观察者
        observeDemo.notifyObservers();
    }

}

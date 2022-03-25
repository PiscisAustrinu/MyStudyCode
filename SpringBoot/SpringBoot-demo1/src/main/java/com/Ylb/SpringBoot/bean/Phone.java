package com.Ylb.SpringBoot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author：Yang Lingbo
 * Date:2022/3/25 20:34
 * Description:
 */

/**
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 */
//@Component
@ConfigurationProperties(prefix = "my-phone")
public class Phone {
    private String brand;
    private Integer price;

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Phone() {
    }

    public Phone(String brand, Integer price) {
        this.brand = brand;
        this.price = price;
    }
}

package com.Ylb.SpringBoot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
@Component
@ConfigurationProperties(prefix = "my-phone")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private String brand;
    private Integer price;

}

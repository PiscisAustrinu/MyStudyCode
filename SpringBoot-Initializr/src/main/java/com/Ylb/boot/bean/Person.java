package com.Ylb.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author：Yang Lingbo
 * Date:2022/3/27 16:40
 * Description:
 */
@ToString
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Boolean boss;
    private Date birthday;
    private Integer age;
    private Pet pet;
    private String[] hobbies;
    private List<String> animal;
    private Map<String,Object> score;
    private Set<Double> salary;
    private Map<String,List<Pet>> allPets;
}

/**

 * @ author     :杨凌波

 * @ Time    :11:28

 * @ Description:

 * @ Date       :2021/12/11

*/
package com.Ylb.pojo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
public class Person {
//    需求：输出Person类中的普通属性，数组属性。List集合属性和map集合属性
    private String name;
    private String[] phones;
    private List<String> cities;
    private Map<String,String> map;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public Map<String, String> getMap() {
        return map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", phones=" + Arrays.toString(phones) +
                ", cities=" + cities +
                ", map=" + map +
                '}';
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Person(String name, String[] phones, List<String> cities, Map<String, String> map) {
        this.name = name;
        this.phones = phones;
        this.cities = cities;
        this.map = map;
    }
}

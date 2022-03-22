package com.Ylb.pojo;

public class Student {
    private Integer id;
    private String username;
    private String password;
    private String phones;

    public Student() {
    }

    public Student(Integer id, String username, String password, String phones) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phones = phones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phones='" + phones + '\'' +
                '}';
    }
}

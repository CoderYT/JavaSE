package com.yangtao.www.class3_5;

import java.util.Objects;

/**
 * @author CoderYT
 * @date 2020/5/12
 **/
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",12);
        Student s2 = new Student("zhangsan",12);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
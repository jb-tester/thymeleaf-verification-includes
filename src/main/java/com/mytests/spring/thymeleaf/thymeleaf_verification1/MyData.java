package com.mytests.spring.thymeleaf.thymeleaf_verification1;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 1/18/2019.
 * Project: thymeleaf-verification1
 * *******************************
 */
public class MyData {
    private final String city;
    private final String name;
    private final int age;

    public MyData(String name, int age, String city) {
      this.name = name;
      this.age = age;
      this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isNull(){
        return this.age>18;
    }
}

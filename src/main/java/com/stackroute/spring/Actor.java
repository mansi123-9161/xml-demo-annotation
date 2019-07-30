package com.stackroute.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
    private String name;
  //   @Value("12")
    private int age;
   //  @Value("male")
    private String gender;


    public String getName() {
        return name;
    }
     @Value("${actor.name}")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Value("${actor.age}")
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    @Value("${actor.gender}")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

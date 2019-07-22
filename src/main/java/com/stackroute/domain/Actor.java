package com.stackroute.domain;

public class Actor {
//declaring variables
  String name;
  String gender;
  int age;

  public Actor(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

//generating setter
  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public void display(){
    System.out.println("actor details: "+ "\n" + name + "\n" + gender + "\n"  + age);
  }
}

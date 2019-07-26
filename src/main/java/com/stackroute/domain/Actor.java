package com.stackroute.domain;

//declaring variables
public class Actor {
  String name;
  String gender;
  int age;

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
  
  //method to display
  public void display(){
    System.out.println("actor details: "+ "\n" + name + "\n" + gender + "\n"  + age);
  }
}

package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware , BeanNameAware {

  Actor actor;

  public Movie(){

  }

  public Actor getActor() {
    return actor;
  }

  public Movie(Actor actor) {
    this.actor = actor;
  }



  public void setActor(Actor actor) {
    this.actor = actor;
  }
  public void displayActor()
  {
    actor.display();
  }
//using application context
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("Application Context implemented");

  }
//using bean factory
  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("Bean factory implemented");

  }

  @Override
  public void setBeanName(String s) {
    System.out.println("Bean Name implemented ");

  }
}

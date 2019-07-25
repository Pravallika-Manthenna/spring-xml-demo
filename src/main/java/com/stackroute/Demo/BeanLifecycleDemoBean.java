package com.stackroute.Demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean , DisposableBean {
 public void customInit(){
   System.out.println("custom is initiated");

 }
 public void customDestroy(){
   System.out.println("custom is destroyed");
 }
//implementing initializing bean methods
  @Override
  public void afterPropertiesSet() throws Exception {

    System.out.println("after properties set implemented");

  }
// implementing disposable bean method
  @Override
  public void destroy() throws Exception {
    System.out.println("destroy is implemented");

  }
}

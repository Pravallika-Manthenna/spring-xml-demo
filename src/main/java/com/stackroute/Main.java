package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

//main class
public class Main {
  public  static  void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Movie movie = context.getBean("Movie", Movie.class);
    movie.displayActor();

// display method
    Movie movie1 = context.getBean("Movie1", Movie.class);
    movie.displayActor();

    System.out.println(movie==movie1);
  }
}

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

public class Main {
  public  static  void main(String[] args) {
    
    //using application context
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Movie movie = context.getBean("Movie", Movie.class);
    movie.displayActor();

    //using beanFactory
    BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
    Movie picture = (Movie) beanFactory.getBean("Movie");
    picture.displayActor();

    //using bean definition registory and bean reader
    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    BeanDefinitionRegistry register = new GenericApplicationContext(factory);
    BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
    reader.loadBeanDefinitions("bean.xml");
    Movie picture1 = (Movie) factory.getBean("Movie");
    picture1.displayActor();
  }
}

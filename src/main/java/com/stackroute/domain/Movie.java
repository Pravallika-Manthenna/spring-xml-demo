package com.stackroute.domain;


//creating object for actor class
 Actor actor;

public class Movie {

  //generating setter and getter
  public Actor getActor()
  {
    return actor;
  }
  
  public void setActor(Actor actor) 
  {
    this.actor = actor;
  }
  public void displayActor()
  {
    actor.display();
  }

}

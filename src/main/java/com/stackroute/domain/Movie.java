package com.stackroute.domain;


//creating object for actor class

public class Movie {
  Actor actor;

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

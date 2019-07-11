package com.stackroute.domain;

public class Movie {

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

}

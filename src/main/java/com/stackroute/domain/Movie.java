package com.stackroute.domain;

public class Movie {
  public Movie(Actor actor) {
    this.actor = actor;
  }

  Actor actor;

  public Actor getActor() {
    return actor;
  }



  public void setActor(Actor actor) {
    this.actor = actor;
  }
  public void displayActor()
  {
    actor.display();
  }

}

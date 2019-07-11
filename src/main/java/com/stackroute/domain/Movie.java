package com.stackroute.domain;

public class Movie {

  public Actor getActor() {
    return actor;
  }

  Actor actor;

  public void setActor(Actor actor) {
    this.actor = actor;
  }
  public void displayActor()
  {
    actor.display();
  }

}

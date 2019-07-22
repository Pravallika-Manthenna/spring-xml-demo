package com.stackroute.domain;

public class Movie {
  public Movie(Actor actor) {
    this.actor = actor;
  }
//creating object for actor class
  Actor actor;
//generating getter
  public Actor getActor() {
    return actor;
  }


//generating setter
  public void setActor(Actor actor) {
    this.actor = actor;
  }
  //method to display
  public void displayActor()
  {
    actor.display();
  }

}

public abstract class Creature extends Thing {
  private String ate;
  
  public Creature(String name) {
    super(name);
    this.ate = "";
  }

  public void eat(Thing aThing) {

    this.ate = aThing.toString();
    
    System.out.println(this + " has just eaten a " + aThing + ".");

  }

  public void whatDidYouEat() {
    if (this.ate == "") {
      System.out.println(this + " has had nothing to eat!");
    } else {
      System.out.println(this + " has eaten a " + this.ate + ".");
    }
  }
  

  public abstract void move();

}



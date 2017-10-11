public class Bat extends Creature implements Flyer {

  public Bat(String name) {
    super(name);
  }


  public void move() {
    this.fly();
  }

  public void eat(Thing aThing) {
    
  }
  
  
  public void fly() {
    System.out.println(this + " is swooping through the dark.");
  }

}

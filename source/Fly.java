public class Fly extends Creature implements Flyer {

  public Fly(String name) {
    super(name);
  }


  public void move() {
    this.fly();
  }

  public void eat(Thing aThing) {

  }


  public void fly() {
    System.out.println(this + " is buzzing around in flight.");
  }

}

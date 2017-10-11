public class Thing extends Object {

  private String _name;
  
  public Thing(String name) {
    this.setName(name);
  }

  public void setName(String name) {
    this._name = name;
  }
  
  public String getName() {
    return this._name;
  }

  
  public String toString() {
    if (this.getClass().getName() == "Thing") {
      return this.getName();
    } else {
      return (this.getName() + " " + this.getClass().getSimpleName());
    }
  }
}

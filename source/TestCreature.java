public class TestCreature {

  public static final int CREATURE_COUNT = 6;
  public static final int THING_COUNT = 10;

  public static void main (String[] args)  {
    TestCreature.start();
  }


  public static void start() {

    // **
    // Things

    
    Thing ThingArray[] = new Thing[TestCreature.THING_COUNT];

    for (int i = 0; i < ThingArray.length; i++) {
      ThingArray[i] = new Thing("THNG" + i);
    }

    System.out.println("Things:");
    for (int i = 0; i < ThingArray.length; i++) {
      System.out.println(ThingArray[i]);

    }


    // **
    // Tigers
    
    int c = TestCreature.THING_COUNT / 2;
    for (int i = 0; i < c; i++) {
      ThingArray[i] = new Tiger("TGR" + i);
    }

    System.out.println("Things with Tigers:");
    for (int i = 0; i < ThingArray.length; i++) {
      System.out.println(ThingArray[i]);

    }

    ((Tiger)ThingArray[0]).move();


    // **
    // Creatures

    Creature CreatureArray[] = new Creature[TestCreature.CREATURE_COUNT];

    for (int i = 0; i < CreatureArray.length / 3; i++) {
      CreatureArray[i] = new Bat("BAT" + i);
    }

    for (int i = CreatureArray.length / 3; i < (CreatureArray.length / 3) * 2; i++) {
      CreatureArray[i] = new Ant("ANT" + i);
    }

    for (int i = (CreatureArray.length / 3) * 2; i < CreatureArray.length; i++) {
      CreatureArray[i] = new Fly("FLY" + i);
    }

    System.out.println("Creatures:");
    for (int i = 0; i < CreatureArray.length; i++) {
      System.out.println(CreatureArray[i]);
    }

    CreatureArray[0].move();
    CreatureArray[2].move();
    CreatureArray[4].move();


    

  }

}

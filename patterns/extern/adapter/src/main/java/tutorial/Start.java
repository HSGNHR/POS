package tutorial;

public class Start {
  public static void main(String[] args) {
    EnemyTank testTank = new EnemyTank();
    testTank.fireWeapon();

    EnemyRobot testRobot = new EnemyRobot();
    testRobot.smashWithHands(); //call without adapter

    EnemyRobotAdapter testAdapter = new EnemyRobotAdapter(testRobot);
    testAdapter.fireWeapon(); //call with adapter
  }
}


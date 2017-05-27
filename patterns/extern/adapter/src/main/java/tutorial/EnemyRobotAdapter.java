package tutorial;

public class EnemyRobotAdapter implements EnemyAttacker {
  
  EnemyRobot robot = null;

  public EnemyRobotAdapter(EnemyRobot robot) {
    this.robot = robot;
  }

  public void driveForward() {
    robot.walkForward();
  }

  public void fireWeapon() {
    robot.smashWithHands();
  }

  public void assignDriver(String driver) {
    robot.reactToHuman(driver);
  }
}

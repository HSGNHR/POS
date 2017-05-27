package tutorial;

public class EnemyTank implements EnemyAttacker {
  
  public void driveForward() {
    System.out.println("Enemy Tank drives forward.\n");
  }

  public void fireWeapon() {
    System.out.println("Enemy Tank fires Weapon\n");
  }

  public void assignDriver(String driver) {
    System.out.println("Driver " + driver + " assigned.\n");
  }
}

public class Centaur {
  private String name;
  private String breed;
  private int crankiness;
  private boolean standing;
  private boolean laying;
  private boolean sleeping;

  // Constructor
  public Centaur(String name, String breed, boolean standing, boolean laying, boolean sleeping) {
    this.name = name;
    this.breed = breed;
    this.standing = standing;
    this.laying = laying;
    this.sleeping = sleeping;
    this.crankiness = 0; // Default initial crankiness
  }

  // Overloaded constructor with default values for standing, laying, and sleeping
  public Centaur(String name, String breed) {
    this(name, breed, true, false, false);
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getBreed() {
    return breed;
  }

  public int getCrankiness() {
    return crankiness;
  }

  public boolean isStanding() {
    return standing;
  }

  public boolean isLaying() {
    return laying;
  }

  public boolean isSleeping() {
    return sleeping;
  }

  // Setters
  public void setCrankiness(int crankiness) {
    this.crankiness = crankiness;
  }

  public void setStanding(boolean standing) {
    this.standing = standing;
  }

  public void setLaying(boolean laying) {
    this.laying = laying;
  }

  public void setSleeping(boolean sleeping) {
    this.sleeping = sleeping;
  }

  // Methods
  public String shoot() {
    crankiness++;
    return crankiness < 3 ? "Twang!!!" : "NO!";
  }

  public String run() {
    crankiness++;
    return crankiness < 3 ? "Clop clop clop clop!!!" : "NO!";
  }

  public boolean isCranky() {
    return crankiness >= 3;
  }

  public String sleep() {
    if (standing) {
      return "NO!";
    } else {
      sleeping = true;
      crankiness = 0;
      return "";
    }
  }

  public void layDown() {
    crankiness = 3;
    standing = false;
    laying = true;
  }

  public void standUp() {
    standing = true;
    laying = false;
  }
}

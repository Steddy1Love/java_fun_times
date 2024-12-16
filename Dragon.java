public class Dragon {
  private String name;
  private String rider;
  private String color;
  private boolean hungryness;
  private int food_consumed;
  private boolean fire;

  // Constructor
  public Dragon(String name, String rider, String color, boolean hungryness, int food_consumed, boolean fire) {
    this.name = name;
    this.rider = rider;
    this.color = color;
    this.hungryness = hungryness;
    this.food_consumed = food_consumed;
    this.fire = fire;
  }

  // Overloaded constructor with default values for hungryness, food_consumed, and
  // fire
  public Dragon(String name, String rider, String color) {
    this(name, rider, color, true, 0, false);
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getRider() {
    return rider;
  }

  public String getColor() {
    return color;
  }

  public boolean isHungry() {
    return hungryness;
  }

  public int getFoodConsumed() {
    return food_consumed;
  }

  public boolean isFire() {
    return fire;
  }

  // Setters

  public void setHungry(boolean hungryness) {
    this.hungryness = hungryness;
  }

  public void setFoodConsumed(int food_consumed) {
    this.food_consumed = food_consumed;
  }

  public void setFire(boolean fire) {
    this.fire = fire;
  }

  // Methods

  public void eat() {
    this.food_consumed += 1;
    if (food_consumed < 3) {
      this.hungryness = true;
    } else {
      this.hungryness = false;
    }
  }

  public void breatheFire() {
    if (this.hungryness == true) {
      this.fire = false;
    } else {
      this.fire = true;
      this.hungryness = true;
    }
  }
}

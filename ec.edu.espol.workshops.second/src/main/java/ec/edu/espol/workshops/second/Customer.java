package ec.edu.espol.workshops.second;

public class Customer {
  private int Age;
  private char sex;
  private boolean isMarried;
  private boolean hasLincense = false;

  public Customer(int age, char sex, boolean isMarried) {
    this.Age = age;
    this.sex = sex;
    this.isMarried = isMarried;
  }

  public boolean canBuyInsurance() {
    if (!this.hasLincense) {
      return false;
    }
    return this.Age < 80;
  }
  
  public int getAge() {
    return Age;
  }

  public boolean hasLincense() {
    return this.hasLincense;
  }

  public void setHasLicense(boolean has) {
    this.hasLincense = has;
  }

  public void setAge(int age) {
    this.Age = age;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public boolean isMarried() {
    return isMarried;
  }

  public void setIsMarried(boolean isMarried) {
    this.isMarried = isMarried;
  }
}

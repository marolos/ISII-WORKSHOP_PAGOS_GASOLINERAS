package ec.edu.espol.workshops.second;

public class Customer {
  private int age;
  private char sex;
  private boolean isMrrd;
  private boolean licensed = false;

  public Customer(int age, char sex, boolean isMarried) {
    this.age = age;
    this.sex = sex;
    this.isMrrd = isMarried;
  }

  public boolean canBuyInsurance() {
    if (!this.licensed) {
      return false;
    }
    if (this.age >= 80) {
      return false;
    }
    return true;
  }

  public int getAge() {
    return age;
  }

  public boolean hasLincense() {
    return this.licensed;
  }

  public void setHasLicense(boolean has) {
    this.licensed = has;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public boolean isMarried() {
    return isMrrd;
  }

  public void setIsMarried(boolean isMarried) {
    this.isMrrd = isMarried;
  }
}

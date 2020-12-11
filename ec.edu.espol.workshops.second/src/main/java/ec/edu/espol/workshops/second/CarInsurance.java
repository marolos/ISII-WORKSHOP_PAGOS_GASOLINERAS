package ec.edu.espol.workshops.second;

public class CarInsurance {

  private Double base = 500.0;
  private Customer customer;

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Integer doInsuranceBalance() {
    boolean isCorrectSex = this.customer.getSex() == 'M' || this.customer.getSex() == 'F';
    boolean isMenor = this.customer.getAge() < 18;
    boolean isMayor = this.customer.getAge() >= 80;
    if (this.customer == null || !isCorrectSex || isMenor || isMayor) {
      return -1;
    }
    boolean male = this.customer.getSex() == 'M';
    boolean young = this.customer.getAge() <= 25;
    boolean notTooOld =
      this.customer.getAge() > 45 && this.customer.getAge() < 65;
    boolean married = this.customer.isMarried();
    if (male && young && !married) {
      base += 1500.0;
    } else if (!male || married) {
      base -= 200.0;
    } else if (notTooOld) {
      base -= 100;
    }
    return base;
  }

  public Customer getCustomer() {
    if (this.customer == null) {
      return null;
    }
    return this.customer;
  }

  public Double getBase() {
    return this.base;
  }
}

package ec.edu.espol.workshops.second;

public class CarInsurance {
  private Double Base = 500.0;
  private Customer Customer;

  public void setCustomer(Customer customer) {
    this.Customer = customer;
  }

  public Integer doInsuranceBalance() {
    if (this.Customer == null) {
      return -1;
    }
    boolean male = this.Customer.getSex() == 'M';
    boolean young = this.Customer.getAge() <= 25;
    boolean notTooOld =
      this.Customer.getAge() > 45 && this.Customer.getAge() < 65;
    boolean married = this.Customer.isMarried();
    if (male && young && !married) {
      Base += 1500.0;
    } else if (!male || married) {
      Base -= 200.0;
    } else if (notTooOld) {
      Base -= 100;
    }
    return 1;
  }

  public Customer getCustomer() {
    if (this.Customer == null) {
      return null;
    }
    return this.Customer;
  }
}
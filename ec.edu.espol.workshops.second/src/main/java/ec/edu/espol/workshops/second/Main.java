package ec.edu.espol.workshops.second;

public class Main {

  public static void main(String[] args) {

    boolean result;
	
    /* Test Case test-001 */
    CarInsurance insurance = new CarInsurance();
    Customer customer = new Customer(30, 'F', true);
    insurance.setCustomer(customer);
    result = insurance.doInsuranceBalance() == 300;
    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");

    /* Test Case test-002 */
    insurance = new CarInsurance();
    customer = new Customer(20, 'M', false);
    insurance.setCustomer(customer);
    result = insurance.doInsuranceBalance() == 2000;
    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");

    /* Test Case test-003 */
    insurance = new CarInsurance();
    customer = new Customer(-5, 'F', false);
    insurance.setCustomer(customer);
    result = insurance.doInsuranceBalance() == -1;
    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");
    
    /* Test Case test-004 */
    insurance = new CarInsurance();
    customer = new Customer(40, 'U', true);
    insurance.setCustomer(customer);
    result = insurance.doInsuranceBalance() == -1;
    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");
    
    /* Test Case test-005 */
    insurance = new CarInsurance();
    customer = new Customer(50, 'M', false);
    insurance.setCustomer(customer);
    result = insurance.doInsuranceBalance() == 400;
    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");
    

    /* Test Case test-006 */
    insurance = new CarInsurance();
    customer = new Customer(28, 'M', true);
    insurance.setCustomer(customer);
    result = insurance.doInsuranceBalance() == 400;
    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");
    /** Test new feature */
    
  }
}

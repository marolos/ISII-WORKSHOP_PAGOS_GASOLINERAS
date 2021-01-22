package ec.edu.espol.workshops.second;

public class BoundaryMain {
   public static void main(String[] args) {
	   boolean result;
	    System.out.printf("Test-001");
	   CarInsurance insurance = new CarInsurance();
	    Customer customer = new Customer(30, 'F', true);
	    insurance.setCustomer(customer);
	    result = insurance.doInsuranceBalance() == 300;
	    System.out.printf("doInsuranceBalance: %s \n", result ? "pass" : "fail");
   }
}

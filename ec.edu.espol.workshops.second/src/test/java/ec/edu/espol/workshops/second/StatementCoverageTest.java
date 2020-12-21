package ec.edu.espol.workshops.second;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StatementCoverageTest {
	
	@Test
	public void testNotTooOld() {
		Integer expeted = 400;
		Customer customer = new Customer(50, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void testCanBuyInsurance() {
		Boolean expeted = false;
		Customer customer = new Customer(80, 'M', true);
		customer.setHasLicense(true);
		assertEquals(customer.canBuyInsurance(), expeted);
	}
	
}

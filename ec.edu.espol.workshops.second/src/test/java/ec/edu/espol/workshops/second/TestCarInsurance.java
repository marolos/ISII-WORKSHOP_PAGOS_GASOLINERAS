package ec.edu.espol.workshops.second;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCarInsurance {
	@Test
	public void test1() {
		Integer expeted = 400;
		Customer customer = new Customer(28, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
}

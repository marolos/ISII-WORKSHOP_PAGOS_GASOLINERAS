package ec.edu.espol.workshops.second;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PathCoverageTest {
	@Test
	public void testNotTooOld() {
		Integer expeted = 400;
		Customer customer = new Customer(50, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void testMale() {
		Integer expeted = 300;
		Customer customer = new Customer(30, 'M', true);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void testYoung() {
		Integer expeted = 2000;
		Customer customer = new Customer(24, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void testIsMenor() {
		Integer expeted = -1;
		Customer customer = new Customer(15, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void testCanBuyInsurance1() {
		Boolean expeted = true;
		Customer customer = new Customer(20, 'M', true);
		customer.setHasLicense(true);
		assertEquals(customer.canBuyInsurance(), expeted);
	}
	
	@Test
	public void testCanBuyInsurance2() {
		Boolean expeted = false;
		Customer customer = new Customer(80, 'M', true);
		customer.setHasLicense(true);
		assertEquals(customer.canBuyInsurance(), expeted);
	}
	
	@Test
	public void testCanBuyInsurance3() {
		Boolean expeted = false;
		Customer customer = new Customer(20, 'M', true);
		customer.setHasLicense(false);
		assertEquals(customer.canBuyInsurance(), expeted);
	}
}

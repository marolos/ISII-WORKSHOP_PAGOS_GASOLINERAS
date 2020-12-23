package ec.edu.espol.workshops.second;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BranchCoverageTest {
	@Test
	public void test1() {
		Integer expeted = 2000;
		Customer customer = new Customer(20, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test2() {
		Integer expeted = -1;
		CarInsurance carInsurance = new CarInsurance();
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test3() {
		Integer expeted = -1;
		Customer customer = new Customer(24, 'A', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test4() {
		Integer expeted = -1;
		Customer customer = new Customer(15, 'F', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test5() {
		Integer expeted = -1;
		Customer customer = new Customer(81, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test6() {
		Integer expeted = 300;
		Customer customer = new Customer(25, 'F', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test7() {
		Integer expeted = 500;
		Customer customer = new Customer(35, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test8() {
		Integer expeted = 400;
		Customer customer = new Customer(50, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test9() {
		Integer expeted = 500;
		Customer customer = new Customer(65, 'M', false);
		CarInsurance carInsurance = new CarInsurance();
		carInsurance.setCustomer(customer);
		assertEquals(carInsurance.doInsuranceBalance(), expeted);
	}
	
	@Test
	public void test10() {
		Integer expeted = 300;
		Customer customer = new Customer(20, 'M', true);
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

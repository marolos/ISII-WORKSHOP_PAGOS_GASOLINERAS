package ec.edu.espol.workshops.second;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.junit.Assert.*;

public class StepsDefs {    
	private Customer customer = new Customer();    
	private CarInsurance carInsurance = new CarInsurance();   
	int currentAnswer;
	
	@Given("customer is a M")
	public void customer_is_a_male() {
		customer.setSex('M');
	}
	
	@And("have 18 years old")
	public void have_18_years_old() {
		customer.setAge(18);
	}
	
	@And("is a not married")
	public void is_a_not_married() {
		customer.setIsMarried("not married".equals("married"));
	}
	
	
	@Given("customer is a {string}")
	public void customer_is_a(String genre) {
		customer.setSex(genre.charAt(0));
	}
	
	@And("have {int} years old")
	public void have_yeras_old(int age) {
		customer.setAge(age);
	}
	
	@And("is a {string}")
	public void is_a(String married) {
		customer.setIsMarried(married.equals("married"));
	}
	
	@Given("customer is a M and have {int} years old and is a not married")
	public void customer_is_a_m_and_have_years_old_and_is_a_not_married(Integer age) {
		customer = new Customer(age, 'M', false); 
	}

	@Given("customer is a F and have {int} years old and is a married")
	public void customer_is_a_f_and_have_years_old_and_is_a_married(Integer age) {
		customer = new Customer(age, 'F', true);
	}
	
	@When("do insurance balance")
	public void do_insurance_balance() {
		carInsurance.setCustomer(customer);
		currentAnswer = carInsurance.doInsuranceBalance();
	}
	
	@Then("Show {int}")
	public void show(int expectedAnswer) {
		assertEquals(expectedAnswer, currentAnswer);
	}
	  
} 
package ec.edu.espol.workshops.second;

public class Main {

  public static void main(String[] args) {
	
    Customer sysTest1 = new Customer(30, 'F', true);
    CarInsurance insuranceSysTes1 = new CarInsurance();
    insuranceSysTes1.setCustomer(sysTest1);
    System.out.println(insuranceSysTes1.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest2 = new Customer(20, 'M', false);
    CarInsurance insuranceSysTes2 = new CarInsurance();
    insuranceSysTes2.setCustomer(sysTest2);
    System.out.println(insuranceSysTes2.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest3 = new Customer(-5, 'F', false);
    CarInsurance insuranceSysTes3 = new CarInsurance();
    insuranceSysTes3.setCustomer(sysTest3);
    System.out.println(insuranceSysTes3.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest4 = new Customer(40, 'U', true);
    CarInsurance insuranceSysTes4 = new CarInsurance();
    insuranceSysTes4.setCustomer(sysTest4);
    System.out.println(insuranceSysTes4.doInsuranceBalance());

    /*
    //===========================================================
    
    Customer sysTest5 = new Customer(null, 'F', true);
    CarInsurance insuranceSysTes5 = new CarInsurance();
    insuranceSysTes5.setCustomer(sysTest5);
    insuranceSysTes5.doInsuranceBalance();

    //===========================================================
    
    Customer sysTest6 = new Customer(40, 'F', null);
    CarInsurance insuranceSysTes6 = new CarInsurance();
    insuranceSysTes6.setCustomer(sysTest6);
    insuranceSysTes6.doInsuranceBalance();
    */
  }
}

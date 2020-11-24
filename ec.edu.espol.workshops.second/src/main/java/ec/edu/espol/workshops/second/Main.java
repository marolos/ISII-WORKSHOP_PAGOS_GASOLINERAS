package ec.edu.espol.workshops.second;

public class Main {

  public static void main(String[] args) {
	
    Customer sysTest1 = new Customer(17, 'F', true);
    CarInsurance insuranceSysTes1 = new CarInsurance();
    insuranceSysTes1.setCustomer(sysTest1);
    System.out.println(insuranceSysTes1.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest2 = new Customer(18, 'M', false);
    CarInsurance insuranceSysTes2 = new CarInsurance();
    insuranceSysTes2.setCustomer(sysTest2);
    System.out.println(insuranceSysTes2.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest3 = new Customer(19, 'F', false);
    CarInsurance insuranceSysTes3 = new CarInsurance();
    insuranceSysTes3.setCustomer(sysTest3);
    System.out.println(insuranceSysTes3.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest4 = new Customer(24, 'F', true);
    CarInsurance insuranceSysTes4 = new CarInsurance();
    insuranceSysTes4.setCustomer(sysTest4);
    System.out.println(insuranceSysTes4.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest5 = new Customer(25, 'F', true);
    CarInsurance insuranceSysTes5 = new CarInsurance();
    insuranceSysTes5.setCustomer(sysTest5);
    System.out.println(insuranceSysTes5.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest6 = new Customer(26, 'F', true);
    CarInsurance insuranceSysTes6 = new CarInsurance();
    insuranceSysTes6.setCustomer(sysTest6);
    System.out.println(insuranceSysTes6.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest7 = new Customer(27, 'F', true);
    CarInsurance insuranceSysTes7 = new CarInsurance();
    insuranceSysTes7.setCustomer(sysTest7);
    System.out.println(insuranceSysTes7.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest8 = new Customer(44, 'F', true);
    CarInsurance insuranceSysTes8 = new CarInsurance();
    insuranceSysTes8.setCustomer(sysTest8);
    System.out.println(insuranceSysTes8.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest9 = new Customer(45, 'F', true);
    CarInsurance insuranceSysTes9 = new CarInsurance();
    insuranceSysTes9.setCustomer(sysTest9);
    System.out.println(insuranceSysTes9.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest10 = new Customer(46, 'M', true);
    CarInsurance insuranceSysTes10 = new CarInsurance();
    insuranceSysTes10.setCustomer(sysTest10);
    System.out.println(insuranceSysTes10.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest11 = new Customer(47, 'M', true);
    CarInsurance insuranceSysTes11 = new CarInsurance();
    insuranceSysTes11.setCustomer(sysTest11);
    System.out.println(insuranceSysTes11.doInsuranceBalance());

    //===========================================================
    
    Customer sysTest12 = new Customer(63, 'M', true);
    CarInsurance insuranceSysTes12 = new CarInsurance();
    insuranceSysTes12.setCustomer(sysTest12);
    System.out.println(insuranceSysTes12.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest13 = new Customer(64, 'M', true);
    CarInsurance insuranceSysTes13 = new CarInsurance();
    insuranceSysTes13.setCustomer(sysTest13);
    System.out.println(insuranceSysTes13.doInsuranceBalance());
    
    //===========================================================
    
    Customer sysTest14 = new Customer(65, 'M', true);
    CarInsurance insuranceSysTes14 = new CarInsurance();
    insuranceSysTes14.setCustomer(sysTest14);
    System.out.println(insuranceSysTes14.doInsuranceBalance());
    
  }
}

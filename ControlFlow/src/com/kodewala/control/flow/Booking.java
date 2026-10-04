package com.kodewala.control.flow;
/*
 * This class is responsible for accepting booking from user.
 * 
 */
public class Booking {
  
	// More than 6 pax per PNR is not allowed
	public String dobooking(String from, String to ,int no0fPax)
	{
		String pnr =null;
	 if(no0fPax > 6)// if true then only below code gets executed.
	 {
		 // Do not allow to book
		 System.err.println(" As per IRTC policy , only 6 pax are allowed per PNR");
		 return pnr;
	
	}
	 else
	 {
		 //Confirming the Booking
	    pnr ="86986099077";
	    System.out.println("confirming the booking : " + pnr);
	    System.out.println("Stus : CONFIRMED");
	    System.out.println("SEAT : 23 A1");
	 }
	 
	 
	 //...
	 //....
	 return pnr;
	}	
}

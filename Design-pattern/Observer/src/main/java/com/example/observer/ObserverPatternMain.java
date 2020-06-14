package com.example.observer;

import java.util.Timer;
import java.util.TimerTask;

public class ObserverPatternMain {

	static int score = 0;

	/**
	 * @throws InterruptedException 
	 * @Author arpit mandliya
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Creating subject called product....");
		Product samsungMobile = new Product("Samsung", "Mobile", "Not available");
		System.out.println("Subject created....");
		Thread.sleep(1000);
		System.out.println("creating observers.........");
		Thread.sleep(1000);
		Person arpitPerson = new Person("Arpit");
		System.out.println("observers1====="+arpitPerson);
		Thread.sleep(1000);
		Person johnPerson = new Person("John");
		System.out.println("observers2====="+johnPerson);
		Thread.sleep(1000);
		System.out.println("observers created.........");
		Thread.sleep(1000);


		// When you opt for option "Notify me when product is available".Below
		// registerObserver method
		// get executed
		
		System.out.println("registering observers .........");
		samsungMobile.registerObserver(arpitPerson);
		samsungMobile.registerObserver(johnPerson);
		System.out.println("Observers registered .........");
		Thread.sleep(1000);

		System.out.println("Subject state before change:::"+samsungMobile);

		Thread.sleep(1000);

		System.out.println("Subject state has been changed.....");
		// Now product is available
		Thread.sleep(1000);
		samsungMobile.setAvailability("Available");
		
		System.out.println("Subject state post change:::"+samsungMobile);

		System.out.println("=========================================");
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
//				System.out.println("Running: " + new java.util.Date());
				samsungMobile.setAvailability(""+ (score));
				score=score+1;
			}
		}, 0, 1000);
		
		
	}
	
}
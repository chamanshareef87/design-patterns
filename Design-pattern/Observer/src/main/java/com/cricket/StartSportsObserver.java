package com.cricket;

public class StartSportsObserver implements ScoreObserver {

	private String subscriberName;
	
	public StartSportsObserver(String subscriberName) {
		super();
		this.subscriberName = subscriberName;
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	@Override
	public void update(Score score) {
		System.out.println("Suscriber::::"+subscriberName+", Score::"+score);
	}

}

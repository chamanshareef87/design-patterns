package com.cricket;

public class GoogleSportsObserver implements ScoreObserver {

	private String subscriberName;
	private Score score;
	
	public GoogleSportsObserver(String subscriberName) {
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
		this.score=score;
		System.out.println("Suscriber::::"+subscriberName+", Score::"+this.score);
	}

}

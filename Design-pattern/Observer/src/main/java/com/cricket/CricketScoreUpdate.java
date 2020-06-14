package com.cricket;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreUpdate implements ScoreSubject {

	List<ScoreObserver> observers = new ArrayList<ScoreObserver>();
	private Score score;
	
	public CricketScoreUpdate(Score score) {
		super();
		this.score = score;
	}

	@Override
	public void registerObserver(ScoreObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(ScoreObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		 for (ScoreObserver ob : observers) {
             ob.update(this.score );
		 }
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
		notifyObservers();
	}

	@Override
	public String toString() {
		return "CricketScoreUpdate [score=" + score + "]";
	}
	
}

package com.cricket;

public interface ScoreSubject {

	public void registerObserver(ScoreObserver observer);

	public void removeObserver(ScoreObserver observer);

	public void notifyObservers();

}

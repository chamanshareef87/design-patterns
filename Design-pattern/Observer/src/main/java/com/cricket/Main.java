package com.cricket;

import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Score score = new Score(0, 0, 0);
		
		CricketScoreUpdate subject =  new CricketScoreUpdate(score);
		
		CricInfoObserver observer =  new CricInfoObserver("crickinfo");
		StartSportsObserver startObserver = new StartSportsObserver("StartSports");
		GoogleSportsObserver googleObserver = new GoogleSportsObserver("StartSports");
		
		subject.registerObserver(observer);
		subject.registerObserver(startObserver);
		subject.registerObserver(googleObserver);
		
		System.out.println("Initial State:::"+subject);

		while (score.getOvers()<20) {
			System.out.println("========================================");
			score.setRuns(score.getRuns() + new Random().nextInt(12));
			score.setOvers(score.getOvers() + 1);
			int wickets = new Random().nextInt(2);
			if (score.getWickets() < 8) {
				score.setWickets(score.getWickets() + wickets);
			}
			subject.setScore(score);
			Thread.sleep(1000);
		}

//		Timer timer = new Timer();
//		timer.schedule(new TimerTask() {
//			@Override
//			public void run() {
//				System.out.println("========================================");
//				score.setRuns(score.getRuns()+new Random().nextInt(12));
//				score.setOvers(score.getOvers()+1);
//				
//				int wickets = new Random().nextInt(2);
//				if(score.getWickets()<8) {
//					score.setWickets(score.getWickets()+wickets);
//				}
//				
//				subject.setScore(score);
//				if(score.getOvers()==20) {
//					Thread.currentThread().stop();
//				}
//			}
//		}, 0, 1000);
		
		
	}

}

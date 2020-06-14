package com.cricket;

public class Score {

	private int runs;
	private int overs;
	private int wickets;
	
	public Score(int runs, int overs, int wickets) {
		super();
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
	}
	
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return "Score [runs=" + runs + ", overs=" + overs + ", wickets=" + wickets + "]";
	}
	
}

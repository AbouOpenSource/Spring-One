package com.github.abouopensource;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	// add new fileds for emailAddress and team
	
	private String emailAddress;
	
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}







	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCOach :inside setter method : setEmailAddress");
		this.emailAddress = emailAddress;
	}







	public String getTeam() {
		return team;
	}







	public void setTeam(String team) {
		System.out.println("CricketCOach :inside setter method : setTeam");
		
		this.team = team;
	}







	//create a no-arg constructor 
	public CricketCoach() {
		System.out.println("CricketCoach ; inside no-arg contructor");
	}
	
	
	
	



//our setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach :inside setter methode");
		this.fortuneService = fortuneService;
	}






	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
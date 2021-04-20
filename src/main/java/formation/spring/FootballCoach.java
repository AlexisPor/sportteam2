package formation.spring;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

	public String getDailyWorkout() {
		String string = "FootBallCoach";
		return string;
	}

	public String getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}

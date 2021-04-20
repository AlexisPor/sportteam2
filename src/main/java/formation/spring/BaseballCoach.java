package formation.spring;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

	public String getDailyWorkout() {
		String string = "BasketBallCoach";
		return string;
	}

	public String getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}

package formation.spring;

	import org.springframework.beans.factory.BeanFactory;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Test {

		public static void main(String[] args) {
			BeanFactory beans = new ClassPathXmlApplicationContext("springbeans.xml");
			
			Team team = (Team) beans.getBean("team");
			
			System.out.println(team);
			for (Coach coach : team.getListCoachs()) {
				System.out.println(coach.getDailyWorkout());
			}
		}

	}


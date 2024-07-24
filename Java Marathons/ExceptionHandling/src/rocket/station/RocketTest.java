package rocket.station;

import rocket.station.exceptions.BoostException;
import rocket.station.exceptions.LaunchException;

public class RocketTest {

	public static void main(String[] args) {
		System.out.println("Start main...");
		System.out.println("-----------------------");
		
		RocketLauncher rocketLaunch = null;
		try {
			rocketLaunch = new RocketLauncher();
		}
		catch(LaunchException e) {
			System.out.println("Some problem 1 : "+ e.getMessage());
		}
		
		if(rocketLaunch != null) {
			try {
				rocketLaunch.launch();
			}
			catch(BoostException e) {
				System.out.println("Some problem 2 : "+ e.getMessage());
			}
		}
		else {
			System.out.println("Rocket is not ready to launch.");
		}
		
		System.out.println("-----------------------");
		System.out.println("End main...");
	}
}
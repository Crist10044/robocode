package pato;
import robocode.*;
import java.awt.Color;

public class PatoNoTucupi extends Robot
{

	public void run() {
		
		setBodyColor(new Color(200,25,0));
		setGunColor(new Color(200,25,0));
		setRadarColor(new Color(200,25,0));
		setScanColor(new Color(200,25,0));		
		setBulletColor(new Color(5, 237, 245));
		
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
	
		fire(1);
	}

	public void onHitByBullet(HitByBulletEvent e) {
	
		back(10);
	}
	
	public void onHitWall(HitWallEvent e) {

		back(20);
	}	
}

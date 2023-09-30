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
			turnGunRight(5);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
	
		fire(3);
		scan();
	}

	public void onHitByBullet(HitByBulletEvent e) {
		
		turnLeft(90);
		ahead(30);
	
	}
	
	public void onHitWall(HitWallEvent e) {
		turnLeft(13);
		ahead(30);
	}	
	
	public void onHitRobot(HitRobotEvent e){
		fire(3);
	}

}

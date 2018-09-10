package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;

public class MyUtil {
	public boolean isUploadDialogOpen(Robot robot, int x, int y, Color red) {
		Color color = robot.getPixelColor(x, y);
		
		return ((color.getRed() == red.getRed()) && (color.getGreen() == red.getGreen()) && (color.getBlue() == red.getBlue())); 
	}
	
	public void initCentre(Robot robot) {
		//
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		//
		int widthInt = (int) width / 2;
		int heightInt = (int) height / 2;
		//
		robot.mouseMove(widthInt, heightInt);

	}
	//zamiast inputKeys użyję writeKeyboard
	public void inputKeys(Robot robot, String phrase) {
		
		utils.Keyboard keyboard = new utils.Keyboard();
		keyboard.setRobot(robot);
		//
		keyboard.type((CharSequence)phrase);
	}
}

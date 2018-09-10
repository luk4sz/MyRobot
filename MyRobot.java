import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;

import utils.Keyboard;
import utils.MyStringUtils;
import utils.MyUtil;

/**
 * 
 * @author "Lukasz Lamek <lameklukas@gmail.com>"
 */
public class MyRobot {

	private static Robot robot;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Checking empty arguments
		if ((args == null) || (args.length == 0)) {
			System.err.println("Given argument arrey is null or empty.");
			return;
		}
		// Checking first element - full path
		if (MyStringUtils.hasntContent(args[0])) {
			System.err.println("First argument with path is empty.");
			return;
		}
		// Initialize new robot
		robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Create new utility Object
		MyUtil myUtil = new MyUtil();
		//Move cursor to center of screen
		myUtil.initCentre(robot);
		//click on dialog Header
		robot.mouseMove(570, 21);
		robot.mousePress( InputEvent.BUTTON1_MASK);
		robot.mouseRelease( InputEvent.BUTTON1_MASK);
		//Prepare red color to check
		Color red = new Color(196, 56, 34);
		//Check color of pixel
		boolean pixelCheck = true;// myUtil.isUploadDialogOpen(robot, 944, 20, red);
		//If checked pixel is red, dialog window is open
		if (pixelCheck == true) {
			//Move cursor to input field
			robot.mouseMove(312, 527);
			//Here I click input field of file name
			robot.mousePress( InputEvent.BUTTON1_MASK);
			robot.mouseRelease( InputEvent.BUTTON1_MASK);
			//
			String phrase = args[0];
			myUtil.inputKeys(robot, phrase);
			//keyboard.writeKeyboard (robot, phrase);
			try {
			Thread.sleep(1000);
			} catch(InterruptedException ie01) {
				System.err.println(ie01.getMessage());			}
			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		}
		
	}
}

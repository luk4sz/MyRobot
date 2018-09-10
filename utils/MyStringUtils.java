package utils;

/**
 * Utility class with methods processing strings.
 * 
 * @author "Lukasz Lamek <lameklukas@gmail.com>"
 */
public class MyStringUtils {
	/**
	 * Checking given string for having content.
	 * 
	 * @param given Given string to check.
	 * @return True, if hasn't content, false otherwise.
	 */
	public static boolean hasContent(String given) {
		return ((given != null) && (given.length() > 0));
	}

	/**
	 * Checking given string for not having content.
	 * 
	 * @param given Given string to check.
	 * @return True, if has content, false otherwise.
	 */
	public static boolean hasntContent(String given) {
		return ((given == null) || (given.length() == 0));
	}
}
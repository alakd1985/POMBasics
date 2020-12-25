package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

public class LogHelper {
	private static boolean root = false;
	public static FileInputStream fis;

	public static Logger getLogger(Class cls) {
		if (root) {
			return Logger.getLogger(cls);
		}
		try {
			fis = new FileInputStream(".\\src\\test\\resources\\logs\\log4j.properties");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		root = true;
		return Logger.getLogger(cls);
	}

	public static void main(String[] args) {
		Logger log = LogHelper.getLogger(LogHelper.class);
		log.info("logger is configured");
		log.info("logger is configured");
		log.info("logger is configured");

	}
}

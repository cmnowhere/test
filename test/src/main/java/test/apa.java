package test;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.log4j.Logger;

public class apa {
	protected static final Logger logger = Logger.getLogger(apa.class);
	protected static final Logger fileLogger = Logger.getLogger("fileLogger");

	public static void main(String[] args) {

		String dateFormat = DateFormatUtils.format(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss");

		System.out.println(dateFormat);
		System.out.println(dateFormat);System.out.println(dateFormat);
		System.out.println(dateFormat);
		System.out.println(dateFormat);
	}

}

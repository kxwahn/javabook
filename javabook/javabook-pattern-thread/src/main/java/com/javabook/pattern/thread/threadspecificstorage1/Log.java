package com.javabook.pattern.thread.threadspecificstorage1;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 
 * @author Summer Lu
 * @email summer.lu@software.dell.com
 * @date 2015年7月19日
 *
 */
public class Log {
	
	/**
	 * writer
	 */
	private static PrintWriter writer = null;

	static {
		try {
			writer = new PrintWriter(new FileWriter("log.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param s
	 */
	public static void println(String s) {
		System.out.println(s);
		writer.println(s);
	}

	/**
	 * 
	 */
	public static void close() {
		writer.println("==== End of log ====");
		writer.close();
	}
}

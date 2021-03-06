package com.javabook.thread.type.sleeping;

/**
 * @author Summer Lu
 * @email summer.lu@software.dell.com
 * @date 2014-8-22
 *
 */
public class SleepingThread extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000 * 60 * 60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

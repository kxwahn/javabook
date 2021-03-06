package com.javabook.pattern.thread.balking;


/**
 * 
 * @author Summer Lu
 * @email summer.lu@software.dell.com
 * @date 2015年7月19日
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Resource resource = new Resource("resource.txt", "(empty)");
		
		new ChangerThread("ChangerThread", resource).start();
		new SaverThread("SaverThread", resource).start();
	}
}

package com.javabook.classinit.statics.nofinals;

import com.javabook.classinit.ClassInitParent;

/**
 * <ul>访问类型的final static编译期字段
 * 	<li>观察类型的初始化顺序
 *  <li>观察类型的初始化次数
 * </ul>
 * @author LuYang
 *
 */
public class InitClassByStatic1Demo1 {

	public static void main(String[] args) {
		
		System.out.println("第1次访问类型的static字段(编译时)");
		System.out.println( ClassInitParent.staticfield_Compile_inParent );
		
		System.out.println("第2次访问类型的static字段(编译时)");
		System.out.println( ClassInitParent.staticfield_Compile_inParent );
	}
}
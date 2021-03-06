package com.javabook.classinit.statics.finals;

import com.javabook.classinit.ClassInitParent;

/**
 * <ul>访问类型的final static运行期字段
 * 	<li>观察类型的初始化顺序
 *  <li>观察类型的初始化次数
 * </ul>
 * @author LuYang
 *
 */
public class InitClassByStaticFinal2Demo1 {

	public static void main(String[] args) {
		
		System.out.println("第1次访问类型的final static字段(运行时)");
		System.out.println( ClassInitParent.finalstaticfield_Runtime_inParent );
		
		System.out.println("第1次访问类型的final static字段(运行时)");
		System.out.println( ClassInitParent.finalstaticfield_Runtime_inParent );
	}
}
package com.b.api;

import com.a.api.A;
import com.xiuye.util.log.LogUtil;

public class B {

	public static void main(String[] args) {
		A a = new A();
		a.hello();
	}
	
	public void hello() {
		A a = new A();
		a.hello();
//		System.out.println("Hello,I am B!");
		LogUtil.log("Hello,I am B!");
	}

}

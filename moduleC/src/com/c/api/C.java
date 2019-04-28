package com.c.api;

import com.b.api.B;
import com.xiuye.util.log.LogUtil;

public class C {

	public static void main(String[] args) {
		B b = new B();
		b.hello();
		LogUtil.log("end");
	}

}

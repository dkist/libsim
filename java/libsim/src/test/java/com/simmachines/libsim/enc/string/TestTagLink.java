package com.simmachines.libsim.enc.string;

import org.junit.Test;

import com.simmachines.libsim.asserts.Asserts;

public class TestTagLink {

	@Test
	//jdsalazar
	public void test1(){
		String str1 = "Test String1";
		String str2 = "Test String2";
		double res = TagLink.distance(str1,str2);
		Asserts.assertEquals(res, 0.9097402);
	}
	
}

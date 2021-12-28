package com.userresgister;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserEntryTest {

	@Test
	public void test() {
		
		ValidateUserEntry userentry = new ValidateUserEntry();
		
		assertEquals(true,userentry.firstname("Dinesh"));
		assertEquals(true,userentry.lastname("Dinesh"));
		assertEquals(true,userentry.contactno("918608894623"));
		assertEquals(true,userentry.emailid("abc.jd@bl.com.jd"));
	}

}

package com.avmart.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.av.mart.model.User;





public class ControllerTest {
	    @Test
	    public void testgetemail() {
	    User user = new User();
	    user.setEmail("admin@test.com");

//	  assertEquals("admin@test.com", user.getEmail());
  assertEquals("ali@yahoo.com", user.getEmail());
	}
	}
package com.example.userauthentication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.userauthentication.entity.User;
import com.example.userauthentication.repository.UserRepository;
import com.example.userauthentication.service.UserService;

@SpringBootTest
class UserAuthenticationApplicationTests {
	
	@Autowired
	UserRepository repo;
	
	@Autowired
	UserService userService;
	
	@Test
	void isUser() {
		User user = new User();

		user.setName("johnnydepp");
		user.setEmail("johnnydepp.pairates@disney.com");
		user.setPassword("password");
		assertEquals("johnnydepp",user.getName());
		assertEquals("johnnydepp.pairates@disney.com",user.getEmail());
		assertEquals("password", user.getPassword());
	}
	@Test
	void testServiceCall() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertNotEquals(count, 0);
	}
	
	@Test
	void countUsers() {
		Iterable<User> users = userService.GetAllUsers();
		Integer count = 0;
		
		for(User u: users)
			count++;
		
		assertEquals(count, 6);
	}
	
	@Test
	void checkAllUsers() {
		Iterable<User> users = userService.GetAllUsers();
		
		for(User u: users)
			assertNotNull(u);
	}
	 @Test
	    public void passwordNotNull() {
	    	
			Iterable<User> users = repo.findAll();
			for(User u: users)
				assertNotNull(u.getPassword());
	    }

	    @Test
	    public void nameNotNull() {
	    	
			Iterable<User> users = repo.findAll();
			for(User u: users)
				assertNotNull(u.getName());
	    }

	    @Test
	    public void emailNotNull() {
	    	
			Iterable<User> users = repo.findAll();
			for(User u: users)
				assertNotNull(u.getEmail());
	    }

}

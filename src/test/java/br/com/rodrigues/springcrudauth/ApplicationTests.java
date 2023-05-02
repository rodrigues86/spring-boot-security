package br.com.rodrigues.springcrudauth;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.rodrigues.springcrudauth.controller.UserController;

@SpringBootTest
public class ApplicationTests {

	@Autowired
	private UserController userController;


	@Test
	public void contextLoads() {
		assertNotNull(userController.smokeTestParam("smoke test"), "smoke test");
	}

}

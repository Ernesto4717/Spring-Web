package com.softtek.academy.end.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/servlet-context.xml", "/META-INF/spring/application-context.xml" })
@WebAppConfiguration
public class UserControllerTest {

	// @Autowired
	// WebApplicationContext wac;
	//
	// MockMvc mockMvc= MockMvcBuilders.webAppContextSetup(this.wac).build();
	//

	private MockMvc mockMvc;

	@InjectMocks
	private UserController userController;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@Test
	public void shouldTrueWhenViewIsOK() throws Exception {
		mockMvc.perform(get("/User/List"))
		.andExpect(status().isOk())
		.andExpect(view().name("users"));
	}
}

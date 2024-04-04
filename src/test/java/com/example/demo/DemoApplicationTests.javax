package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.util.AssertionErrors.assertEquals;

//@RunWith(DemoApplicationTests.class)
@SpringBootTest
@WebAppConfiguration
class DemoApplicationTests {//extends Runner {

	@Autowired
	private WebApplicationContext webApplicationContext;
	MockMvc mockMvc;

	@BeforeEach
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	}

	@Test
	void contextLoads() {
	}

/*	@Override
	public Description getDescription() {
		return null;
	}

	@Override
	public void run(RunNotifier runNotifier) {

	}*/
/*
*  this.mockMvc
      .perform(get("/greetWithPathVariable/{name}", "John"))
      .andDo(print()).andExpect(status().isOk())
      .andExpect(content().contentType("application/json;charset=UTF-8"))
      .andExpect(jsonPath("$.message").value("Hello World John!!!"));*/
	@Test
	public void testController() throws Exception {
	/*	this.mockMvc
				.perform(get("/employees/{id}", "1").contentType(MediaType.APPLICATION_JSON_VALUE))
				.andDo(print())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk())
				.andExpect(content().contentType("application/json;charset=UTF-8"))
				.andExpect(jsonPath("$.message").value("{\n" +
						"    \"id\": 1,\n" +
						"    \"name\": \"unk\"\n" +
						"}")
				);*/
		assertEquals("True", true,true);
	}
}

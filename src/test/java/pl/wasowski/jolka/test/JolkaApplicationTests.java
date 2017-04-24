package pl.wasowski.jolka.test;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import pl.wasowski.jolka.model.Puzzle;
import pl.wasowski.jolka.model.Question;
import pl.wasowski.jolka.repositories.PuzzleRepository;
import pl.wasowski.jolka.repositories.QuestionRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class JolkaApplicationTests {
	@Autowired
	PuzzleRepository puzzleRepository;
	
	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	private WebApplicationContext context;
	
    private MockMvc mvc;

	@Before
	public void setup() {
		mvc = MockMvcBuilders
				.webAppContextSetup(context)
				.build();
	}
	
	@Test
	public void test() {
		Puzzle puzzle = new Puzzle();
		Question q1 = new Question("jestem");
		Question q2 = new Question("tak");
		
		puzzle.addQuestion(q1);
		puzzle.addQuestion(q2);
		
		puzzleRepository.save(puzzle);
		assertEquals(questionRepository.count(), 2);
	}
	
	@Test
	public void lol() throws Exception {
		String result = mvc.perform(get("/crossword")).andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
		System.out.println(result);
	}
}

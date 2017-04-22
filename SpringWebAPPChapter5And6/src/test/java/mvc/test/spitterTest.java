package mvc.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import mvc.controller.HomeController;
import mvc.controller.SpittleController;
import mvc.interfaces.SpittleRepository;
import mvc.models.Spittle;

public class spitterTest {
	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/")).andExpect(view().name("home"));
	}

	@Test
	public void shouldShowRegistration() throws Exception {
		SpittleController controller = new SpittleController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
	}

	/*
	 * @Test public void shouldShowRecentSpittles() throws Exception {
	 * List<Spittle> expectedSpittles = createSpittleList(20); SpittleRepository
	 * mockRepository = mock(SpittleRepository.class);
	 * when(mockRepository.findSpittles(Long.MAX_VALUE,
	 * 20)).thenReturn(expectedSpittles); SpittleController controller = new
	 * SpittleController(mockRepository); MockMvc mockMvc =
	 * standaloneSetup(controller) .setSingleView(new
	 * InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
	 * mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"))
	 * .andExpect(model().attributeExists("spittleList"))
	 * .andExpect(model().attribute("spittleList",
	 * hasItems(expectedSpittles.toArray()))); }
	 * 
	 * private List<Spittle> createSpittleList(int count) { List<Spittle>
	 * spittles = new ArrayList<Spittle>(); for (int i = 0; i < count; i++) {
	 * spittles.add(new Spittle("Spittle " + i, new Date())); } return spittles;
	 * }
	 */
}

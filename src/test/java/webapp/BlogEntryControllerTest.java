package webapp;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import webapp.mvc.BlogEntryController;
import webapp.mvc.BlogEntryController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

/**
 * Created by mudasar on 10/09/2015.
 */
public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController controller;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

@Test
    public void test() throws Exception {
        mockMvc.perform(get("/test")).andDo(print());
}

    @Test
    public void testPost() throws Exception{
        mockMvc.perform(post("/test").content("{\"title\":\"Test blog entry\"}").contentType(MediaType.APPLICATION_JSON)).andDo(print());
    }

}

package fun.bookshop;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BookController.class)
@AutoConfigureMockMvc
public class BookControllerTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  private BookService bookService;

  @Test
  void getAllBooks() throws Exception {
    mockMvc.perform(get("/books"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.books").isArray());
  }

  @Test
  void shouldReturnBook() throws Exception {
    Mockito.when(bookService.getAllBooks())
        .thenReturn(List.of(new Book("Alchemist", "Paulo Coelho")));

    mockMvc.perform(get("/books"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.books[0].name").value("Alchemist"));
  }

  @Test
  void shouldReturnAuthorBook() throws Exception {
    Mockito.when(bookService.getAllBooks())
        .thenReturn(List.of(new Book("Alchemist", "Paulo Coelho")));

    mockMvc.perform(get("/books"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.books[0].author").value("Paulo Coelho"));
  }
}

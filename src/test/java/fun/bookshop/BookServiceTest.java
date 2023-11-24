package fun.bookshop;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

  @Mock
  BookRepository bookRepository;
  @Test
  void shouldGetAllBooksFromRepository() {
    Mockito.when(bookRepository.findAll())
        .thenReturn(List.of(new BookEntity(1, "Alchemist", "Paulo Coelho")));

    BookService bookService = new BookService(bookRepository);

    List<Book> expectedBooks = List.of(new Book("Alchemist", "Paulo Coelho"));
    List<Book> allBooks = bookService.getAllBooks();

    Assertions.assertThat(allBooks).containsAll(expectedBooks);
  }

  @Test
  void shouldReturnAuthorForBook() {
    Mockito.when(bookRepository.findAll())
        .thenReturn(List.of(new BookEntity(1, "Alchemist", "Paulo Coelho")));

    BookService bookService = new BookService(bookRepository);

    List<Book> expectedBooks = List.of(new Book("Alchemist", "Paulo Coelho"));
    List<Book> allBooks = bookService.getAllBooks();

    Assertions.assertThat(allBooks).containsAll(expectedBooks);
  }

}
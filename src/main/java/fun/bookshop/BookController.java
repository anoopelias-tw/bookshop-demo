package fun.bookshop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

  private BookService bookService;

  public BookController(final BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("books")
  public ResponseEntity<Books> allBooks(@RequestAttribute String userId){
    System.out.println("userId: " + userId);
    List<Book> allBooks = bookService.getAllBooks();
    return ResponseEntity.ok(new Books(allBooks));
  }

}

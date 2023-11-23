package fun.bookshop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

  @GetMapping("books")
  public ResponseEntity<Books> allBooks(){
    return ResponseEntity.ok(new Books(List.of()));
  }
}

package fun.bookshop;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookEntity {

  @Id
  Integer bookId;

  String name;

  public BookEntity(Integer bookId,
                    String name) {
    this.bookId = bookId;
    this.name = name;
  }

  public BookEntity() {
  }
}

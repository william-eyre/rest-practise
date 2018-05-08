package hello.book;

import org.springframework.stereotype.Component;

@Component
public class BookService {

  public Book returnBook() {
    return new Book("Dust of Dreams", 1323123, "Flying cities and very angry dead people");
  }
}

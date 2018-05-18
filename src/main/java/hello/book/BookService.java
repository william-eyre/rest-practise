package hello.book;

import org.springframework.stereotype.Component;

@Component
public class BookService {

  public Book returnBook() {
   return Book.builder()
       .blurb("Flying cities and angry Jaghut")
       .ISBN(23123123)
       .build();
  }
}

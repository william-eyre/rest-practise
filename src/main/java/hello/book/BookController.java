package hello.book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  private Book bookExample = new Book("Dust of Dreams", 1323123, "Flying cities and very angry dead people");

  @RequestMapping("/book")
  public Book book() {
    try {
      return bookExample;
    } catch (Exception e) {
      throw e;
    }
  }
}

package hello.book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  private BookService bookService = new BookService();

  @RequestMapping("/book")
  public Book book() {
    try {
      return bookService.returnBook();
    } catch (Exception e) {
      throw e;
    }
  }
}

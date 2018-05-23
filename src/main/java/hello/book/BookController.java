package hello.book;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@AllArgsConstructor
public class BookController {

  private BookInterface book;

  @RequestMapping("/book")
  public Book book() {
    return book.returnBook();
  }
}

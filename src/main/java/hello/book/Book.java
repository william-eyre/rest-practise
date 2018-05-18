package hello.book;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Book {

  @Builder.Default
  private String title = "The Malazan Book of the Fallen";
  private int ISBN;
  private String blurb;
}

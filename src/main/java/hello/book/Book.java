package hello.book;

public class Book {

  private String title;
  private int ISBN;
  private String blurb;

  public Book(String title, int ISBN, String blurb) {
    this.title = title;
    this.ISBN = ISBN;
    this.blurb = blurb;
  }

  public String getTitle() {
    return title;
  }

  public int getISBN() {
    return ISBN;
  }

  public String getBlurb() {
    return blurb;
  }
}

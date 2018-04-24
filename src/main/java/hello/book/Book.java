package hello.book;

public class Book {

  String title;
  int ISBN;
  String blurb;

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

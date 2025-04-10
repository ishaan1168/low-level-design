package designpattern.builder_designpattern;

public class Main {
  public static void main(String[] args) {
    Url url = new Url.UrlBuilder().a(1).b(2).c(3).build();
    System.out.println(url.a);
    System.out.println(url.b);
    System.out.println(url.c);
  }
}

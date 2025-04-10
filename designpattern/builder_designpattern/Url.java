package designpattern.builder_designpattern;

public class Url {
  int a;
  int b;
  int c;
  Url(UrlBuilder urlBuilder) {
    this.a = urlBuilder.a;
    this.b = urlBuilder.b;
    this.c = urlBuilder.c;
  }
  public static class UrlBuilder {
    int a;
    int b;
    int c;
    UrlBuilder a(int a) {
      this.a = a;
      return this;
    }
    UrlBuilder b(int b) {
      this.b = b;
      return this;
    }
    UrlBuilder c(int c) {
      this.c = c;
      return this;
    }
    Url build() {
      return new Url(this);
    }
  }
}

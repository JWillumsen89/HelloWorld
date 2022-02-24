package demo;

class HelloWorld {

  void helloWorld() {

    System.out.println("Hello, World!");
  }
  void go() {
    helloWorld();
  }

  public static void main(String[] args) {
    new HelloWorld().go();
  }
}

package activities;

abstract class Book {
    String title;

    abstract void setTitle(String str);

    String getTitle() {
        return title;
    }
}

class Mybook extends Book {
    public void setTitle(String str) {
        title = str;
    }
}

public class Activity5 {
    public static void main(String[] args) {
        Mybook obj = new Mybook();
        obj.setTitle("Java Fundamental");
        System.out.println("Title of the book: " + obj.getTitle());
    }
}

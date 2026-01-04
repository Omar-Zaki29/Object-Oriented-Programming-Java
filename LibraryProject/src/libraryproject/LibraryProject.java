package libraryproject;

import java.sql.SQLOutput;

public class LibraryProject {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.author = "Thomas Harris";
        myBook.title = "The Silence of the Lambs";
        myBook.year = 1988;

        System.out.println(myBook.author + " " + myBook.title + " " + myBook.year);

        Book2 myBook2 = new Book2("Thomas Harris", "Hannibal", 1999);
        myBook2.setAuthor("Omar Zaki");
        myBook2.setTitle("The Aquarium Theorem");
        myBook2.setYear(2016);

        System.out.println(myBook2.getAuthor() + " " + myBook2.getTitle() + " " + myBook2.getYear());

    }
}

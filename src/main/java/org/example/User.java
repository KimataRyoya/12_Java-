package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {

  private String name;
  private List<Book> borrowedBooks;

  public User(String name) {
    this.name = name;
    this.borrowedBooks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void borrowBook(Book book) {
    if (!book.isBorrowed()) {
      borrowedBooks.add(book);
      book.borrowBook();
      System.out.println(name + "が本を借りました" + book.getTitle());
    } else {
      System.out.println("この本は現在借りられています" + book.getTitle());
    }
  }

  public void returnBook(Book book) {
    if (borrowedBooks.contains(book)) {
      borrowedBooks.remove(book);
      book.returnBook();
      System.out.println(name + "が本を返しました" + book.getTitle());
    } else {
      System.out.println("この本は借りていません： " + book.getTitle());
    }
  }

  public void listBorrowedBooks() {
    if (borrowedBooks.isEmpty()) {
      System.out.println(name + "は現在本を借りていません。");
    } else {
      System.out.println(name + "が借りている本");
      for (Book book : borrowedBooks) {
        System.out.println(book);
      }
    }
  }
}



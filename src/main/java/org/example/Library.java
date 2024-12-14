package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

  private List<Book> books = new ArrayList<>();

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
    System.out.println("本が追加されました： " + book.getTitle());
  }

  public void listBooks() {
    if (books.isEmpty()) {
      System.out.println("図書館に本がありません。");
    } else {
      System.out.println("図書館の本の一覧： ");
      for (Book book : books) {
        System.out.println(book);
      }
    }
  }

  public void borrowBook(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        book.borrowBook();
        return;
      }
    }
    System.out.println("本が見つかりません: " + title);
  }

  public void returnBook(String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        book.returnBook();
        return;
      }
    }
    System.out.println("本が見つかりません: " + title);
  }


}



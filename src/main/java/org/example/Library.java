package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

  private List<Book> books = new ArrayList<>();
  private Map<String, User> users = new HashMap<>();

  public void addBook(int id, String title, String author) {
    for (Book book : books) {
      if (book.getId() == id) {
        System.out.println("この番号はすでに使われています。他の番号を入力してください。");
        return;
      }
    }
    books.add(new Book(id, title, author));
    System.out.println("本が追加されました！");
  }

  public void registerUser(String userName) {
    if (users.containsKey(userName)) {
      System.out.println("このユーザーはすでに登録されています。");
    } else {
      users.put(userName, new User(userName));
      System.out.println("ユーザーが登録されました！");
    }
  }

  public void searchBookByTitle(String keyword) {
    System.out.println("タイトルに含まれるキーワードで本を検索中: " + keyword);
    boolean found = false;
    for (Book book : books) {
      if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
        System.out.println(book);
        found = true;
      }
    }
    if (!found) {
      System.out.println("該当する本が見つかりませんでした。");
    }
  }

  public void searchBookByAuthor(String keyword) {
    System.out.println("著者名に含まれるキーワードで本を検索中: " + keyword);
    boolean found = false;
    for (Book book : books) {
      if (book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
        System.out.println(book);
        found = true;
      }
    }
    if (!found) {
      System.out.println("該当する本が見つかりませんでした。");
    }
  }

  public void searchBookById(int id) {
    for (Book book : books) {
      if (book.getId() == id) {
        System.out.println(book);
        return;
      }
    }
    System.out.println("該当する番号の本が見つかりませんでした。");
  }

  public void listBooks() {
    if (books.isEmpty()) {
      System.out.println("図書館に本が登録されていません。");
    } else {
      System.out.println("登録されている本一覧:");
      for (Book book : books) {
        System.out.println(book);
      }
    }
  }

  public void borrowBook(int bookId, String userName) {
    if (!users.containsKey(userName)) {
      System.out.println("ユーザーが登録されていません。");
      return;
    }
    for (Book book : books) {
      if (book.getId() == bookId) {
        if (book.isBorrowed()) {
          System.out.println("この本は現在貸出中です。");
        } else {
          book.borrowBook(userName);
          System.out.println("本を貸し出しました: " + book.getTitle());
        }
        return;
      }
    }
    System.out.println("該当する本が見つかりませんでした。");
  }

  public void returnBook(int bookId) {
    for (Book book : books) {
      if (book.getId() == bookId) {
        if (!book.isBorrowed()) {
          System.out.println("この本はすでに返却されています。");
        } else {
          book.returnBook();
          System.out.println("本を返却しました: " + book.getTitle());
        }
        return;
      }
    }
    System.out.println("該当する本が見つかりませんでした。");
  }
  }
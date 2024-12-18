package org.example;

class Book {

  private int id;
  private String title;
  private String author;
  private boolean isBorrowed;
  private String borrowedBy;

  public Book(int id, String title, String author) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.isBorrowed = false;
    this.borrowedBy = null;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isBorrowed() {
    return isBorrowed;

  }

  public void borrowBook(String user) {
    this.isBorrowed = true;
    this.borrowedBy = user;
  }

  public void returnBook() {
    this.isBorrowed = false;
    this.borrowedBy = null;
  }

  @Override
  public String toString() {
    return "番号: " + id + ", タイトル: " + title + ", 著者: " + author + ", 貸出状況: " + (
        isBorrowed ? "貸出中 (借りた人: " + borrowedBy + ")" : "利用可能");
  }
}
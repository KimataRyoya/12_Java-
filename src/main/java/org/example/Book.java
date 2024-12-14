package org.example;

public class Book {
  private String title;
  private String author;
  private int number;
  private boolean isBorrowed;

  public Book(String title,String author,int number){
    this.title = title;
    this.author = author;
    this.number = number;
    this.isBorrowed = false;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public int getNumber(){
    return number;
  }
  public boolean isBorrowed(){
    return isBorrowed;
  }
  public void borrowBook(){
    if (!isBorrowed){
      isBorrowed = true;
    }else{
      System.out.println("この本はすでに借りられています: " + title);
    }
  }
  public void returnBook(){
    if (isBorrowed){
      isBorrowed = false;
    }else{
      System.out.println("この本はすでに返却されています: " + title);
    }
  }
  @Override
  public String toString(){
    return "タイトル:" + title + ", 著者:" + author + "　貸出状況:" + (isBorrowed?"貸出中" : "貸出可能") + "　番号:" + number;
  }

}

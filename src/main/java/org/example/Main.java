package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();
    User user = new User("田中太郎");
    
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\n1:本を追加する");
      System.out.println("2:本の一覧を表示する");
      System.out.println("3:本を借りる");
      System.out.println("4:本を返す");
      System.out.println("5:ユーザーが借りている本を表示する");
      System.out.println("0:終了");
      System.out.print("選択してください:");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1:
          System.out.print("本のタイトルを入力してください: ");
          String title = scanner.nextLine();
          System.out.print("本の著者を入力してください: ");
          String author = scanner.nextLine();
          System.out.print("本の番号を入力してください: ");
          int number = scanner.nextInt();
          library.addBook(new Book(title, author, number));
          break;

        case 2:
          library.listBooks();
          break;
        case 3:
          System.out.print("借りたい本のタイトルを入力してください: ");
          String borrowTitle = scanner.nextLine();
          library.borrowBook(borrowTitle);
          break;
        case 4:
          System.out.print("返却する本のタイトルを入力してください： ");
          String returnTitle = scanner.nextLine();
          library.returnBook(returnTitle);
          break;
        case 5:
          user.listBorrowedBooks();
          break;
        case 0:
          System.out.println("プログラムを終了します。");
          scanner.close();
          return;
        default:
          System.out.println("無効な選択です。");


      }
    }
  }
}

package org.example;

import java.util.Scanner;

public class Main {
  //　図書管理システムをつくる
  //　書籍を管理する情報（タイトル、著者、番号）を持つオブジェクト（クラス）を作って、そこに情報を格納してください
  //　図書館（library）クラスを作って、そこにBookをListで持つようなものを保持する
  //　mainメソッドからlibraryクラスに対して検索ができるようにする。
  //　libraryクラスは書籍検索の機能を持つ
  //　タイトル検索、書籍検索、番号検索メソッドをlibraryに持たせる。
  //　それをmainメソッドから実行して、実行結果をコンソールに出力する。

  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("\n図書管理システム:");
      System.out.println("1. 本を追加");
      System.out.println("2. タイトルで本を検索");
      System.out.println("3. 著者で本を検索");
      System.out.println("4. 番号で本を検索");
      System.out.println("5. 本の一覧を表示");
      System.out.println("6. 本を貸し出す");
      System.out.println("7. 本を返却する");
      System.out.println("8. ユーザーを登録");
      System.out.println("9. 終了");
      System.out.print("操作を選んでください: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // 改行を消費

      switch (choice) {
        case 1:
          System.out.print("本の番号を入力してください: ");
          int id = scanner.nextInt();
          scanner.nextLine(); // 改行を消費
          System.out.print("本のタイトルを入力してください: ");
          String title = scanner.nextLine();
          System.out.print("本の著者を入力してください: ");
          String author = scanner.nextLine();
          library.addBook(id, title, author);
          break;
        case 2:
          System.out.print("検索したいタイトルのキーワードを入力してください: ");
          String titleKeyword = scanner.nextLine();
          library.searchBookByTitle(titleKeyword);
          break;
        case 3:
          System.out.print("検索したい著者名のキーワードを入力してください: ");
          String authorKeyword = scanner.nextLine();
          library.searchBookByAuthor(authorKeyword);
          break;
        case 4:
          System.out.print("検索したい本の番号を入力してください: ");
          int searchId = scanner.nextInt();
          scanner.nextLine(); // 改行を消費
          library.searchBookById(searchId);
          break;
        case 5:
          library.listBooks();
          break;
        case 6:
          System.out.print("貸し出したい本の番号を入力してください: ");
          int borrowId = scanner.nextInt();
          scanner.nextLine(); // 改行を消費
          System.out.print("ユーザー名を入力してください: ");
          String borrowUser = scanner.nextLine();
          library.borrowBook(borrowId, borrowUser);
          break;
        case 7:
          System.out.print("返却したい本の番号を入力してください: ");
          int returnId = scanner.nextInt();
          scanner.nextLine(); // 改行を消費
          library.returnBook(returnId);
          break;
        case 8:
          System.out.print("登録するユーザー名を入力してください: ");
          String userName = scanner.nextLine();
          library.registerUser(userName);
          break;
        case 9:
          System.out.println("システムを終了します。さようなら！");
          scanner.close();
          System.exit(0);
          break;
        default:
          System.out.println("無効な選択です。再試行してください。");
      }
    }
  }
}


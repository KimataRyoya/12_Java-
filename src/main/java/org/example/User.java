package org.example;

import java.util.ArrayList;
import java.util.List;

class User {

  private String name;

  public User(String name) {
    this.name = name;

  }

  @Override
  public String toString() {
    return "ユーザー名: " + name;
  }
}

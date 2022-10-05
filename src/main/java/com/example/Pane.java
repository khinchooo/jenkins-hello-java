package com.example;

/** 画面共通クラス */
public abstract class Pane {
  protected JustPayApp app;

  public Pane(JustPayApp app) {
    this.app = app;
  }

  /** ユーザから操作を実行する */
  public abstract void doAction(String command);
}

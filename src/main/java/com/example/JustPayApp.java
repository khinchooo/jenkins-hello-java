package com.example;

/** JustPayｱﾌﾟﾘ本体 */
public class JustPayApp {
   /** 現在表示中の画面 */
   private Pane pane;

   public JustPayApp() {
     // 初期状態
     setPane(HomePane.class);
   }
 
   /** 現在の画面名を返す */
   public String getPaneName() {
     return pane.getClass().getSimpleName();
   }

   /** 画面を設定する */
   void setPane(Class<? extends Pane> clazz) {
    try {
      this.pane = (Pane) (clazz.getConstructors()[0].newInstance(this));
    } catch (Exception e) {
      e.printStackTrace();
    }
   }

  /** ユーザから操作を実行する */
   public void doAction(String command) {
    pane.doAction(command);
   }
}

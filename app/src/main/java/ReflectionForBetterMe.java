//1.페이지 제너레이터 만들기
//2.홈 , 게시판 , 커뮤니티 페이지제너레이터 만들기
//3. 홈 최소 기능 ? 구현 -> 글귀 html 양식
//4. 게시판 기능 구현
// 페이지 제너레이터를 만들어준다.



import java.io.IOException;
import javax.swing.*;
import java.awt.*;

public class ReflectionForBetterMe {
  private JFrame frame;
  private JPanel contentPanel;

  public static void main(String[] args) throws IOException {
    ReflectionForBetterMe application = new ReflectionForBetterMe();
    application.run();

  }

  public void run() throws IOException {
  frame = new JFrame("Reflection Page");
  frame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(800,1000);

  BoardPanel boardPanel = new BoardPanel();
  boardPanel.menuBar(frame);

  ContentPanel contentPanel = new ContentPanel();
  contentPanel.

  frame.setVisible(true);


  }

}

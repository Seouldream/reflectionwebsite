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
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 1000);

    menuBar();

    //initmainPanel();

    initContentPanel();


    frame.setVisible(true);

  }

 /* public void initmainPanel() {
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout());


    frame.add(mainPanel,BorderLayout.CENTER);


  }
*/
  public void menuBar () {
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      frame.add(panel, BorderLayout.PAGE_START);

      //레이블 관리
      JLabel mainLabel = new JLabel("회고 게시판");

      panel.add(mainLabel);

      //버튼
      panel.add(createWritingButton());

    }

  private void initContentPanel() {
    contentPanel = new JPanel();
    frame.add(contentPanel);
  }


    public JButton createWritingButton () {
      JButton writingButton = new JButton("글쓰기");
      writingButton.addActionListener(event -> {
        JTextField postTextField = new JTextField();
        contentPanel.add(postTextField);
        JPanel writingPanel = new WritingPanel();
        showContentPanel(writingPanel);


      });
      return writingButton;
    }

  public void showContentPanel(JPanel writingPanel) {
    contentPanel.removeAll(); //버튼을 계속 눌러도 추가생성되지 않음
    contentPanel.add(writingPanel);
    frame.setVisible(true);
  }

}

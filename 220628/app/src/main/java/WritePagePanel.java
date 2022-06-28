import javax.swing.*;
import java.awt.*;

public class WritePagePanel extends JPanel {
  private final JFrame frameWrite;
  private JTextArea writingTextArea;

  public WritePagePanel() {
    frameWrite = new JFrame("회고 작성");
    frameWrite.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frameWrite.setSize(500,500);

    JTextArea writingTextArea = new JTextArea("글을 입력하세요",10,30);
    frameWrite.add(writingTextArea);

    //글 등록 버튼을 넣을 패널 생성
    JPanel panel = new JPanel();
    panel.add(createPostRegisterButton());
    frameWrite.add(panel,BorderLayout.PAGE_END);

    frameWrite.setVisible(true);
  }

  public JButton createPostRegisterButton() {
    JButton button = new JButton("글 등록하기");
    button.addActionListener(event -> {
       Post post  = new Post();
       post.register();


    });
    return button;
  }
}

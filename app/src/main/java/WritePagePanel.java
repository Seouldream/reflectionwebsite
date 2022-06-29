import javax.swing.*;
import java.awt.*;

public class WritePagePanel extends JPanel {
  private final JTextField textfield;
  PostManagement postManagement;
  private JFrame frameWrite;
  private JTextArea writingTextArea;
  private PostPagePanel postPagePanel;


  public WritePagePanel(PostManagement postManagement, PostPagePanel postPagePanel) {
    this.postManagement = postManagement;
    this.postPagePanel = postPagePanel;
    frameWrite = new JFrame("회고 작성");
    frameWrite.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    frameWrite.setSize(500, 500);
    frameWrite.setLocation(700,700);

    textfield = new JTextField((25));
    frameWrite.add(textfield, BorderLayout.PAGE_START);

    writingTextArea = new JTextArea("글을 입력하세요", 10, 30);
    writingTextArea.setLineWrap(true);
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
      postManagement.post(writingTextArea);

      postPagePanel.createPostContentButton();
      frameWrite.setVisible(false);


    });
        return button;
    }
}

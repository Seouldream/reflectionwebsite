

import javax.swing.*;
import java.awt.*;

public class WritingPanel extends JPanel {
  private JPanel mainPanel;
  private JTextField postTextField;
  private JPanel contentPanel;
  private JFrame frame;

  WritingPanel() {
    setLayout((new GridLayout(3,1)));
    JTextField writingTextField = new JTextField("글을 입력하세요", 20);
    this.add(writingTextField);

    JButton writingRegistButton = new JButton("등록하기");
    writingRegistButton.addActionListener(event -> {
      String post = writingTextField.getText();
      post(post);
    });
    this.add(writingRegistButton);


  }

  public void post(String post) {

    JLabel postLabel = new JLabel();
    postLabel.setText(post);
    contentPanel.add(postLabel);
    frame.setVisible(true);

  }
}

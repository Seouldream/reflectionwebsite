import javax.swing.*;
import java.awt.*;

public class BoardPanel {
  private JFrame frame;



  public void menuBar( JFrame frame) {
    this.frame = frame;
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    this.frame.add(panel,BorderLayout.PAGE_START);

    //레이블 관리
    JLabel mainLabel = new JLabel("회고 게시판");

    panel.add(mainLabel);

    //버튼

    panel.add(createWritingButton());


  }

  private JButton createWritingButton() {
    JButton button = new JButton("글쓰기");
    createWritingButton().addActionListener(event -> {

    });
      return button;
  }

}

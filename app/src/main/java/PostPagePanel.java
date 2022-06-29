import javax.swing.*;
import java.awt.*;

public class PostPagePanel extends JPanel {


  private JPanel contentPanel;
  private JPanel writePagePanel;
  private PostManagement postManagement;
  private String post;
  private int geti;


  public PostPagePanel(PostManagement postManagement) {
    this.postManagement = postManagement;

    this.setLayout(new FlowLayout());

    JLabel titleLabel = new JLabel("게시판");
    this.add(titleLabel);

    //for (String post : postManagement.getPosts()) {
    //  this.add(new JLabel(post));
    //}
    this.add(createPostContentButton());
  }



  public JPanel createPostContentButton() {
    JPanel panel = new JPanel();

    for(int i = 0 ; i < postManagement.getPosts().size(); i += 1) {
      int postNumber = 1 + i;
      JButton buttonForPosts  = new JButton("게시물" + postNumber);
      this.geti = i;
      buttonForPosts.addActionListener(event -> {
        JFrame frame = new JFrame("회고" + postManagement.getPosts().size());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500,500);
        JLabel label = new JLabel("제목을 적는 란입니다.");

        JLabel labelForContent = new JLabel(postManagement.getPosts().get(geti));

        frame.add(label);
        frame.add(labelForContent);
        frame.setVisible(true);
      });
      panel.add(buttonForPosts);
    }
      return panel;
  }
}








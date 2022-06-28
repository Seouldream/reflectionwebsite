import javax.swing.*;
import java.awt.*;

public class PostPagePanel extends JPanel {

  private JPanel contentPanel;
  private JPanel writePagePanel;
  private PostManagement postManagement;


  public PostPagePanel(PostManagement postManagement) {


    this.setLayout(new FlowLayout());

    JLabel titleLabel = new JLabel("게시판");
    this.add(titleLabel);


    for (String post : postManagement.getPosts()) {
      this.add(new JLabel(post));
    }


  }

  public String inuDo() {
    postManagement.getPosts();
    return "";
  }
}





import javax.swing.*;

public class PostPagePanel extends JPanel {
  private  Post post;

  public PostPagePanel(Post Post ) {
    JLabel titleLabel = new JLabel("게시판");
    this.add(titleLabel);

    for(String post : post.getPosts()){
      JLabel postLabel = new JLabel(post);
      this.add(postLabel);
      
    }

  }
}

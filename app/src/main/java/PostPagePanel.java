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


        //입력받은 텍스트를 순서대로 리스트에서 가져옴
        JTextArea textAreaForContent = new JTextArea(postManagement.getPosts().get(geti),10,30);
        textAreaForContent.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textAreaForContent);
        JPanel panelForContentLabel = new JPanel();

        panelForContentLabel.setLayout(new BorderLayout());


        panelForContentLabel.add(scrollPane, BorderLayout.CENTER);
        panelForContentLabel.setLayout(new GridLayout(1,1));


        frame.add(panelForContentLabel);
        frame.setVisible(true);
      });
      panel.add(buttonForPosts);
    }
      return panel;
  }
}








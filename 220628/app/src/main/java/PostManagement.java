import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PostManagement {
  PostPagePanel postPagePanel;

  private List<String> posts = new ArrayList<>();

  public PostManagement() {

  }


  public void post(JTextArea writingTextArea) {

        String writingText = writingTextArea.getText();
        this.posts.add(writingText);

  }
  public List<String> getPosts() {
    return posts;
  }




 }


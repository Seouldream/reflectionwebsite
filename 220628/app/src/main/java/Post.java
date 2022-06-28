import java.util.ArrayList;
import java.util.List;

public class Post {
  private List<String> posts = new ArrayList<>();
  public List<String> getPosts() {

    return posts;
  }

  public void register() {

    posts.add("글 올라갔다.");

  }
}

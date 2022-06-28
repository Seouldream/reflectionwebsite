import java.util.ArrayList;
import java.util.List;

public class PostManagement {
 List<String> posts = new ArrayList<>();

  public void post() {
        this.posts.add("posts well uploaded");
  }
  public List<String> getPosts() {
    return posts;
  }

}

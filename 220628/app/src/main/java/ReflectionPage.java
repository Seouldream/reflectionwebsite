//1. 글쓰기 버튼과 게시판 버튼 만들기 완료 (컨텐츠 패널로 이음)
//2. 글쓰기 버튼 클릭시 글쓰기 프레임 및 등록하기 버튼 생성 (완료)
//3. 등록하기 클릭시 액션 입력 (등록된 글이 게시판으로 버튼으로 만들어지면서 클릭하면 프레임으로 나타나기) **
import javax.swing.*;
import java.awt.*;

public class ReflectionPage {
  private JFrame frameMain;
  private JPanel contentPanel;
  private Post post;

  public static void main(String[] args) {
    ReflectionPage application = new ReflectionPage();
    application.run();
  }

  public void run() {
    frameMain = new JFrame("Reflection Page");
    frameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frameMain.setSize(700, 700);

    initMenu();


    frameMain.setVisible(true);
  }

  public void initMenu() {
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());
    frameMain.add(panel,BorderLayout.PAGE_START);

    initContentPanel();
    panel.add(createPostingPageButton());
    panel.add(createWriteButton());


  }

  private JButton createPostingPageButton() {
    JButton button = new JButton("게시판");
    button.addActionListener(event -> {
      PostPagePanel postPagePanel = new PostPagePanel(post);
      showContentPanel(postPagePanel);

    });
    return button;
  }

  private JButton createWriteButton() {
    JButton button = new JButton("글쓰기");
    button.addActionListener(event -> {
      WritePagePanel writePagePanel = new WritePagePanel();
      showContentPanel(writePagePanel);

    });
    return button;
  }

  public void showContentPanel(JPanel panel) {
    contentPanel.removeAll();
    contentPanel.add(panel);
    frameMain.setVisible(true);
  }

  public void initContentPanel() {
    contentPanel = new JPanel();
    frameMain.add(contentPanel);
  }
}

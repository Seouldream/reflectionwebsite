//1. 글쓰기 버튼과 게시판 버튼 만들기 완료 (컨텐츠 패널로 이음)
//2. 글쓰기 버튼 클릭시 글쓰기 프레임 및 등록하기 버튼 생성 (완료)
//3. 등록하기 클릭시 액션 입력 (등록된 글이 게시판으로 버튼으로 만들어지면서 클릭하면 프레임으로 나타나기) **
//구조조정 해야함
//레이블에 장문을 넣으려니 안됬는데 텍스트 에어리어를 그대로 가져올수 있었음 -> 여전히 가로로 퍼지는건 적용 불가 일단 냅둠
//임시방편으로 스크롤 넣어줌 ㅋ
import javax.swing.*;
import java.awt.*;

public class ReflectionPage {
  private JFrame frameMain;
  private JPanel contentPanel;
  private PostManagement postManagement;
  private PostPagePanel postPagePanel;




  public static void main(String[] args) {
    ReflectionPage application = new ReflectionPage();
    application.run();
  }

  public void run() {
    postManagement = new PostManagement();
    postPagePanel = new PostPagePanel(postManagement);

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

  public JButton createPostingPageButton() {
    JButton button = new JButton("게시판");
    button.addActionListener(event -> {
      postPagePanel = new PostPagePanel(postManagement);
      showContentPanel(postPagePanel);

    });
    return button;
  }

  public JButton createWriteButton() {
    JButton button = new JButton("글쓰기");
    button.addActionListener(event -> {
      WritePagePanel writePagePanel = new WritePagePanel(postManagement,postPagePanel);
      showContentPanel(writePagePanel);

    });
    return button;
  }

  public void initContentPanel() {
    contentPanel = new JPanel();
    //contentPanel.setLayout(new FlowLayout());
    frameMain.add(contentPanel);
  }

  public void showContentPanel(JPanel panel) {
    contentPanel.removeAll();
    contentPanel.add(panel);
    contentPanel.setVisible(false);
    contentPanel.setVisible(true);
    frameMain.setVisible(true);
  }
}

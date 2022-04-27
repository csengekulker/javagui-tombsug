import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {

  JPanel mainPanel;
  //class variables
  JLabel aboutLabel;
  JLabel exerciseLabel;
  JLabel taskLabel;
  JLabel sideLabel;
  JTextField sideField;
  JButton calcButton;

  public MainFrame() {

    this.setComponents();
    this.setPanels();
    this.setFrame();

  }

  private void setFrame() {
    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.setSize(400, 300);
    this.pack();
    this.setVisible(true);
    this.add(mainPanel);
  }

  private void setPanels() {
    this.mainPanel = new JPanel();

    mainPanel.add(this.aboutLabel);
    mainPanel.add(this.exerciseLabel);
    mainPanel.add(this.taskLabel);
    mainPanel.add(this.sideLabel);
    mainPanel.add(this.sideField);
    mainPanel.add(this.calcButton);

    mainPanel.setLayout(
      new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS)
    );
  }

  private void setComponents() {
    this.aboutLabel = new JLabel("Balogh Csenge, Szoft_I_N, 2022.04.27");
    this.exerciseLabel = new JLabel("Feladat 0312");
    this.taskLabel = new JLabel("Rombuszba beírható kör sugara");
    this.sideLabel = new JLabel("Oldal");
    this.sideField = new JTextField();
    this.calcButton = new JButton("Számít");

    // this.exerciseLabel.setFont();
  }
}

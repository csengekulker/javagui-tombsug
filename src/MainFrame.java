import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
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
    this.setSize(400, 300);
    this.setVisible(true);
  }

  private void setPanels() {

  }

  private void setComponents() {

  }
}

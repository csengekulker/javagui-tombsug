import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
  //class variables
  JPanel mainPanel;
  JPanel sideInputPanel;
  JPanel alphaInputPanel;
  JLabel aboutLabel;
  JLabel exerciseLabel;
  JLabel taskLabel;
  JLabel sideLabel;
  JTextField sideField;
  JLabel alphaLabel;
  JTextField alphaField;
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
    // this.pack();
    this.setVisible(true);
    this.add(mainPanel);
  }

  private void setPanels() {
    this.mainPanel = new JPanel();
    this.sideInputPanel = new JPanel();
    this.alphaInputPanel = new JPanel();

    mainPanel.add(this.aboutLabel);
    mainPanel.add(this.exerciseLabel);
    mainPanel.add(this.taskLabel);
    // mainPanel.add(this.sideLabel);
    // mainPanel.add(this.sideField);
    this.sideInputPanel.add(this.sideLabel);
    this.sideInputPanel.add(this.sideField);
    this.alphaInputPanel.add(this.alphaLabel);
    this.alphaInputPanel.add(this.alphaField);
    mainPanel.add(sideInputPanel);
    mainPanel.add(alphaInputPanel);

    mainPanel.add(this.calcButton);

    mainPanel.setLayout(
      new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS)
    );

    sideInputPanel.setLayout(
      new BoxLayout(sideInputPanel, BoxLayout.LINE_AXIS)
    );

    alphaInputPanel.setLayout(
      new BoxLayout(alphaInputPanel, BoxLayout.LINE_AXIS)
    );

    EmptyBorder border = new EmptyBorder(10, 10, 10, 10);
    mainPanel.setBorder(border);

  }

  private void setComponents() {
    this.aboutLabel = new JLabel("Balogh Csenge, Szoft_I_N, 2022.04.27");
    this.exerciseLabel = new JLabel("Feladat 0312");
    this.taskLabel = new JLabel("Rombuszba beírható kör sugara");
    this.sideLabel = new JLabel("Oldal:");
    this.sideField = new JTextField(5);
    this.alphaLabel = new JLabel("Alfa szög:");
    this.alphaField = new JTextField(5);
    this.calcButton = new JButton("Számít");

    Font font = new Font("sans serif", Font.BOLD, 22);
    this.exerciseLabel.setFont(font);

    this.calcButton.addActionListener(a -> buttonAction());
  }

  private void buttonAction() {
    double side = Double.parseDouble(this.sideField.getText());
    double alpha = Double.parseDouble(this.alphaField.getText());

    double radius = (side * Math.sin(Math.toRadians(alpha))) / 2;

    System.out.println(radius);
  }
}

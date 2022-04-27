import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
  //class variables
  JPanel mainPanel;
  JPanel sideInputPanel;
  JPanel alphaInputPanel;
  JPanel buttonPanel;
  JLabel aboutLabel;
  JLabel exerciseLabel;
  JLabel taskLabel;
  JLabel sideLabel;
  JTextField sideField;
  JLabel alphaLabel;
  JTextField alphaField;
  JButton calcButton;
  JButton delButton;
  JButton exitButton;

  public MainFrame() {

    this.setComponents();
    this.setPanels();
    this.setFrame();

  }

  private void setFrame() {

    this.setTitle("App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // this.setSize(400, 300);
    this.add(mainPanel);
    this.pack();
    this.setVisible(true);

  }

  private void setPanels() {
    this.mainPanel = new JPanel();
    this.sideInputPanel = new JPanel();
    this.alphaInputPanel = new JPanel();
    this.buttonPanel = new JPanel();

    mainPanel.add(this.aboutLabel);
    mainPanel.add(this.exerciseLabel);
    mainPanel.add(this.taskLabel);
    // mainPanel.add(this.sideLabel);
    // mainPanel.add(this.sideField);
    this.sideInputPanel.add(this.sideLabel);
    this.sideInputPanel.add(this.sideField);
    this.alphaInputPanel.add(this.alphaLabel);
    this.alphaInputPanel.add(this.alphaField);
    this.buttonPanel.add(this.calcButton);
    this.buttonPanel.add(this.delButton);
    this.buttonPanel.add(this.exitButton);
    mainPanel.add(sideInputPanel);
    mainPanel.add(alphaInputPanel);
    mainPanel.add(buttonPanel);
    

    mainPanel.setLayout(
      new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS)
    );

    sideInputPanel.setLayout(
      new BoxLayout(sideInputPanel, BoxLayout.PAGE_AXIS)
    );

    alphaInputPanel.setLayout(
      new BoxLayout(alphaInputPanel, BoxLayout.PAGE_AXIS)
    );

    buttonPanel.setLayout(
      new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS)
    );

    EmptyBorder border = new EmptyBorder(10, 10, 10, 10);
    mainPanel.setBorder(border);

  }

  private void setComponents() {
    this.aboutLabel = new JLabel("Balogh Csenge, Szoft_I_N, 2022.04.27");
    this.exerciseLabel = new JLabel("Feladat 0312");
    this.taskLabel = new JLabel("Rombuszba beírható kör sugara");
    this.sideLabel = new JLabel("Oldal:");
    this.sideField = new JTextField();
    this.alphaLabel = new JLabel("Alfa szög:");
    this.alphaField = new JTextField();
    this.calcButton = new JButton("Számít");
    this.delButton = new JButton("Törlés");
    this.exitButton = new JButton("Kilépés");

    this.sideField.setMaximumSize(
      new Dimension(250, 30)
    );
    this.alphaField.setMaximumSize(
      new Dimension(250, 30)
    );

    Font font = new Font("sans serif", Font.BOLD, 22);
    this.exerciseLabel.setFont(font);

    this.calcButton.addActionListener(a -> calcButtonAction());
    this.delButton.addActionListener(a -> delButtonAction());
    this.exitButton.addActionListener(a -> exitButtonAction());
  }


  private void calcButtonAction() {
    String sideStr = this.sideField.getText();

    String alphaStr = this.alphaField.getText();
    

    if (sideStr.isEmpty() || alphaStr.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Nincs érték beállítva!");
      return;
    }

    if (!sideStr.matches("[0-9]+") || !alphaStr.matches("[0-9]+")) {
      JOptionPane.showMessageDialog(this, "Nem számok!");
      return;
    }

    double side = Double.parseDouble(sideStr);
    double alpha = Double.parseDouble(alphaStr);

    double radius = (side * Math.sin(Math.toRadians(alpha))) / 2;

    System.out.println(radius);
  }

  private void delButtonAction() {
    this.sideField.setText("");
    this.alphaField.setText("");
  }

  private void exitButtonAction() {
    System.exit(0);
  }
}

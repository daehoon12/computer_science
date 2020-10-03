import javax.swing.*;
import java.awt.*;

public class TextFieldWindow extends FrameWindow implements Observer{
    private JTextField textField;
    private boolean flag;
    public TextFieldWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
    }

    public void updateText(String msg) {
            textField.setText(msg);
            textField.validate();
    }
    private PrimeObservableThread primeThread = new PrimeObservableThread();;
    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        textField = new JTextField();
        panel.add(textField);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }

    @Override
    public void update(String num) {
       updateText(""+num);
    }

}

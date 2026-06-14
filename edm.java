import java.awt.*;
import java.awt.event.*;

class SimpleEDM extends Frame implements ActionListener {

    Button b;

    SimpleEDM() {
        b = new Button("Click Me");
        b.setBounds(100, 100, 100, 40);

        add(b);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        // Register event
        b.addActionListener(this);
    }

    // Event handling method
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) {
        new SimpleEDM();
    }
}
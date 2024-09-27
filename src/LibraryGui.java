import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class LibraryGui extends JFrame {
    
    JLabel appHeader;

    LibraryGui() {

        // App header
        appHeader = new JLabel("Digital Library");
        appHeader.setFont(new Font(null, Font.PLAIN, 25));
        appHeader.setBounds(0, 0, 100, 50);
        appHeader.setHorizontalAlignment(JLabel.CENTER);
        appHeader.setOpaque(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 450);
        this.setVisible(true);
        this.add(appHeader, BorderLayout.NORTH);

    }

}

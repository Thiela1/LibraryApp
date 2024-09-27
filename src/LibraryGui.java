import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGui extends JFrame implements ActionListener {
    
    JLabel appHeader;
    JButton topTen;

    LibraryGui() {

        // App header
        appHeader = new JLabel();
        appHeader.setText("Digital Library");
        appHeader.setFont(new Font(null, Font.PLAIN, 25));
        appHeader.setBounds(0, 0, 200, 50);
        appHeader.setHorizontalAlignment(JLabel.CENTER);
        appHeader.setOpaque(true);

        // Top Ten button
        topTen = new JButton();
        topTen.addActionListener(this);
        topTen.setFocusable(false);
        topTen.setBounds(75, 100, 125, 25);
        topTen.setText("Top Ten Books");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 450);
        this.setVisible(true);
        this.setLayout(null);
        this.add(appHeader, BorderLayout.NORTH);
        this.add(topTen);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == topTen) {

        }
    }

}

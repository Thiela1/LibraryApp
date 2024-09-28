import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryGui extends JFrame implements ActionListener {
    
    JLabel appHeader;
    JButton topTen;
    JButton search;
    JButton author;
    JButton pubYear;
    JCheckBox asc;

    Font hFont = new Font(null, Font.PLAIN, 25);
    Font bFont = new Font(null, Font.BOLD, 10);

    Library tempLib;

    LibraryGui(Library library) {

        // Assign the temp lib
        tempLib = library;

        // App header
        appHeader = new JLabel();
        appHeader.setText("Digital Library");
        appHeader.setFont(hFont);
        appHeader.setBounds(40, 0, 200, 50);
        appHeader.setHorizontalAlignment(JLabel.CENTER);
        appHeader.setOpaque(true);

        // Top ten button
        topTen = new JButton();
        topTen.addActionListener(this);
        topTen.setFocusable(false);
        topTen.setBounds(75, 100, 125, 25);
        topTen.setText("Top Ten Books");
        topTen.setFont(bFont);

        // Search button
        search = new JButton();
        search.addActionListener(this);
        search.setFocusable(false);
        search.setBounds(75, 150, 125, 25);
        search.setText("Search for Book");
        search.setFont(bFont);

        // Sort by author button
        author = new JButton();
        author.addActionListener(this);
        author.setFocusable(false);
        author.setBounds(75, 200, 125, 25);
        author.setText("Sort by Author");
        author.setFont(bFont);

        // Sort by year button
        pubYear = new JButton();
        pubYear.addActionListener(this);
        pubYear.setFocusable(false);
        pubYear.setBounds(75, 250, 125, 25);
        pubYear.setText("Sort by Year");
        pubYear.setFont(bFont);

        // Ascend/Descend checkbox
        asc = new JCheckBox();
        asc.setBounds(75, 275, 150, 20);
        asc.setText("Ascending");
        asc.setFocusable(false);

        // Attach everything and setup frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 350);
        this.setVisible(true);
        this.setLayout(null);
        this.add(appHeader, BorderLayout.NORTH);
        this.add(topTen);
        this.add(search);
        this.add(author);
        this.add(pubYear);
        this.add(asc);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == topTen) {
            String tempList = tempLib.displayTopBooks();

            JOptionPane.showMessageDialog(null, tempList, "Top Ten Books", JOptionPane.PLAIN_MESSAGE);
        }
        if (e.getSource() == search) {
            SearchWindow sw = new SearchWindow(tempLib);
        }
        if (e.getSource() == author) {
            tempLib.sortByAuthor(asc.isSelected());
            String tempList = tempLib.displayTopBooks();

            JOptionPane.showMessageDialog(null, tempList, "Sorted By Author", JOptionPane.PLAIN_MESSAGE);
        }
        if (e.getSource() == pubYear) {
            tempLib.sortByPublicationYear(asc.isSelected());
            String tempList = tempLib.displayTopBooks();

            JOptionPane.showMessageDialog(null, tempList, "Sorted By Publication Year", JOptionPane.PLAIN_MESSAGE);
        }
    }

}

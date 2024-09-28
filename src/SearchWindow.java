import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SearchWindow extends JFrame implements ActionListener {

    JButton submit;
    JTextField searchField;

    LinkedLibrary tempLib;
    
    SearchWindow(LinkedLibrary library) {

        // Set the tempLib
        tempLib = library;

        // Setup frame
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Enter ID");

        // Create button
        submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.putClientProperty("library", library);

        // Create text field
        searchField = new JTextField();
        searchField.setPreferredSize(new Dimension(250, 40));

        // Add items to frame
        this.add(submit);
        this.add(searchField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {

            // Get temp ints for testing purposes
            long prevTime;
            long currTime;
            long totalTime;

            // Capture Time before search
            prevTime = System.currentTimeMillis();

            // Search for book
            book foundBook = tempLib.linearSearchById(Integer.parseInt(searchField.getText()));

            // Capture Time After search
            currTime = System.currentTimeMillis();

            // Calc total search time and print to console
            totalTime = currTime - prevTime;
            System.out.println("Time taken to search: " + totalTime);

            // Check if book found, if not give error
            if (foundBook != null) {
                JOptionPane.showMessageDialog(null, foundBook.toString(), "Book Found", JOptionPane.PLAIN_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "No book found.", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

}

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SearchWindow extends JFrame implements ActionListener {

    JButton submit;
    JTextField searchField;
    
    SearchWindow(Library library) {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Search");

        submit = new JButton("Submit");
        submit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}

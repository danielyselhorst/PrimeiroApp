import java.awt.*;
import javax.swing.*;

public class segundoApp{

    public static void main(String[] args){

        JFrame miJFrame = new JFrame("Exemplo - java swing");
        miJFrame.setSize(500, 300);

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        miJPanel.setLayout(new GridBagLayout());

        JLabel miJLabel = new JLabel();
        miJLabel.setText("Dima-me a sua opiniao sobre java swing: ");

        JTextArea miJTextArea = new JTextArea(5, 20);

        miJPanel.add(miJLabel); 
        miJPanel.add(miJTextArea); 
        miJFrame.add(miJPanel); 
        miJFrame.setVisible(true); 


    }
}
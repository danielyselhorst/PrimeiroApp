import java.awt.*;
import javax.swing.*;

public class primeiroApp{

    public static void main(String[] args){
        System.out.println("Ola mundo GUI");

        JFrame frame = new JFrame("Minha primeira janela");
        frame.setSize(400, 300);//largura e altura da tela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fechar tela

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink); //sempre que for alterar alguma caracteristicas usar set
        panel.setLayout(new BorderLayout());

        JButton button = new JButton("Clique em mim!!");
        button.setBackground(Color.red);//botao
        button.setForeground(Color.YELLOW);//tela
        button.setPreferredSize(new Dimension(200, 50));

        JTextField textField = new JTextField(10);
        textField.setFont(new Font("Serif", Font.BOLD, 36));

        JLabel label = new JLabel("Digite o seu nome!!!");
        label.setFont(new Font("Serif", Font.BOLD, 36));//fonte da letra

        //add um Listener no click do botao
        button.addActionListener(e -> {
           JOptionPane.showMessageDialog(null, label.getText(), "Titulo", 2); 
        });
        
        JTextArea textArea = new JTextArea("Hoje esta sendo um dia frio e ensolarado!!");
        JTextArea textArea1 = new JTextArea("Hoje esta sendo um dia frio e ensolarado!!");


        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        formPanel.add(label);
        formPanel.add(textField);

        panel.add(formPanel, BorderLayout.NORTH);
        panel.add(button, BorderLayout.SOUTH);
        panel.add(textArea, BorderLayout.EAST);
        panel.add(textArea1, BorderLayout.WEST);
        frame.add(panel);//add = adcionar o compotente panel
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", 3); // exibe avisos na tela





    }
}
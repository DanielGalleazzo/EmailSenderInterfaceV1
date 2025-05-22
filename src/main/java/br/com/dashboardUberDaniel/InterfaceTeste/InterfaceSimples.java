import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceSimples {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Envio de E-mail");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel EmailDestinatario = new JLabel("E-mail do destinatário:");
        JTextField Destinatario = new JTextField(20);
        JLabel NomeProduto = new JLabel("Insira o nome do produto:");
        JTextField Produto = new JTextField(20);
        JLabel QuantidadeProduto = new JLabel("Quantidade atual de: " + Produto);
        JTextField Quantidade = new JTextField(20);
        JButton button = new JButton("Enviar email");
        JLabel resultadoLabel = new JLabel("");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = Destinatario.getText();
                resultadoLabel.setText("E-mail digitado: " + email);
            }
        });

        panel.add(EmailDestinatario);
        panel.add(Destinatario);
        panel.add(NomeProduto);
        panel.add(Produto);
        panel.add(QuantidadeProduto);
        panel.add(Quantidade);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(resultadoLabel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

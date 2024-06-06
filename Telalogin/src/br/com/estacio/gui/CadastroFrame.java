package br.com.estacio.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class CadastroFrame extends JFrame {
    private JTextField nomeField;
    private JTextField enderecoField;
    private JButton salvarButton;
    private JButton consultarButton;
    private JButton relatoriosButton;
    private JTabbedPane tabbedPane;
    private JLabel nomeLabel_1;
    private JTextField textField;
    private JLabel enderecoLabel_1;
    private JTextField textField_1;
    private JButton consultarButton_1;
    private JButton relatoriosButton_1;

    public CadastroFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Antonio\\Downloads\\iconfinal.jpg"));
        setTitle("Tela de Cadastro");
        setSize(529, 397);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        tabbedPane = new JTabbedPane();

        JPanel cadastroPanel = new JPanel();
        cadastroPanel.setLayout(null); // Usando layout absoluto

        JLabel nomeLabel = new JLabel("Nome Produto:");
        nomeLabel.setBounds(50, 50, 100, 25);
        cadastroPanel.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(150, 50, 200, 25);
        cadastroPanel.add(nomeField);

        JLabel enderecoLabel = new JLabel("Quantidade:");
        enderecoLabel.setBounds(50, 100, 100, 25);
        cadastroPanel.add(enderecoLabel);

        enderecoField = new JTextField();
        enderecoField.setBounds(150, 100, 200, 25);
        cadastroPanel.add(enderecoField);

        salvarButton = new JButton("Salvar");
        salvarButton.setBounds(50, 150, 100, 25);
        cadastroPanel.add(salvarButton);

        consultarButton = new JButton("Consultar");
        consultarButton.setBounds(160, 150, 100, 25);
        cadastroPanel.add(consultarButton);

        relatoriosButton = new JButton("Relatórios");
        relatoriosButton.setBounds(270, 150, 100, 25);
        cadastroPanel.add(relatoriosButton);

        tabbedPane.addTab("Cadastro", cadastroPanel);
        tabbedPane.setEnabledAt(0, true);
        getContentPane().add(tabbedPane, BorderLayout.CENTER);

        // Ação do botão salvar
        salvarButton.addActionListener(e -> {
            // Código para salvar os dados
            String nome = nomeField.getText();
            String endereco = enderecoField.getText();
            JOptionPane.showMessageDialog(null, "Cadastro realizado para: " + nome + ", " + endereco);
        });

        // Ação do botão consultar
        consultarButton.addActionListener(e -> {
            // Cria um novo painel para a aba de consulta
            JPanel consultarPanel = new JPanel();
            consultarPanel.setLayout(null); // Usando layout absoluto

            // Adiciona a nova aba ao JTabbedPane
            tabbedPane.addTab("Consulta", consultarPanel);
            tabbedPane.setSelectedComponent(consultarPanel);

            nomeLabel_1 = new JLabel("Loja:");
            nomeLabel_1.setBounds(80, 47, 100, 25);
            consultarPanel.add(nomeLabel_1);

            textField = new JTextField();
            textField.setBounds(180, 47, 200, 25);
            consultarPanel.add(textField);

            enderecoLabel_1 = new JLabel("Produto:");
            enderecoLabel_1.setBounds(80, 97, 100, 25);
            consultarPanel.add(enderecoLabel_1);

            textField_1 = new JTextField();
            textField_1.setBounds(180, 97, 200, 25);
            consultarPanel.add(textField_1);

            consultarButton_1 = new JButton("Consultar");
            consultarButton_1.setBounds(147, 147, 100, 25);
            consultarPanel.add(consultarButton_1);

            relatoriosButton_1 = new JButton("Relatórios");
            relatoriosButton_1.setBounds(280, 147, 100, 25);
            consultarPanel.add(relatoriosButton_1);
        });

        // Ação do botão relatórios
        relatoriosButton.addActionListener(e -> {
            // Código para gerar relatórios
            JOptionPane.showMessageDialog(null, "Ação de relatórios realizada");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroFrame().setVisible(true));
    }
}

import javax.swing.*;
import java.awt.*;

class View extends JFrame {
    private JLabel L1;
    private JLabel L2;
    private JLabel LTinggi;
    private JLabel LBerat;
    private JLabel hasilLabel;
    private JLabel statusLabel;
    private JButton hitungButton;
    private JTextField tinggiField;
    private JTextField beratField;

    public View() {
        setTitle("Kalkulator BMI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        L1 = new JLabel("Kalkulator BMI");
        L2 = new JLabel("Masukkan Data");
        LTinggi = new JLabel("Tinggi (cm)");
        LBerat = new JLabel("Berat (kg)");
        hasilLabel = new JLabel();
        statusLabel = new JLabel();
        hitungButton = new JButton("Hitung");
        tinggiField = new JTextField();
        beratField = new JTextField();

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        add(L1, constraints);

        constraints.gridy = 1;
        constraints.gridwidth = 2;
        add(L2, constraints);

        constraints.gridy = 2;
        constraints.gridwidth = 1;
        add(LTinggi, constraints);

        constraints.gridx = 1;
        add(tinggiField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        add(LBerat, constraints);

        constraints.gridx = 1;
        add(beratField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        add(hasilLabel, constraints);

        constraints.gridy = 5;
        add(statusLabel, constraints);

        constraints.gridy = 6;
        constraints.gridwidth = 2;
        add(hitungButton, constraints);

        setVisible(true);
        setLocationRelativeTo(null); // Menempatkan jendela di tengah layar
    }

    public JButton getHitungButton() {
        return hitungButton;
    }

    public JTextField getTinggiField() {
        return tinggiField;
    }

    public JTextField getBeratField() {
        return beratField;
    }

    public JLabel getHasilLabel() {
        return hasilLabel;
    }

    public JLabel getStatusLabel() {
        return statusLabel;
    }
}
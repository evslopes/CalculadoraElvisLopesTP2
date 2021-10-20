import javax.swing.*;

public class Calculadora extends JFrame {
    private JLabel lblTitulo;
    private JTextField txtOperando1;
    private JTextField txtOperando2;
    private JLabel lblOperando1;
    private JLabel lblOperando2;
    private JButton btnDivisao;
    private JButton btnAdicao;
    private JButton btnSubtracao;
    private JButton btnMultiplicacao;
    private JPanel calculadoraPanel;
    private JTextField txtResultado;

    public Calculadora(){
        setContentPane(calculadoraPanel);
        setTitle("Calculadora Java - TP2 Projeto de Bloco Java");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Calculadora calculadoraTP = new Calculadora();
    }
}


import javax.swing.JOptionPane;

public class RevendedoraCarrosGUI {
    public static void main(String[] args) {
        String numCarros = JOptionPane.showInputDialog("Número de carros vendidos:");
        String valorVendas = JOptionPane.showInputDialog("Valor total das vendas:");
        String salarioFixo = JOptionPane.showInputDialog("Salário fixo do vendedor:");
        String comissao = JOptionPane.showInputDialog("Comissão por carro vendido:");
        
        int numCarrosInt = Integer.parseInt(numCarros);
        double valorVendasDouble = Double.parseDouble(valorVendas);
        double salarioFixoDouble = Double.parseDouble(salarioFixo);
        double comissaoDouble = Double.parseDouble(comissao);
        
        double salarioTotal = salarioFixoDouble + (numCarrosInt * comissaoDouble) + (valorVendasDouble * 0.05);
        
        JOptionPane.showMessageDialog(null, "O salário final do vendedor é: R$" + salarioTotal);
    }
}

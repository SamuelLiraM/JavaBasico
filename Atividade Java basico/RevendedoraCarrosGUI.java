
import javax.swing.JOptionPane;

public class RevendedoraCarrosGUI {
    public static void main(String[] args) {
        String numCarros = JOptionPane.showInputDialog("N�mero de carros vendidos:");
        String valorVendas = JOptionPane.showInputDialog("Valor total das vendas:");
        String salarioFixo = JOptionPane.showInputDialog("Sal�rio fixo do vendedor:");
        String comissao = JOptionPane.showInputDialog("Comiss�o por carro vendido:");
        
        int numCarrosInt = Integer.parseInt(numCarros);
        double valorVendasDouble = Double.parseDouble(valorVendas);
        double salarioFixoDouble = Double.parseDouble(salarioFixo);
        double comissaoDouble = Double.parseDouble(comissao);
        
        double salarioTotal = salarioFixoDouble + (numCarrosInt * comissaoDouble) + (valorVendasDouble * 0.05);
        
        JOptionPane.showMessageDialog(null, "O sal�rio final do vendedor �: R$" + salarioTotal);
    }
}

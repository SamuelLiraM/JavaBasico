import javax.swing.JOptionPane;

public class Pesquisa {
    public static void main(String[] args) {
        int idade;
        int contFem = 0;
        int contTotal = 0;
        char sexo;
        char corOlhos;
        char corCabelos;
        double salario;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do habitante ou -1 para sair: "));
        while (idade != -1) {
            sexo = JOptionPane.showInputDialog("Digite o sexo do habitante (m ou f): ").charAt(0);
            while (sexo != 'm' && sexo != 'f') {
                sexo = JOptionPane.showInputDialog("Sexo inválido. Digite novamente: ").charAt(0);
            }

            corOlhos = JOptionPane.showInputDialog("Digite a cor dos olhos do habitante (a, v, c ou p): ").charAt(0);
            while (corOlhos != 'a' && corOlhos != 'v' && corOlhos != 'c' && corOlhos != 'p') {
                corOlhos = JOptionPane.showInputDialog("Cor dos olhos inválida. Digite novamente: ").charAt(0);
            }

            corCabelos = JOptionPane.showInputDialog("Digite a cor dos cabelos do habitante (l, c, p ou r): ").charAt(0);
            while (corCabelos != 'l' && corCabelos != 'c' && corCabelos != 'p' && corCabelos != 'r') {
                corCabelos = JOptionPane.showInputDialog("Cor dos cabelos inválida. Digite novamente: ").charAt(0);
            }

            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do habitante: "));
            while (salario < 0) {
                salario = Double.parseDouble(JOptionPane.showInputDialog("Salário inválido. Digite novamente: "));
            }

            if (sexo == 'f' && idade >= 18 && idade <= 35 && corOlhos == 'c' && corCabelos == 'c') {
                contFem++;
            }
            contTotal++;

            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do habitante ou -1 para sair: "));
        }
        double porcentagemFem = ((double) contFem / contTotal) * 100;
        JOptionPane.showMessageDialog(null, String.format("A porcentagem de indivíduos do sexo feminino, com idade entre 18 e 35 anos e que tenham olhos castanhos e cabelos castanhos é de %.2f%%", porcentagemFem));
    }
}
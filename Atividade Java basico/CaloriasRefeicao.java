import javax.swing.JOptionPane;

public class CaloriasRefeicao {
    public static void main(String[] args) {
        // Tabela de calorias
        int[][] calorias = {
            {180, 230, 250, 350},
            {75, 110, 170, 200},
            {20, 70, 100, 65}
        };

        // Opções de prato
        String[] pratos = {"Vegetariano", "Peixe", "Frango", "Carne"};

        // Opções de sobremesa
        String[] sobremesas = {"Abacaxi", "Sorvete diet", "Mousse diet", "Mousse chocolate"};

        // Opções de bebida
        String[] bebidas = {"Chá", "Suco de laranja", "Suco de melão", "Refrigerante diet"};

        // Pedir ao usuário que informe o prato escolhido
        String pratoEscolhidoStr = JOptionPane.showInputDialog(null,
            "Informe o prato escolhido:",
            "Escolha do prato",
            JOptionPane.PLAIN_MESSAGE,
            null,
            pratos,
            pratos[0]).toString();
        int pratoEscolhido = -1;
        for (int i = 0; i < pratos.length; i++) {
            if (pratos[i].equals(pratoEscolhidoStr)) {
                pratoEscolhido = i;
                break;
            }
        }

        // Pedir ao usuário que informe a sobremesa escolhida
        String sobremesaEscolhidaStr = JOptionPane.showInputDialog(null,
            "Informe a sobremesa escolhida:",
            "Escolha da sobremesa",
            JOptionPane.PLAIN_MESSAGE,
            null,
            sobremesas,
            sobremesas[0]).toString();
        int sobremesaEscolhida = -1;
        for (int i = 0; i < sobremesas.length; i++) {
            if (sobremesas[i].equals(sobremesaEscolhidaStr)) {
                sobremesaEscolhida = i;
                break;
            }
        }

        // Pedir ao usuário que informe a bebida escolhida
        String bebidaEscolhidaStr = JOptionPane.showInputDialog(null,
            "Informe a bebida escolhida:",
            "Escolha da bebida",
            JOptionPane.PLAIN_MESSAGE,
            null,
            bebidas,
            bebidas[0]).toString();
        int bebidaEscolhida = -1;
        for (int i = 0; i < bebidas.length; i++) {
            if (bebidas[i].equals(bebidaEscolhidaStr)) {
                bebidaEscolhida = i;
                break;
            }
        }

        // Somar as calorias do prato escolhido com as da sobremesa escolhida e com as da bebida escolhida
        int totalCalorias = calorias[0][pratoEscolhido] + calorias[1][sobremesaEscolhida] + calorias[2][bebidaEscolhida];

        // Informar ao usuário o total de calorias da refeição
        JOptionPane.showMessageDialog(null,
            "A quantidade total de calorias da refeição é: " + totalCalorias,
            "Total de calorias",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
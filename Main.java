
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String JOptionsPane;
        /*
        System.out.println("Olá!!");
             
        int vInteiro = 10;
        double vDouble = 1.0;
        float vFloat = 1.3f;
        boolean vBoolean = true;
        
        //tipos de referencia
        String vTexto = "Aluno";
        System.out.println("Variavel inteira:" +vInteiro);
        System.out.println("Variavel double:" +vDouble);
        
        System.out.println("---------///----------");
        
        System.out.println("Variavel inteira:" +vInteiro
                           +"\nVariavel double:" +vDouble
                           +"\nVariavel float:" +vFloat
                           +"\nVariavel boolean:" +vBoolean
                           +"\nVariavel texto:" +vTexto);
        System.out.println(vTexto);
        
         
        //Pratica
        
        //Intanciação da classe pra criar o objeto sc
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        //String aluno;
        String aluno = sc.nextLine();
      
        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();
        
        System.out.println("Digite seu salário");
        double salario = sc.nextDouble();
        
        System.out.println("Digite seu peso");
        float peso = sc.nextFloat();
        
        System.out.println("Nome" +aluno
                          +"\nidade" +idade
                          +"\nsalário" +salario
                          +"\npeso" +peso);
        
        String nome;
        nome = JOptionPane.showInputDialog("Digite o nome");
        
        String idade = JOptionPane.showInputDialog("Digite a idade");
        int idadeInt = Integer.parseInt(idade);
        
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite a salário"));
        JOptionPane.showMessageDialog(null,
                "Nome"+nome
                +"\nIdade"+idade
                +"\nsalario" +salario);*/
        
        
        //----------Exercícios------------
        
        
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        String CPF = JOptionPane.showInputDialog("Digite seu CPF:");
        
        String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        
        String nomePet = JOptionPane.showInputDialog("Digite o nome do pet:");
        
        String idadePet = JOptionPane.showInputDialog("Digite a idade do pet:");
        int idadePetInt = Integer.parseInt(idadePet);
        
        String raca = JOptionPane.showInputDialog("Qual a raça do pet?");
        
        String sexo = JOptionPane.showInputDialog("Qual o sexo do pet?");
        
        JOptionPane.showMessageDialog(null,
                "Nome: " +nome
                +"\nCPF: " +CPF
                +"\ntelefone: " +telefone
                +"\nnomePet: " +nomePet
                +"\nidadePet: " +idadePet
                +"\nraça: " +raca
                +"\nsexo: " +sexo);
    }
    
}

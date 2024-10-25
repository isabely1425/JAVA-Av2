import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a cidade: ");
    String cidade = scanner.nextLine();

    System.out.println("Digite a idade do cliente: ");
    int idade = scanner.nextInt();

    System.out.println("Digite o salario do cliente: ");
    int salario = scanner.nextInt();

    pessoa Pessoa = new pessoa();
    Pessoa.setNome(nome);
    Pessoa.setIdade(idade);
    Pessoa.setCidade(cidade);
    Pessoa.setSalario(salario);
    

    System.out.println("Nome: " + Pessoa.getNome());
    System.out.println("Idade: " + Pessoa.getIdade());
    System.out.println("Cidade: " + Pessoa.getCidade());
    System.out.println("salario: " + Pessoa.getSalario());

  }
}
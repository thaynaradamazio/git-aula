package programa;

/*Faça um programa em Java para simular uma parte do funcionamento de
uma agenda de contatos. 
Você deverá ter as opções de incluir uma pessoa e listar todas as pessoas cadastradas. 
Cada pessoa terá nome, sobrenome e telefone de contato. 
O número máximo de contatos que podem ser salvos é
definido por você. Fique à vontade.
Use o código fornecido na plataforma de aprendizagem para começar o seu
projeto.
Após finalizar o programa, compartilhe-o em sua conta do GitHub./ */

import java.util.Scanner;

public class application {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;
  
    do {
      System.out.println("Escolha uma opção:");
      System.out.println("1 - Incluir pessoa");
      System.out.println("2 - Listar todos os cadastrados");
      System.out.print("Opção: ");

      opcao = sc.nextInt();
      sc.nextLine(); // Limpa o ENTER q fica na entrada

      switch (opcao) {
        case 0:
          System.out.println("Fim do programa!");
          break;
        case 1:

          break;
        case 2:

          break;
        default:
          System.out.println("Opção inválida!");
          break;
      }
    } while (opcao != 0);

    sc.close();
  }
}
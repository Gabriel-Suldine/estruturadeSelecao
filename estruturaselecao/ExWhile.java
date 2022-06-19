/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.estruturaselecao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 0) {
            System.out.println("Cadastro cliente");
            System.out.println("0 - Fim");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Exluir");
            System.out.println("4 - Consultar");
            System.out.println("Opção: ");
            opcao = entrada.nextInt();
            System.out.println("Voce escolheu a Opção: " + opcao);

        }

    }

}

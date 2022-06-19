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
public class AeB {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = entrada.nextInt();
        if (A > B) {
            System.out.println("A é maior");
        } else {
            System.out.println("B é maior");

        }

    }

}

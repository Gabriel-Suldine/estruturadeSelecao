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
public class ifElse1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int N = entrada.nextInt();
        if (N <= 10) {
            System.out.println("F1");

        } else if (N > 10 && N <= 100) {
            System.out.println("F2");

        } else {
            System.out.println("F3");

        }

    }

}

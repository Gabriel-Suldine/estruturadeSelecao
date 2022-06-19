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
public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int A = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        int B = entrada.nextInt();
        System.out.println("Digite o terceiro valor: ");
        int C = entrada.nextInt();

        if (A <= B && B < C) {
            System.out.println(A + ", " + B + ", " + C);
        } else if (A <= C && C <= B) {
            System.out.println(A + ", " + C + ", " + B);

        } else if (B <= A && A <= C) {
            System.out.println(B + ", " + A + ", " + C);
        } else if (B <= C && C <= A) {
            System.out.println(B + ", " + C + ", " + A);
        } else if (C <= B && B <= A) {
            System.out.println(C + ", " + B + ", " + A);
        } else {
            System.out.println(C + ", " + A + ", " + B);

        }

    }

}

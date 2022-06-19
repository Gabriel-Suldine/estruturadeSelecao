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
public class MultiplicacaoSoma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois numeros: ");
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int acumulador = 0;
        int cont = 1;
        while (cont <= A) {
            acumulador += B;
            cont++;
        }
        System.out.println(A + " x " + B + " = " + acumulador);

    }
}

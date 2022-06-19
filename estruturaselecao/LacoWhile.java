/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.estruturaselecao;

import java.util.Scanner;

public class LacoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor = 0;
        int soma = 0;
        int cont = 0;
        while (valor != 9999) {
            System.out.println("Digite um valor: ");
            valor = entrada.nextInt();
            if (valor != 9999) {
                soma += valor;
                cont++;
            }

        }
        
        System.out.printf("soma: %d \nMédia: %d ", soma,soma/cont);

    }

}

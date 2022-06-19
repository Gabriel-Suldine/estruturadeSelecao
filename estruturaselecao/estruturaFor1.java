/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.estruturaselecao;

import java.util.Scanner;

/**
 *
 * @author 03569198200
 */
public class estruturaFor1 {

    public static void main(String[] args) {
        int ContN = 0, soma = 0, valor = 0;
        int tamanho = 50;
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= tamanho; i++) {
            System.out.println("Digite um número ");
            valor = entrada.nextInt();
            if (valor >= 0) {
                soma += valor;

            } else {
                ContN++;
            }
        }
        System.out.printf("Soma: %d\nValores Negativos: %d", soma, ContN);
    }

}

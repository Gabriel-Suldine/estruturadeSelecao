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
public class AprovadoIf {
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Informe sua média ");
    int media = entrada.nextInt();
    if (media >= 70){
        System.out.print("Aprovado ");

    }else{
        System.out.print("Reprovado ");

    }
    
    }
    
}

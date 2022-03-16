/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplotrycatch;

/**
 *
 * @author devsys-b
 */
public class exemploArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] matriz = new int[10];
        
        try{
            for(int i = 0; i < 20; i++) {
            matriz[i] = i;
            System.out.printf("posicao[%d]: %d\n", i, matriz[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException excecao) {
            System.err.printf("%nExcecao encontrada: %s%n", excecao);
            System.out.println("Excesso de elementos na matriz");
        }
        
    }
}

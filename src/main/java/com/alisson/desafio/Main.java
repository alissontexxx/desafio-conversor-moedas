package com.alisson.desafio;

import java.util.Scanner;

import classes.ConsultarMoeda;
import classes.Moeda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de conversor de moedas!");

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        double valor = 0;

        while (opcao != 7) {
            menu();
            opcao = sc.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        // System.out.print("Digite o valor em Dólar: ");
                        // valor = sc.nextDouble();
                        ConsultarMoeda moeda = new ConsultarMoeda();
                        System.out.println(moeda.buscarMoeda("PYG"));
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Erro ao buscar a moeda!");
            }

        }

        sc.close();

    }

    static void menu() {
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Dólar => Peso Argentino");
        System.out.println("2 - Peso Argentino => Dólar");
        System.out.println("3 - Dólar => Real Brasileiro");
        System.out.println("4 - Real Brasileiro => Dólar");
        System.out.println("5 - Dólar => Peso Colombiano");
        System.out.println("6 - Peso Colombiano => Dólar");
        System.out.println("7 - Sair!");
        System.out.println();
        System.out.print("Escolha uma opção válida!\n****************************\n");
        System.out.print("Opcão: ");

    }
}
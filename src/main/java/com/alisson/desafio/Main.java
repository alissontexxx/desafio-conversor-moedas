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
        ConsultarMoeda moeda = new ConsultarMoeda();
        Moeda moedaBuscada;
        Double moedaRecebida = 0.0;

        while (opcao != 7) {
            menu();
            opcao = sc.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor em Dólar: ");
                        valor = sc.nextDouble();
                        // ConsultarMoeda moeda = new ConsultarMoeda();
                        moedaBuscada = moeda.buscarMoeda("USD");
                        moedaRecebida = moedaBuscada.getConversionRates().get("ARS");
                        // Double euro = moedaDolar.getConversionRates().get("EUR");

                        if (moedaRecebida != null) {
                            double valorConvertido = valor * moedaRecebida;
                            // System.out.println("Valor convertido: " + valorConvertido);
                            System.out.printf("Valor de %.2f [USD] corresponde ao valor final de ==> %.2f [ARS]\n",
                                    valor,
                                    valorConvertido);
                        }
                        break;
                    case 2:
                        System.out.print("Digite o valor em Peso Argentino: ");
                        valor = sc.nextDouble();
                        // ConsultarMoeda moeda = new ConsultarMoeda();
                        moedaBuscada = moeda.buscarMoeda("ARS");
                        moedaRecebida = moedaBuscada.getConversionRates().get("USD");
                        // Double euro = moedaDolar.getConversionRates().get("EUR");

                        if (moedaRecebida != null) {
                            double valorConvertido = valor * moedaRecebida;
                            // System.out.println("Valor convertido: " + valorConvertido);
                            System.out.printf("Valor de %.2f [ARS] corresponde ao valor final de ==> %.2f [USD]\n",
                                    valor,
                                    valorConvertido);
                        }
                        break;
                    // saindo do programa
                    case 7:
                        System.out.println("Saindo...");
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
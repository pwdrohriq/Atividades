/*
(a) pq elas tem os mesmos metodos sobrecarregados
(b) pq ele chama o metodo sobrecarregado da executiva
(c) em execuçao ele decide chamar primeiro o metodo comum do desconto
 e dentro dele em tempo de execuçao ele chama o calcularValor sobrecarregado
 */

import javax.swing.*;
import java.util.ArrayList;

public class AppCorridas_2 {

    public static void  main(String[] args){

        ArrayList<Corridas> corridas = new ArrayList<>();
        int menu =1;
        while(menu!=0){
            int tipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Tipo de corrrida:\n[1] Economica\n[2] Executiva\n[3] Moto\n[4] Noturna\n[5] compartilhada\n[0] sair"));
            if(tipo == 0) {
                menu =0;
                break;
            }

            String origem = JOptionPane.showInputDialog(null, "Origem:");
            String destino = JOptionPane.showInputDialog(null, "Destino:");
            double distanciaKm = Double.parseDouble(JOptionPane.showInputDialog(null, "Distancia (Km)"));
            int minutos = Integer.parseInt( JOptionPane.showInputDialog(null, "Tempo (minutos)"));

            switch (tipo){
                case 1: {

                    Corridas c = new CorridaEconomica(origem, destino, distanciaKm, minutos);
                    corridas.add(c);
                    break;
                } case 2: {

                    Corridas c = new CorridaExecutiva(origem, destino, distanciaKm, minutos);
                    corridas.add(c);
                    break;
                } case 3: {

                    Corridas c = new CorridaMoto(origem, destino, distanciaKm, minutos);
                    corridas.add(c);
                    break;
                } case 4: {

                    Corridas c = new CorridaNoturna(origem, destino, distanciaKm, minutos);
                    corridas.add(c);
                    break;
                } case 5:
                {
                    int passageiros = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos passageiros?"));
                    Corridas c = new CorridaCompartilhada(origem, destino, distanciaKm, minutos, passageiros);
                    corridas.add(c);

                    break;
                } default:{
                    JOptionPane.showMessageDialog(null, "Opçao invalida!!");
                }
            }
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja cadastrar uma nova corrida?\n[0] Nao\n[1] Sim"));
            if(menu != 0 && menu != 1) menu = 0;
        }

        if(!corridas.isEmpty()){
            double total = 0;
            for (Corridas c : corridas) {
                JOptionPane.showMessageDialog(null, c);
                total += c.calcularValor();
            }
            JOptionPane.showMessageDialog(null, "Total:\n " + String.format("%.2f%n", total));
        }
    }
}

/*
(a) pq elas tem os mesmos metodos sobrecarregados
(b) pq ele chama o metodo sobrecarregado da executiva
(c) em execuçao ele decide chamar primeiro o metodo comum do desconto
 e dentro dele em tempo de execuçao ele chama o calcularValor sobrecarregado
 */

import javax.swing.*;
import java.util.ArrayList;

public class AppCorridas {

    public static double semPolimorfismo(ArrayList<Corridas> lista){
        double total=0;
// oh coisa horrivel
        for(int i=0; i<lista.size(); i++){
            if(  lista.get(i) instanceof CorridaMoto corridaMoto ){

                total += (5.00 + 2.00 * corridaMoto.distanciaKm + 0.30 * corridaMoto.minutos)*0.75;

            } else if(  lista.get(i) instanceof CorridaCompartilhada corridaCompartilhada ){

                total += ((5.00 + 2.00 * corridaCompartilhada.distanciaKm + 0.30 * corridaCompartilhada.minutos)*1.2)/corridaCompartilhada.passageiros;

            } else if(  lista.get(i) instanceof CorridaExecutiva corridaExecutiva ){

                total += (5.00 + 2.00 * corridaExecutiva.distanciaKm + 0.30 * corridaExecutiva.minutos)*1.5;

            } else if(  lista.get(i) instanceof CorridaNoturna corridaNoturna ){

                total += (5.00 + 2.00 * corridaNoturna.distanciaKm + 0.30 * corridaNoturna.minutos)+ 6.0;

            } else{

                total += 5.00 + 2.00 * lista.get(i).distanciaKm + 0.30 * lista.get(i).minutos;

            }
        }

        return total;
    }

    public static void  main(String[] args){

        ArrayList<Corridas> corridas = new ArrayList<>();
        corridas.add(new CorridaEconomica("Campus", "Centro", 6.5, 20));
        corridas.add(new CorridaExecutiva("Centro", "Aeroporto", 12.0, 30));
        corridas.add(new CorridaCompartilhada("Bairro", "Campus", 8.0, 25, 3));
        corridas.add(new CorridaMoto("agui", "logo ali", 5, 12));
        corridas.add(new CorridaNoturna("daqui mesmo", "bem pertinho", 0.750, 3));

        double total = 0;
        for (Corridas c : corridas) {
            JOptionPane.showMessageDialog(null, c + "\n cupom 10%: R$" + String .format("%.2f%n", c.calcularValor(10)) );
            total += c.calcularValor();
        }
        JOptionPane.showMessageDialog(null, "Total com polimorfismo:\n " + String .format("%.2f%n", total));

        JOptionPane.showMessageDialog(null, "Total sem polimorfismo:\n " + String .format("%.2f%n", semPolimorfismo(corridas)));

    }
}

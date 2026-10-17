package pizzaria;

import java.util.ArrayList;

public class Pedido {

        private ArrayList<Item> itens;
        private String data;
        private int codigo;

        public Pedido(String dia, int cod){
            this.data = dia;
            this.codigo = cod;
            this.itens = new ArrayList<>();
        }

        public void AddItens(Item item){
            itens.add(item);
        }

        public double calcularTotal(){
                double total =0;
                    for(Item i : itens){
                        total += i.getQuantidade() * i.getPizza().getPreco();
                    }
                return total;
        }
        public int getCodigo(){
            return this.codigo;
        }

        public StringBuilder getItens(){
            StringBuilder s = new StringBuilder();
            for(Item i : itens){
                s.append(i.getQuantidade() + "x " + i.getPizza().getSabor() + " " + i.getPizza().getTamanho() + "\n");

            }
            return s;
        }

        public String getData(){
            return this.data;
        }

        public String imprimir(){
            StringBuilder s = this.getItens();
            return "Codigo do pedido: " + this.getCodigo() + "\nData: " + this.getData() +"\nItens:\n" + s + "\nTotal: " + this.calcularTotal();
        }
    }

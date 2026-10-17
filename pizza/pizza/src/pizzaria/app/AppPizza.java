package pizzaria.app;

import pizzaria.Pedido;
import pizzaria.Pizza;
import pizzaria.Tamanho;
import pizzaria.Item;
import pizzaria.controle.ControlePizza;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AppPizza {

    public static String menu(){
    return "Digite:\n" + "1 - Cadastrar pizza\n" + "2 - Cadastrar pedido\n"+ "3 - Listar pedido\n"+ "0 - para sair";
}

    static void main(String[] args){

         ArrayList<Pedido> pedidos = new ArrayList<>();

        ControlePizza controlePizza = new ControlePizza();
        int menu = 1;
        while(menu!=0){
            String m;
            m = JOptionPane.showInputDialog(null, menu());
            menu = Integer.parseInt(m);

            switch (menu){
                case(1):{
                    String  sabor, codigo, tamanho, preco;
                    codigo = JOptionPane.showInputDialog(null, "Codigo: " );
                    sabor = JOptionPane.showInputDialog(null, "Sabor: ");
                    tamanho = JOptionPane.showInputDialog(null, "Tamanho:\n1- Pequena\n2- Media\n3- Grande\n4- Familia");
                    preco = JOptionPane.showInputDialog(null, "Preco:");
                    int i = Integer.parseInt(tamanho);
                    Tamanho[] tamanhos = new Tamanho[4];
                    tamanhos[0] = Tamanho.pequena;
                    tamanhos[1] = Tamanho.media;
                    tamanhos[2] = Tamanho.grande;
                    tamanhos[3] = Tamanho.familia;

                    controlePizza.cadastrarPizza(Integer.parseInt(codigo), sabor, tamanhos[i-1], Double.parseDouble(preco));
                    continue;
                } case(2):{
                    String Data;
                    Data = JOptionPane.showInputDialog(null, "Insira o codigo do novo pedido:");
                    int cod = Integer.parseInt(Data);
                    Data = JOptionPane.showInputDialog(null, "Insira a data do novo pedido:");

                    Pedido pedido = new Pedido(Data, cod);
                    pedidos.add(pedido);

                    int menucadastro;
                    String s;
                    s = JOptionPane.showInputDialog(null, "Deseja adicionar uma pizza ao pedido?\n[0] Nao\n[1] Sim");
                    menucadastro = Integer.parseInt(s);
                    while (menucadastro!=0){
                        String codpizza;
                        codpizza = JOptionPane.showInputDialog(null, "Codigo da pizza:");
                        int codpizzza = Integer.parseInt(codpizza);

                        Pizza pizza = controlePizza.pesquisarPizza(codpizzza);
                        JOptionPane.showMessageDialog(null, pizza.imprimir());
                        if(pizza != null){
                            String s2;
                            s2 = JOptionPane.showInputDialog(null, "Quantas pizzas adicionar ao pedido?");
                            int qtd= Integer.parseInt(s2);

                            Item item = new Item(pizza, qtd);
                            pedido.AddItens(item);
                        }else{
                            JOptionPane.showMessageDialog(null, "Nao existe pizza com esse codigo");
                        }
                        String outra;
                        outra = JOptionPane.showInputDialog(null, "Deseja cadastrar outra pizza?\n[0] nao\n[1] sim");
                        if(Integer.parseInt(outra) == 1) continue;
                        else{
                            JOptionPane.showMessageDialog(null, "O total do pedido foi " + pedido.calcularTotal());
                            m = "-1";
                            break;
                        }
                    }
                } case(3):{
                    int i=1;
                    if(Integer.parseInt(m) == 3){
                        for(Pedido p : pedidos){
                            JOptionPane.showMessageDialog(null, "Pedido " + i +":\n" + p.imprimir());
                            i++;
                        }
                    }

                }

            }

        }

    }
}

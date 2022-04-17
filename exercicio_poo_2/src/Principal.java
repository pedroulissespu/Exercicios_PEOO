import java.util.*;

public class Principal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Scanner inputstring = new Scanner(System.in);
        System.out.println("Digite o Id do produto : ");
        int id = input.nextInt();
        System.out.println("Descrição do Produto : ");
        String descricao_do_produto = inputstring.nextLine();
        
        System.out.println("Quantidade disponivel : ");
        int quantidade_comprada_de_item = input.nextInt();
        System.out.println("Preço do produto: ");
        double preco_do_item = input.nextDouble();

        ItemDeCompra itemdecompra = new ItemDeCompra(id,descricao_do_produto,quantidade_comprada_de_item,preco_do_item);

        System.out.println(itemdecompra);

        input.close();
        inputstring.close();
    }
}

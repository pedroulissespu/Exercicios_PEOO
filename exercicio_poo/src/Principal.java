public class Principal {
    public static void main(String[] args) {
        System.out.println("Exercicios POO 1");
        Paises paises = new Paises("pais_exemplo_1","capital_foda_do_caralho",100);
        Paises paises2 = new Paises("pais_exemplo_2","capital_foda_do_caralho2",200);
        Paises paises3 = new Paises("pais_exemplo_3","capital_foda_do_caralho3",300);
        Paises paises4 = new Paises("pais_exemplo_4","capital_foda_do_caralho4",400);

        System.out.println(paises.comparativo(paises));
        System.out.println(paises.comparativo(paises2));
        System.out.println(paises.comparativo(paises3));
        System.out.println(paises.comparativo(paises4));

        Paises[] lista = {paises,paises2,paises3,paises4};
        
        paises.fronteira(lista);

        Paises[] lista2 = paises.getFronteiras();

        System.out.println(paises.getNome());
        for(int i = 0; i<lista2.length ; i++) System.out.println("Nome do pais : "+lista2[i].getNome());

        Paises[] lista3 = {paises,paises2,paises3,paises4};

        paises.fronteira(lista3);
        paises4.fronteira(lista3);

        Paises[] lista4 = paises.vizinhosEmComum(paises4);

        System.out.println("Paises que faz fronteira com o " + paises.getNome() + " e com " + paises4.getNome());
        for(int i = 0 ; i < lista4.length ; i++) System.out.println("Nome : " + lista4[i].getNome());
    }
    
}
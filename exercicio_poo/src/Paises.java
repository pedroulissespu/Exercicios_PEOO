public class Paises {
    private String nome;
    private String nome__da_capital;
    private int quilometro;
    private Paises[] fronteiras;

    public Paises(String nome, String nome__da_capital, int quilometro) {
        this.nome = nome;
        this.nome__da_capital = nome__da_capital;
        this.quilometro = quilometro;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome__da_capital() {
        return nome__da_capital;
    }
    public void setNome__da_capital(String nome__da_capital) {
        this.nome__da_capital = nome__da_capital;
    }
    public int getQuilometro() {
        return quilometro;
    }
    public void setQuilometro(int quilometro) {
        this.quilometro = quilometro;
    }
    
    public boolean comparativo(final Paises outro){
        boolean retorno = false;
        
        String nome_pais = this.nome;
        String nome_capital_pais = this.nome__da_capital;
        
        String nome_outro_pais = outro.getNome();
        String nome_capital_outro_pais = outro.getNome__da_capital();
        
        if(nome_pais.equals(nome_outro_pais) && 
                (nome_capital_pais.equals(nome_capital_outro_pais))){
            retorno = true;
        }
        
        return retorno;
    }
    
    public void fronteira(Paises... paises){
        int quantidadePaisesIguais = 0;
        for(int i=0;i<paises.length;i++){
            if(this.equals(paises[i])){
                quantidadePaisesIguais++;
            }
        }
        this.fronteiras = new Paises[paises.length - quantidadePaisesIguais];
        int idxFronteira = 0;
        for(int i=0;i< paises.length;i++){
            if(!this.equals(paises[i])){
                this.fronteiras[idxFronteira] = paises[i];
                idxFronteira++;
            }
        }
        
    }
    
    public Paises[] getFronteiras(){
        return this.fronteiras;
    }

    public Paises[] vizinhosEmComum(Paises outro) {
        int totaisIguais = 0;
        
        
        for (Paises fronteiraPais : this.fronteiras) {
            for (Paises fronteiraOutro : outro.fronteiras) {
                if (fronteiraPais.equals(fronteiraOutro)) {
                    totaisIguais++;
                }
            }
        }

        if (totaisIguais > 0) {
            int idxVizinhos = 0;
            Paises[] mesmosVizinhos = new Paises[totaisIguais];
            for (Paises fronteiraPais : this.fronteiras) {
                for (Paises fronteiraOutro : outro.fronteiras) {
                    if (fronteiraPais.equals(fronteiraOutro)) {
                        mesmosVizinhos[idxVizinhos] = fronteiraOutro;
                        idxVizinhos++;
                    }
                }
            }

            return mesmosVizinhos;
        }
        return null;
    }    
    
}
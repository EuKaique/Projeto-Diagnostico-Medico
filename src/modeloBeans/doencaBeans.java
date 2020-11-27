//Autor do software Kaique Oliveira
package ModeloBeans;
//Classe que irá receber os getters e setters do Formulário de Doenças
public class doencaBeans {

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getCodigo() {
        return codigo;
    }

    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getInformacoes() {
        return informacoes;
    }

    
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    
    public String getProcurar() {
        return procurar;
    }

    
    public void setProcurar(String procurar) {
        this.procurar = procurar;
    }
//Declaração das variavéis que irão receber os setters e getters
private String nome;
private int codigo;
private String informacoes;
private String procurar;
    
}


//Autor do software Kaique Oliveira

package ModeloBeans;


public class medicoBeans {


    public String getPesquisa() {
        return Pesquisa;
    }

    
    
    public void setPesquisa(String Pesquisa) {
        this.Pesquisa = Pesquisa;
    }

    
    
    public int getCodigo() {
        return Codigo;
    }

    
    
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    
    
    public int getCRM() {
        return CRM;
    }

    
    
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    
    
    public String getNome() {
        return Nome;
    }

    
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    
    
    public String getEspecialista() {
        return Especialista;
    }

    
    
    public void setEspecialista(String Especialista) {
        this.Especialista = Especialista;
    }

    private int Codigo;
    private int CRM;
    private String Nome;
    private String Especialista;
    private String Pesquisa;
}

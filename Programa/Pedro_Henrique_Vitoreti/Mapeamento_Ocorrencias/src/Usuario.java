public class Usuario {
    //usuario comum
    private int cpf;
    private String nome;
    private int telefone;
    private int senha;
    //usuario admim 
    private boolean admin;
    //usuario logado
    // private boolean logado;

    public Usuario(int cpf, String nom, int tel, int sen)
    {
        this.cpf=cpf;
        this.nome=nom;
        this.telefone=tel;
        this.senha=sen;
        this.admin=false;
        // this.logado=false;
    }
    //status comuns
    public int getCpf(){ return cpf;}
    public String getNome(){ return nome;}
    public int getTelefone(){ return telefone;}
    public int getSenha(){ return senha;}
    //status admin
    public boolean getAdmin(){return admin;}
    public void setAdmin(boolean status){this.admin= status;}
    //status logado ou deslogado
    // public boolean getLogado(){return logado;}
    // public void setLogado(boolean status){this.logado= status;}
}

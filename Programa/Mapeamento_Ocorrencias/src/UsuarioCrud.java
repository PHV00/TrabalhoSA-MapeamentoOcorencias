public class UsuarioCrud {
    
    BancoDeDados bd;
    private int cpf;
    private String nome;
    private int telefone;
    private int senha; 

    public UsuarioCrud(BancoDeDados bd)
    {
        this.bd=bd;
    }

    public void cadastrarUsuario()
    {
        cpf=EntradaSaida.inserirValorInt("Digite seu cpf:");
        telefone=EntradaSaida.inserirValorInt("Digite seu telefone:");
        nome=EntradaSaida.inserirValorString("Digite seu nome completo:");
        senha=EntradaSaida.inserirValorInt("Digite sua senha:"); 
        Usuario usuario= new Usuario(cpf, nome, telefone, senha);
        bd.adicionarUsuario(usuario);
    }

    public void excluirUsuario()
    {
        if(EntradaSaida.inserirValorString("Confirmar? S/N").toUpperCase()=="S")
        {
            
        }
    }

    public void executarCrud() {
        EntradaSaida.mostrarMsg("1-Cadastrar Usuario");
    }

}

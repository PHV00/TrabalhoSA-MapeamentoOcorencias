public class UsuarioCrud {
    
    BancoDeDados bd;
    Validacao vl;
    //usuario comum
    private int cpf;
    private String nome;
    private int telefone;
    private int senha;
    //usuario admim 
    private boolean admin;//n sei se precisa aqui
    //logado
    private boolean logado;// n sei se precisa aqui
    
    public UsuarioCrud(BancoDeDados bd, Validacao vl)
    {
        this.bd=bd;
        this.vl=vl;
    }

    public void executarCrud() {
        String menu="";
        menu+="1- Cadatrar Usuario\n2-Excluir Usuarios\n3-Emitir Lista de usuarios";
        int opcao=EntradaSaida.inserirValorInt(menu);
    }

    public void cadastrarUsuario()//é necessario validar todos os dados?========================================================
    {
        this.cpf=EntradaSaida.inserirValorInt("Digite seu cpf:");
        this.telefone=EntradaSaida.inserirValorInt("\nDigite seu telefone:");
        this.nome=EntradaSaida.inserirValorString("\nDigite seu nome completo:");
        this.senha=EntradaSaida.inserirValorInt("\nDigite sua senha:");
        
        Usuario usuario= new Usuario(this.cpf, this.nome, this.telefone, this.senha);
        bd.inserirUsuario(usuario);
        
        if(EntradaSaida.inserirValorString("\nDeseja ser admim? S/N:").equals("S"))this.cadastrarAdmin(usuario);//validar talvez com switch
    }
    public void cadastrarAdmin(Usuario usuario)// não sei se funciona  
    {
        Usuario adm=this.bd.encontrarUsuario("adm");//
        int i=0;
        boolean senhaCorreta;
        do{
            int senha=EntradaSaida.inserirValorInt("\nInforme a senha Adm:");
            senhaCorreta=vl.validarAdm(senha);
            if(senhaCorreta==true)
            { 
                usuario.setAdmin(true);
                break;
            }
            else EntradaSaida.mostrarMsg("\nSenha Invalida!!! "+(i+1)+"º tentativas de 3");
            i++;
        }while(senhaCorreta==false && i<3);//rever a logica
    }

    public void deletarUsuario()//rever logica e inclementar no banco de dados
    {
        Usuario usuario;
        usuario=this.bd.encontrarUsuario(EntradaSaida.inserirValorString("Digite o nome:"));
        if(usuario.getNome().equals("ERROR")) EntradaSaida.mostrarMsg("Usuario não encontrado!");
        else{
            if(EntradaSaida.inserirValorString("Confirmar? S/N").toUpperCase().equals("S")) this.bd.excluirUsuario(usuario);
        }
    }

    public void emitirLista()
    {   
        //dá pra fazer sem o foreach, usando um contador e mudadno no banco de dados a função visualizarusuario e mudar de 
        //recber usuario par receber um contador da posição e aqui colocar um for q passa por toda lista sla
        for (Usuario usuario  : this.bd.getListaUsuarios()) {
            
        }
    }
}

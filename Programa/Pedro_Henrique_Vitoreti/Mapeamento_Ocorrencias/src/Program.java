
public class Program {
    public static void main(String[] args) {//
        //Rever tudo desdo conceito do crud ,até oque bd tem que fazer,, e como aplicar cada um.Acho q bd é o crud e o crud é o bd, olha os nome e compara com o conceito
        BancoDeDados bd= new BancoDeDados(); 
        Validacao validacao= new Validacao(bd);
        UsuarioCrud usuario= new UsuarioCrud(bd,validacao);
        
        //Mapa.testeTamanhoTela();
        // Mapa m=new Mapa();
        // m.testeMapa();
        // Tela tela= new Tela();
        // tela.testeTela("");
        
        boolean sair=false;
        while(sair==false)
        {
            if (bd.getUsuarioLogado().getNome()=="Publico") {
                EntradaSaida.mostrarMsg("\u001B[2J");
                EntradaSaida.mostrarMsg("\u001B[2J");
                EntradaSaida.mostrarMsg("Usuario:"+bd.getUsuarioLogado().getNome()+"\n\n");
                String op=EntradaSaida.inserirValorString("1-Login\n2-Cadastro\n3-Ver Mapa\n0-Sair");
                switch (op) {
                    case "1":
                        boolean sairLogin = false;
                        while(sairLogin==false)
                        {
                            String usuarioLogin=EntradaSaida.inserirValorString("Digite seu usuario: ");
                            int posicaoUsuarioLogado=bd.encontrarUsuario(usuarioLogin);
                            if(posicaoUsuarioLogado!=-1)
                            {
                                boolean senhaCorreta=false;
                                int i=0;
                                while(senhaCorreta==false||i==3)
                                {
                                    int senha=EntradaSaida.inserirValorInt("Digite sua senha: ");
                                    if (senha==bd.getListaUsuarios().get(posicaoUsuarioLogado).getSenha())
                                    {
                                        bd.setUsuarioLogado(bd.getListaUsuarios().get(posicaoUsuarioLogado));
                                        sairLogin=true;
                                        senhaCorreta=true;
                                    }else
                                    {
                                        EntradaSaida.mostrarMsg("Senha Incorreta! Tente novamente, você entá na "+(i+1)+"ª tentativa de 3");
                                        i++;
                                    }
                                }
                                EntradaSaida.mostrarMsg("Senha Incorreta!");//errado pensa no if pq depois
                                sairLogin=true;
                            }else
                            {
                                EntradaSaida.mostrarMsg("Usuario não encontrado");
                                boolean erroLogin=false;
                                while(erroLogin==true)
                                {
                                    String continuar=EntradaSaida.inserirValorString("Tentar novamente (s/n): ");
                                    switch (continuar.toLowerCase()) {
                                        case "s":
                                            break;
                                        case "n":
                                            sairLogin=true;
                                            break;
                                        default:
                                            EntradaSaida.mostrarMsg("Opção inválida");
                                            erroLogin=true;
                                            break;
                                }
                                }
                            }
                        } 
                        break;
                    case "2":
                        usuario.cadastrarUsuario();
                        break;
                    case "3":
    
                        break;
                    case "0":
                        sair=true;
                        break;
                    default:
                        EntradaSaida.mostrarMsg("Error opção inválida");
                        break;
                }
                EntradaSaida.mostrarMsg("\u001B[2J");
            }else if (bd.getUsuarioLogado().getAdmin()==true)
            {
                
            }else if(bd.getUsuarioLogado().getAdmin()==false)
            {

            }
        }

    }
}

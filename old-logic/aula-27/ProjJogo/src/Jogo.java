public class Jogo {
    private JanKenPon usuario;
    private JanKenPon computador;
    private String nome;
    
    //metodo construtor
    public Jogo(byte jogadaUsuario,String nome){//pedindo a jogada e o nome do usuario
        this.usuario=new JanKenPon(jogadaUsuario);
        byte sorteio=(byte)(Math.random()*3+1);
        this.computador=new JanKenPon(sorteio); 
        this.nome = nome;
    }
    
    //metodos
    public String verificarVencedor(){
        byte usu=this.usuario.getJogada();
        byte comp=this.computador.getJogada();
        //empates
        if(usu==1 && comp==1){
            return "Empate pois ambos escolheram pedra";
        }else if(usu==2 && comp==2){
            return "Empate pois ambos escolheram papel";
        }else if(usu==3 && comp==3){
            return "Empate pois ambos escolheram tesoura";
            
        //vitórias do usuário
        }else if(usu==1 && comp==3){
            return  this.nome+" vence da máquina pois pedra quebra tesoura!";
        }else if(usu==2 && comp==1){
            return  this.nome+" vence da máquina pois papel enrola pedra!";
        }else if(usu==3 && comp==2){
            return this.nome+" vence da máquina pois tesoura corta papel!";
            
        //vitórias da máquina
        }else if(comp==1 && usu==3){
            return "Computador vence do(a)"+this.nome+", pois pedra quebra tesoura!";
        }else if(comp==2 && usu==1){
            return "Computador vence do(a)"+this.nome+",pois papel enrola pedra!";
        }else{
            return "Computador vence do(a)"+this.nome+",pois tesoura corta papel!";
        }
    }

    //toString
    @Override
    public String toString() {
        return "\n"+this.nome+" jogou: " + usuario + 
               "\nComputador jogou: " + computador;
    }
}

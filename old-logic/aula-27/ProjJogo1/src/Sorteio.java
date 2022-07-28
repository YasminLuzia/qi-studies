public class Sorteio {
    private byte sorteioMaquina;
    private byte jogadaUsuario;
    
    public Sorteio(byte jogada){
        this.sorteioMaquina=(byte)(Math.random()*5+1);
        this.jogadaUsuario=jogada;
    }

    public byte getSorteioMaquina() {
        return sorteioMaquina;
    }

    public byte getJogadaUsuario() {
        return jogadaUsuario;
    }

    @Override
    public String toString() {
        return  sorteioMaquina + 
               ".\nA sua jogada foi " + jogadaUsuario;
    }
    
    public boolean verificarSeVenceu(){
        if(this.sorteioMaquina==this.jogadaUsuario){
            return true;
        }else{
            return false;
        }
    }
}

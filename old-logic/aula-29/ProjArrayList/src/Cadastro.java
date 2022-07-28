import java.util.ArrayList;
public class Cadastro {
    //Atributo para cadastro
    private ArrayList<Pessoa> lista;
    
    //metodo construtor (obrigatório instanciar a classe do atributo)
    public Cadastro(){
        this.lista=new ArrayList<>();
    }

    //set get
    public ArrayList<Pessoa> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }

    //toString
    @Override
    public String toString() {
        return "Lista de pessoas: " + lista;
    }
    
    //metodo para cadastrar pessoa : MUDA O QUE VAI CADASTRAR
    public void cadastrar(Pessoa p1){
        this.lista.add(p1);
    }
    
    //metodo quantidade : SEMPRE IGUAL
    public int verQuantidade(){
        return this.lista.size();
    }
    
    //excluir cadastro
    public void excluirCadastro(Pessoa p1){
        this.lista.remove(p1);
    }
    
}
import java.util.ArrayList;
public class Cadastro {
    //arraylisto
    private ArrayList<Animal> lista;
    
    //metodos
    //metodo construtor
    public Cadastro(){
        this.lista=new ArrayList<>();
    }
    
    //set get
    public ArrayList<Animal> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Animal> lista) {
        this.lista = lista;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nLista: " + lista;
    }
    
    //metodo para cadastrar
    public void cadastrar(Animal a1){
        this.lista.add(a1);
    }
    
    //metodo para ver a quantidade de animais
    public int verQuantidade(){
        return this.lista.size();
    }
    
    //metodo para excluir cadastro
    public void excluirAnimal(Animal a1){
        this.lista.remove(a1);
    }
    
    //metodo para buscar animal por código (busca especifica)
    public Animal pesquisarPorCodigo(int codigo){
        Animal encontrei=null;
        for(int i=0; i<this.lista.size() && encontrei==null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                encontrei=this.lista.get(i);
            }
        }
        return encontrei;
    }
    
    //metodo para pesquisar animal pelo nome do dono (busca abrangente)
    public ArrayList<Animal> pesquisarPorCpf(String cpf){
        ArrayList<Animal> encontrados=new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getDono().getCpf().equals(cpf)){
                encontrados.add(this.lista.get(i));
            }
        }
        return encontrados;
    }
    
    //metodo para pesquisar animal pela raça
    public ArrayList<Animal> pesquisarPorRaca(String raca){
        ArrayList<Animal> encontrados=new ArrayList<>();
        for(int i=0; i<this.lista.size(); i++){
            if(this.lista.get(i).getRaca().equals(raca)){
                encontrados.add(this.lista.get(i));
            }
        }
        return encontrados;
    }
    
    
    //fim metodos
}
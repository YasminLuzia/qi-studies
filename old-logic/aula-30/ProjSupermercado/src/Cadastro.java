import java.util.ArrayList;
public class Cadastro {
    private ArrayList<Produtos> lista;
    
    //MÉTODOS
    //método construtor
    public Cadastro(){
        this.lista=new ArrayList<>();
    }
    
    //set get
    public ArrayList<Produtos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produtos> lista) {
        this.lista = lista;
    }
    
    //toString
    @Override
    public String toString() {
        return "Cadastro de produtos: " + lista;
    }
    
    //metodo para cadastrar
    public void cadastrar(Produtos p1){
        this.lista.add(p1);
    }
    
    //metodo para ver quantidade
    public int verQuantidade(){
        return this.lista.size();
    }
    
    //metodo para excluir o produto
    public void excluirProduto(Produtos p1){
        this.lista.remove(p1);
    }
    
    //metodo para pesquisar pelo código (pesquisa especifica)
    public Produtos pesquisarPorCodigo(int codigo){
        Produtos encontrei=null;
        for(int i=0; i<this.lista.size() && encontrei==null; i++){
            if(this.lista.get(i).getCodigo()==codigo){
                encontrei=this.lista.get(i);
            }
        }
        return encontrei;
    }
    //metodo para pesquisar produto pelo código
    
    //metodo para pesquisar produtos que vençam em dezembro de 2019
    
    //metodo para pesquisar fornecedor de um produto
    
}
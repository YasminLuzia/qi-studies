public class Animal {
    //valores
    private int codigo;
    private String nome;
    private String especie;
    private String raca;
    private Dono dono;
    
    //metodos
    //metodo construtor
    public Animal(){
        this.dono=new Dono();
    }
    
    //set get
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
    
    //toString
    @Override
    public String toString() {
        return "\nDados do animal: " +
               "\nCódigo: " + codigo + 
               "\nNome: " + nome + 
               "\nEspécie: " + especie + 
               "\nRaça: " + raca + 
               "\nDono: " + dono;
    }
    
    //fim métodos
}
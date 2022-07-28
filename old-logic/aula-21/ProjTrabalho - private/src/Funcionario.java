public class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    private String cargo;
    private double valorHora;
    private double quantidadeHoras;
    private double valorPassagem;
    private double valorRefeicao;
    private double horasExtras50;
    private double horasExtras100;
    private byte dependentes;
    private byte tipoInsalubridade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(double quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public double getValorRefeicao() {
        return valorRefeicao;
    }

    public void setValorRefeicao(double valorRefeicao) {
        this.valorRefeicao = valorRefeicao;
    }

    public double getHorasExtras50() {
        return horasExtras50;
    }

    public void setHorasExtras50(double horasExtras50) {
        this.horasExtras50 = horasExtras50;
    }

    public double getHorasExtras100() {
        return horasExtras100;
    }

    public void setHorasExtras100(double horasExtras100) {
        this.horasExtras100 = horasExtras100;
    }

    public byte getDependentes() {
        return dependentes;
    }

    public void setDependentes(byte dependentes) {
        this.dependentes = dependentes;
    }

    public byte getTipoInsalubridade() {
        return tipoInsalubridade;
    }

    public void setTipoInsalubridade(byte tipoInsalubridade) {
        this.tipoInsalubridade = tipoInsalubridade;
    }
    
    
    //metodos
    public double calcularSalarioBruto(){
        return this.valorHora*this.quantidadeHoras;
    }
    public double calcularValeTransporte(){
        if((this.calcularSalarioBruto()*0.06)>this.valorPassagem){
            return this.valorPassagem;
        }else{
            return this.calcularSalarioBruto()*0.06;
        }
    }
    public double calcularSalarioFamilia(){
        double bruto=calcularSalarioBruto();
        if(bruto<=907.77){
            return this.dependentes*46.54;
        }else if(bruto>=907.78 && bruto<=1364.43){
            return this.dependentes*32.80;
        }else{
            return 0;
        }
    }
    public double calcularInsalubridade(){
        switch(this.tipoInsalubridade){
            case 1:
                return 0;
            case 2:
                return 980 * 0.1;
            case 3:
                return 980 * 0.2;
            default:
                return 980 * 0.4;
        }
    }
    public double calcularInss(){
        double bruto=calcularSalarioBruto();
         if(bruto<=1751.81){
            return bruto * 0.08;
        }else if(bruto>=1751.82 && bruto<=2919.72){
            return bruto * 0.09;
        }else if(bruto>=2919.73 && bruto<=5839.45){
            return bruto * 0.11;
        }else{
            return bruto * 0.27;
        }
    }
    public double calcularValeRefeicao(){
        return (this.valorRefeicao*25)*0.2;
    }
    public double calcularValorExtra50(){
        return (this.valorHora * 1.5) * this.horasExtras50;
    }
    public double calcularValorExtra100(){
        return (this.valorHora * 2) * this.horasExtras100;
    }
    public double calcularTotalHorasExras(){
        return this.calcularValorExtra50()+this.calcularValorExtra100();
    }
    public double calcularSalarioLiquido(){
        return this.calcularSalarioBruto()+this.calcularSalarioFamilia()+this.calcularInsalubridade()+this.calcularTotalHorasExras()-this.calcularValeTransporte()-this.calcularInss()-this.calcularValeRefeicao();
    }
    
    @Override
    public String toString() {
        return "Funcionário:" + 
               "\nNome: " + nome + 
               "\nCPF: " + cpf + 
               "\nCargo: " + cargo + 
               "\nValor Hora: " + valorHora + 
               "\nQuantidade Horas: " + quantidadeHoras + 
               "\nValor Passagem: " + valorPassagem + 
               "\nValor Refeição: " + valorRefeicao + 
               "\nHoras Extras 50%: " + horasExtras50 + 
               "\nHoras Extras 100%: " + horasExtras100 + 
               "\nDependentes: " + dependentes + 
               "\nTipo Insalubridade: " + tipoInsalubridade;
    }
    
}
public class Funcionario {
    //atributos
    public String nome;
    public String cpf;
    public String cargo;
    public double valorHora;
    public double quantidadeHoras;
    public double valorPassagem;
    public double valorRefeicao;
    public double horasExtras50;
    public double horasExtras100;
    public byte dependentes;
    public byte tipoInsalubridade;
    
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
        if(this.calcularSalarioBruto()<=907.77){
            return this.dependentes*46.54;
        }else if(this.calcularSalarioBruto()>=907.78 && this.calcularSalarioBruto()<=1364.43){
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
         if(this.calcularSalarioBruto()<=1751.81){
            return this.calcularSalarioBruto() * 0.08;
        }else if(this.calcularSalarioBruto()>=1751.82 && this.calcularSalarioBruto()<=2919.72){
            return this.calcularSalarioBruto() * 0.09;
        }else if(this.calcularSalarioBruto()>=2919.73 && this.calcularSalarioBruto()<=5839.45){
            return this.calcularSalarioBruto() * 0.11;
        }else{
            return this.calcularSalarioBruto() * 0.27;
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
}
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Yasmin e Rafael
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        
        Cadastro c1=new Cadastro();
        byte menu;
        do{
            System.out.println("Digite a opção desejada: "
                    + "\n1- Cadastrar animal" +
                      "\n2- Ver Animais" +
                      "\n3- Ver Quantidade de animais" +
                      "\n4- Remover Animal" +
                      "\n5- Buscar animal por código" +
                      "\n6- Buscar animal pelo CPF do dono" +
                      "\n7- Buscar animal por raça" +
                      "\n0- Sair");
            menu=ler.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Cadastrando...");
                    //Inicio cadastro
                    //Criando código do animal
                    Animal a1=new Animal();
                    int codigo;
                    if(c1.getLista().isEmpty()){
                        codigo=1;
                    }else{
                        int pegarUltimoCodigo = c1.getLista().get(c1.getLista().size()-1).getCodigo();//pegando list, pegando o tamanho da lista-1 e seu codigo
                        codigo=pegarUltimoCodigo+1;
                    }
                    a1.setCodigo(codigo);
                    //Fim código do animal
                    
                    //Inserindo nome
                    do{
                        System.out.println("Digite o nome do animal: ");
                        ler.nextLine();
                        a1.setNome(ler.nextLine());
                        if(a1.getNome().length()<2){
                            System.out.println("Erro! Nome inválido.");
                        }
                    }while(a1.getNome().length()<2);
                    //Fim nome
                    
                    //Inserindo espécie
                    do{
                        System.out.println("Digite a espécie do animal: ");
                        a1.setEspecie(ler.nextLine());
                        if(a1.getEspecie().length()<2){
                            System.out.println("Erro! Espécie inválida!");
                        }
                    }while(a1.getEspecie().length()<2);
                    //Fim especie
                    
                    //Inserindo Raça
                    do{
                        System.out.println("Digite a raça: ");
                        a1.setRaca(ler.nextLine());
                        if(a1.getRaca().length()<2){
                            System.out.println("Erro! Raça inválida.");
                        }
                    }while(a1.getRaca().length()<2);
                    //Fim Raça
                    
                    //Inserindo dados do Dono
                    Dono d1=new Dono();
                    System.out.println("Cadastrando dono...");
                    //Inserindo nomeDono
                    do{
                        System.out.println("Digite o nome do dono: ");
                        d1.setNome(ler.nextLine());
                        if(d1.getNome().length()<2){
                            System.out.println("Erro! Nome inválido.");
                        }
                    }while(d1.getNome().length()<2);
                    //Fim nomeDono
                    //Inserindo RG
                    do{
                        System.out.println("Digite o RG: ");
                        d1.setRg(ler.nextLine());
                        if(d1.getRg().length()!=6 && d1.getRg().length()!=10){
                            System.out.println("Erro! RG inválido.");
                        }
                    }while(d1.getRg().length()!=6 && d1.getRg().length()!=10);
                    //Fim RG
                    //Inserindo CPF
                    do{
                        System.out.println("Digite o CPF: ");
                        d1.setCpf(ler.nextLine());
                        if(d1.getCpf().length()!=11){
                            System.out.println("Erro! CPF inválido.");
                        }
                    }while(d1.getCpf().length()!=11);
                    //Fim CPF
                    
                    //Inserindo Endereco
                    Endereco e1=new Endereco();
                    System.out.println("Cadastrando endereço do dono...");
                    //Inserindo rua
                    do{
                        System.out.println("Digite a rua: ");
                        e1.setRua(ler.nextLine());
                        if(e1.getRua().length()<2){
                            System.out.println("Erro! Rua inválida.");
                        }
                    }while(e1.getRua().length()<2);
                    //Fim rua
                    //Inserindo cidade
                    do{
                        System.out.println("Digite a cidade: ");
                        e1.setCidade(ler.nextLine());
                        if(e1.getCidade().length()<2){
                            System.out.println("Erro! Cidade inválida.");
                        }
                    }while(e1.getCidade().length()<2);
                    //Fim cidade
                    //Inserindo estado
                    do{
                        System.out.println("Digite o estado: ");
                        e1.setEstado(ler.nextLine());
                        if(e1.getEstado().length()<2){
                            System.out.println("Erro! Estado inválido.");
                        }
                    }while(e1.getEstado().length()<2);
                    //Fim estado
                    
                    //Inicio numero
                    do{
                        System.out.println("Digite o número: ");
                    
                    e1.setNumero(ler.nextInt());
                    if(e1.getNumero()<=0){
                        System.out.println("Número inválido");
                    }
                    }while(e1.getNumero()<=0);
                    //fim numero
                    
                    //Inserindo complemento
                    System.out.println("Digite o complemento: ");
                    ler.nextLine();
                    e1.setComplemento(ler.nextLine());
                    if(e1.getComplemento().isEmpty()){
                        e1.setComplemento("Nenhum");
                    }
                    //Fim Complemento
            

                    //FIM ENDEREÇO
                    
                    //Inicio data
                    Data d2=new Data();
                    System.out.println("Cadastrando data de nascimento do dono...");
                    //Inserindo dia
                    System.out.println("Digite o dia: ");         
                    d2.setDia(ler.nextByte());
                    //Fim dia
                    //Inserindo mes
                    System.out.println("Digite o mês: ");
                    d2.setMes(ler.nextByte());       
                    //Fim mes
                    //Inserindo ano
                    System.out.println("Digite o ano: ");
                    d2.setAno(ler.nextInt());
                    //Fim ano
                    //Fim Data
                    //Fim Dono
                    //Fim Cadastro
                    
                    //Inserindo classes umas nas outras
                    d1.setDataNascimento(d2);
                    d1.setEndereco(e1);
                    a1.setDono(d1);
                    c1.cadastrar(a1);
                    
                    break;
                case 2:
                    System.out.println("Visualizando...");
                    //Verificando se ha cadastros
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há cadastros.");
                    }else{
                        System.out.println(c1);//Mostrando lista
                    }
                    break;
                case 3:
                    System.out.println("Visualizando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há cadastros.");
                    }else{
                        System.out.println("Total de animais cadastrados: ");
                        System.out.println(c1.verQuantidade());
                    }
                    break;
                case 4:
                    System.out.println("Excluindo...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há cadastros.");
                    }else{
                        System.out.println("Digite o código do animal: ");
                        codigo = ler.nextInt();
                        Animal achei = c1.pesquisarPorCodigo(codigo);
                        if(achei==null){
                            System.out.println("Este animal não foi registrado.");
                        }else{
                            c1.excluirAnimal(achei);
                            System.out.println("Animal excluido com sucesso!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há cadastros.");
                    }else{
                        System.out.println("Digite o código do animal");
                        codigo = ler.nextInt();
                       Animal achei = c1.pesquisarPorCodigo(codigo); 
                    
                    if(achei == null){
                        System.out.println("Não há animais com este código");
                    }else{
                        System.out.println(achei);
                    }
                    }               
                    break;
                case 6:
                    System.out.println("Buscando o CPF...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há cadastros.");
                    }else{
                        String cpf;
                        System.out.println("Digite o CPF do dono: ");
                        cpf = ler.next();
                        ArrayList<Animal> achados = c1.pesquisarPorCpf(cpf);
                        if(achados.isEmpty()){
                            System.out.println("Não há animais com este dono");
                        }else{
                            System.out.println(achados);
                        }
                    }
                    
                    break;
                case 7:
                    System.out.println("Buscando animal...");
                     if(c1.getLista().isEmpty()){
                        System.out.println("Não há cadastros.");
                     }else{
                        String raca;
                        System.out.println("Digite a raça do animal: ");
                        ler.nextLine();
                        raca = ler.nextLine();
                        ArrayList<Animal> achados = c1.pesquisarPorRaca(raca);
                        if(c1.getLista().isEmpty()){
                            System.out.println("Não há animais achados.");
                        }
                    else{
                        System.out.println(achados);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Erro! Opção inválida.");
            }
        }while(menu!=0);
    }
    
}
import java.util.ArrayList;
import javax.swing.JOptionPane;
//Import para limpar tela:
import java.awt.AWTException;
import java.awt.Robot;
/**
 *
 * @author Yasmin e Rafael
 */
public class Main {
    public static void main(String[] args) {
        
        Cadastro c1 = new Cadastro();
        byte menu;
        do{
            menu=Byte.parseByte(JOptionPane.showInputDialog("Digite a opção desejada: " + 
                      "\n1 - Cadastrar animal" +
                      "\n2 - Ver Animais" +
                      "\n3 - Ver Quantidade de animais" +
                      "\n4 - Remover Animal" +
                      "\n5 - Buscar animal por código" +
                      "\n6 - Buscar animal pelo CPF do dono" +
                      "\n7 - Buscar animal por raça" +
                      "\n8 - Editar dados" +
                      "\n9 - Buscar donos que nasceram no mês específicado" +
                      "\n10- Buscar animais do Rio Grande do Sul" +
                      "\n0- Sair"));
            switch(menu){
                case 1:
                    limparTela();
                    JOptionPane.showMessageDialog(null, "Cadastrando...");
                    //Inicio cadastro
                    //Criando código do animal
                    JOptionPane.showMessageDialog(null,"Gerando um código...");
                    Animal a1 = new Animal();
                    int codigo;
                    if(c1.getLista().isEmpty()){
                        codigo =1;
                    }else{
                        int pegarUltimoCodigo = c1.getLista().get(c1.getLista().size()-1).getCodigo();//pegando list, pegando o tamanho da lista-1 e seu codigo
                        codigo=pegarUltimoCodigo+1;
                    }
                    a1.setCodigo(codigo);
                    JOptionPane.showMessageDialog(null,"Código registrado!");
                    //Fim código do animal
                    
                    //Inserindo nome
                    do{                        
                        a1.setNome(JOptionPane.showInputDialog("Digite o nome do animal: "));
                        if(a1.getNome().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Nome inválido.");
                        }
                    }while(a1.getNome().length()<2);
                    //Fim nome
                    
                    //Inserindo espécie
                    do{
                        a1.setEspecie(JOptionPane.showInputDialog("Digite a espécie do animal: "));
                        if(a1.getEspecie().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Espécie inválida!");
                        }
                    }while(a1.getEspecie().length()<2);
                    //Fim especie
                    
                    //Inserindo Raça
                    do{
                        a1.setRaca(JOptionPane.showInputDialog("Digite a raça: "));
                        if(a1.getRaca().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Raça inválida.");
                        }
                    }while(a1.getRaca().length()<2);
                    //Fim Raça
                    
                    //Inserindo dados do Dono
                    limparTela();
                    Dono d1 = new Dono();
                    JOptionPane.showMessageDialog(null,"Cadastrando dono...");
                    //Inserindo nomeDono
                    do{
                        d1.setNome(JOptionPane.showInputDialog("Digite o nome do dono: "));
                        if(d1.getNome().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Nome inválido.");
                        }
                    }while(d1.getNome().length()<2);
                    //Fim nomeDono
                    //Inserindo RG
                    do{
                        d1.setRg(JOptionPane.showInputDialog("Digite o RG: "));
                        if(d1.getRg().length()!=6 && d1.getRg().length()!=10){
                            JOptionPane.showMessageDialog(null,"Erro! RG inválido.");
                        }
                    }while(d1.getRg().length()!=6 && d1.getRg().length()!=10);
                    //Fim RG
                    //Inserindo CPF
                    do{
                        d1.setCpf(JOptionPane.showInputDialog("Digite o CPF: "));
                        if(d1.getCpf().length()!=11){
                            JOptionPane.showMessageDialog(null,"Erro! CPF inválido.");
                        }
                    }while(d1.getCpf().length()!=11);
                    //Fim CPF
                    
                    //Inserindo Endereco
                    limparTela();
                    Endereco e1 = new Endereco();
                    JOptionPane.showMessageDialog(null,"Cadastrando endereço do dono...");
                    //Inserindo rua
                    do{
                        e1.setRua(JOptionPane.showInputDialog("Digite a rua: "));
                        if(e1.getRua().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Rua inválida.");
                        }
                    }while(e1.getRua().length()<2);
                    //Fim rua
                    //Inserindo cidade
                    do{
                        e1.setCidade(JOptionPane.showInputDialog("Digite a cidade: "));
                        if(e1.getCidade().length()<2){
                            JOptionPane.showMessageDialog(null,"Erro! Cidade inválida.");
                        }
                    }while(e1.getCidade().length()<2);
                    //Fim cidade
                    //Inserindo estado
                    do{
                        e1.setEstado(JOptionPane.showInputDialog("Digite a sigla do estado: "));
                        if(e1.getEstado().length()!=2){
                            JOptionPane.showMessageDialog(null,"Erro! Insira a sigla do estado.");
                        }
                    }while(e1.getEstado().length()!=2);
                    //Fim estado
                    
                    //Inicio numero
                    do{
                        e1.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
                        if(e1.getNumero()<=0){
                            JOptionPane.showMessageDialog(null,"Erro! Número inválido.");
                        }
                    }while(e1.getNumero()<=0);
                    //fim numero
                    
                    //Inserindo complemento
                    e1.setComplemento(JOptionPane.showInputDialog("Digite o complemento: "));
                    if(e1.getComplemento().isEmpty()){
                        e1.setComplemento("Nenhum");
                    }
                    //Fim Complemento
            

                    //FIM ENDEREÇO
                    
                    //Inicio data
                    limparTela();
                    Data d2 = new Data();
                    JOptionPane.showMessageDialog(null,"Cadastrando data de nascimento do dono...");
                    //Inserindo dia
                    d2.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o dia: ")));
                    //Fim dia
                    //Inserindo mes
                    d2.setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o mês: ")));       
                    //Fim mes
                    //Inserindo ano
                    d2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: ")));
                    //Fim ano
                    //Fim Data
                    //Fim Dono
                    //Fim Cadastro
                    
                    //Inserindo classes umas nas outras
                    d1.setDataNascimento(d2);
                    d1.setEndereco(e1);
                    a1.setDono(d1);
                    c1.cadastrar(a1);
                    
                    JOptionPane.showMessageDialog(null,"Ficha do animal cadastrada com sucesso!");
                    
                    break;
                case 2:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Visualizando...");
                    //Verificando se ha cadastros
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        JOptionPane.showMessageDialog(null,c1);//Mostrando lista
                    }
                    break;
                case 3:
                    limparTela();
                    //Para ver o total de cadastros
                    JOptionPane.showMessageDialog(null,"Visualizando...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        JOptionPane.showMessageDialog(null,"Total de animais cadastrados: "+ c1.verQuantidade());
                    }
                    break;
                case 4:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Excluindo...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        do{
                            //pedindo código do animal
                            codigo = Byte.parseByte(JOptionPane.showInputDialog("Digite o código do animal: "));
                            if(codigo<1){
                                JOptionPane.showMessageDialog(null,"Erro! Código inválido.");
                            }
                        }while(codigo<1);
                        Animal achei = c1.pesquisarPorCodigo(codigo);
                        if(achei == null){
                            JOptionPane.showMessageDialog(null,"Este animal não foi registrado.");
                        }else{
                            //confirmação para excluir
                            byte op3 = Byte.parseByte(JOptionPane.showInputDialog("Tem certeza que deseja remover o animal?" +
                                    "\n1 - SIM"+
                                    "\n2 - NÃO"));
                            switch(op3){
                                case 1:
                                    c1.excluirAnimal(achei);
                                    JOptionPane.showMessageDialog(null,"Animal excluído com sucesso!");
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null,"Operação cancelada.");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null,"Erro! Opção inválida.");
                            }
                            
                        }
                    }
                    break;
                case 5:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        do{
                            //pedindo codigo do animal
                            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do animal"));
                            if(codigo<1){
                                JOptionPane.showMessageDialog(null,"Erro! Código inválido.");
                            }
                        }while(codigo<1);
                        Animal achei = c1.pesquisarPorCodigo(codigo); 
                        if(achei == null){
                            JOptionPane.showMessageDialog(null,"Não há animais com este código");
                        }else{
                            JOptionPane.showMessageDialog(null,achei);
                        }
                    }               
                    break;
                case 6:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Buscando o CPF...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        String cpf;
                        do{
                            cpf = JOptionPane.showInputDialog("Digite o CPF do dono: ");
                            if(cpf.length()!=11){
                                JOptionPane.showMessageDialog(null,"Erro! CPF inválido.");
                            }
                        }while(cpf.length()!=11);
                        ArrayList<Animal> achados = c1.pesquisarPorCpf(cpf);
                        if(achados.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Não há animais com este dono");
                        }else{
                            JOptionPane.showMessageDialog(null,achados);
                        }
                    }
                    
                    break;
                case 7:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Buscando animal...");
                     if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                     }else{
                        String raca;
                        do{
                            raca = JOptionPane.showInputDialog("Digite a raça do animal: ");
                            if(raca.length()<2){
                                JOptionPane.showMessageDialog(null,"Erro! Raça inválida.");
                            }
                        }while(raca.length()<2);
                        ArrayList<Animal> achados = c1.pesquisarPorRaca(raca);
                        if(achados.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Não há animais achados.");
                        }
                    else{
                        JOptionPane.showMessageDialog(null,achados);
                        }
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"Editando...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastro para editar.");
                    }else{ //1º else
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do animal que deseja editar:"));
                        int indiceEncontrado = c1.pesquisarIndicePeloCodigo(codigo);
                        if(indiceEncontrado==-1){
                            JOptionPane.showMessageDialog(null,"Este código não existe em nossos cadastros");
                        }else{//2º else
                            //EDITANDO:
                            byte op2 = Byte.parseByte(JOptionPane.showInputDialog("O que deseja editar do animal: "
                                    +c1.getLista().get(indiceEncontrado).getNome()+
                                    "\n1 - Editar nome do animal"+
                                    "\n2 - Editar nome do dono"+
                                    "\n3 - Cancelar Edição"));
                            switch(op2){
                                case 1:
                                    c1.getLista().get(indiceEncontrado).setNome(JOptionPane.showInputDialog("Digite o novo nome para o animal: "));
                                    JOptionPane.showMessageDialog(null,"Nome editado com SUCESSO!");
                                    break;
                                case 2:
                                    c1.getLista().get(indiceEncontrado).getDono().setNome(JOptionPane.showInputDialog("Digite o novo nome para o dono:"));
                                    JOptionPane.showMessageDialog(null,"Nome editado com SUCESSO!");
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null,"Edição cancelada.");
                                default:
                                    JOptionPane.showMessageDialog(null,"Erro, esta opção não existe.");
                            }//fim do switch do editar                            
                        }//fim do 2º else do case 3
                    }//fim do 1º else
                    break;
                case 9:
                    limparTela();
                    //Para inserir o mes de nascimento do dono
                    JOptionPane.showMessageDialog(null,"Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        byte mes;
                        do{
                            mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mês de nascimento desejado: "));
                            if(mes<1 || mes>12){
                                JOptionPane.showMessageDialog(null, "Erro! Mês inválido.");
                            }else if(c1.pesquisarPorMes(mes).isEmpty()){
                                JOptionPane.showMessageDialog(null,"Não há cadastros neste mês.");
                            }else{
                                JOptionPane.showMessageDialog(null, c1.pesquisarPorMes(mes));
                            }
                        }while(mes<1 || mes>12);
                    }
                    break;
                case 10:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Não há cadastros.");
                    }else{
                        JOptionPane.showMessageDialog(null, c1.pesquisarRS());
                    }
                    break;
                case 0:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Volte sempre!");
                    break;
                default:
                    limparTela();
                    JOptionPane.showMessageDialog(null,"Erro! Opção inválida.");
            }
        }while(menu!=0);
    }
       //Método para limpar tela:
    //Limpar tela:
    public static void limparTela() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17);
            pressbot.keyPress(76);
            pressbot.keyRelease(17);
            pressbot.keyRelease(76);
        } catch (AWTException awte) {
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }//fim do limparTela
}
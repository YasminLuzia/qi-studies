public class Valida {
   public boolean validaCpf(String cpf){
       if(cpf.length()!=11){
           return false;
       }else{
           return true;
       }
   }
   public boolean validaData(byte dia, byte mes,int ano){
       if((dia<1||dia>31)||
          (mes<1||mes>12)||
          (ano<0)||
          (dia>30 && (mes==2 || mes==4 || mes==6 || mes==9 || mes==11))||
          (dia==29 && mes==2 && ano%4!=0)||
          (mes==2 && dia>29)){
           return false;
       }else{
           return true;
       }
   }
}
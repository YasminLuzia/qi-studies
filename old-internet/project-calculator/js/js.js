/*Script da calculadora*/
/*Função extrairRaiz*/
function extrairRaiz(){
  var numero = calc.tela.value;
  var resultado = Math.sqrt(numero);
  calc.tela.value = resultado;
}

function apagarUm(){
  var numero = calc.tela.value;
  calc.tela.value = numero.substring(0, numero.length-1);
}

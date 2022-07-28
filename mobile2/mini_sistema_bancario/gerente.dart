import 'endereco.dart';
import 'funcionario.dart';

class Gerente extends Funcionario {
  int _ramal;

  int get ramal => this._ramal;
  //Método construtor
  Gerente(
    this._ramal,
    int hMatricula,
    double hSalario,
    String hNome,
    String hRG,
    String hCPF,
    String hdataDeNascimento,
    String hTelefone,
    Endereco hEndereco, [
    String? hEmail,
  ]) : super(
          hMatricula,
          hSalario,
          hNome,
          hRG,
          hCPF,
          hdataDeNascimento,
          hTelefone,
          hEndereco,
          hEmail,
        );

  set ramal(int? ramal) {
    this.ramal = ramal;
  }

  //@override
  //String toString() {
  //return "Dados do(a) gerente: ${this._nome}\nMatrícula: ${this._matricula}\nEmail: ${this._email}\nEmail: ${this._email}\nTelefone: ${this._telefone}\nRamal: ${this._ramal}";
//}
}

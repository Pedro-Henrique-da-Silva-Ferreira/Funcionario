import java.util.ArrayList;
import java.util.List;

public class Aumento {
    private Double salario;
    private List<Funcionario> funcionarios =  new ArrayList<>();

    public void adiciona( String nome, Double salario){
        Funcionario func = new Funcionario(nome, salario, funcionarios.size() + 1);
         funcionarios.add(func);
    }

    public Double contaAumento(double porcentagem){

      return porcentagem = salario * porcentagem /100 + porcentagem;
    }

    public String mostra(){
        String a = "";
        for (Funcionario f :funcionarios) {
             a = f.toString();
        }
        return a;
    }
}

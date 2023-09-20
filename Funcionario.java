public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;


    public Funcionario() {

    }

    public Funcionario( String nome, Double salario, Integer id) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }


    public String toString(){
        return "Nome:" + getNome() + " Id:" + getId() + " Salario:" + getSalario();
    }
}

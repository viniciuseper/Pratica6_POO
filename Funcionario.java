package br.com.pratica6_2;

public class Funcionario extends Pessoa {

    private String departamento;
    private String dtEntrada;
    private String RG;
    private double salario;
    private boolean status;

    public Funcionario(String nome, String email, String telefone, String departamento, String dtEntrada, String RG, double salario, boolean status) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.dtEntrada = dtEntrada;
        this.RG = RG;
        this.salario = salario;
        this.status = status;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(String dataEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void bonificar(double bonus) {
        this.salario = this.salario + bonus;
    }

    public void demitir() {
        this.status = false;
    }

    public String mostrarDados() {
        return getNome()+ "\n" + getEmail()+"\n"+ getTelefone() + "\n" + getDepartamento()+"\n"+ getRG()+ "\n"+ getSalario()+"\n"+ getDtEntrada() + "\n" + isStatus();
    }


}
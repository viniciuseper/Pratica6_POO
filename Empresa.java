package br.com.pratica6_2;

public class Empresa {

    private String nomeEmpresa, cnpj;
    private int qtdefunc;
    Funcionario[] funcionarios;
    private static int count=0;

    public Empresa(String nomeEmpresa, String cnpj, int qtde_de_funcionario) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        if (qtdefunc<=100)
        {
            this.qtdefunc = qtdefunc;
            funcionarios = new Funcionario[qtdefunc];
        }
        else
        {
            this.qtdefunc = 100;
            funcionarios = new Funcionario[100];
        }

    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getqtdefunc() {
        return qtdefunc;
    }

    public void setqtdefunc(int qtdefunc) {
        this.qtdefunc = qtdefunc;
    }

    public void insereFuncionario(Funcionario func) {
        funcionarios[count]=func;
        count++;
    }
}
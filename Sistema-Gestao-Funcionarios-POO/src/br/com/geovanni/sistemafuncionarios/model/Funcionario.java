package br.com.geovanni.sistemafuncionarios.model;

public class Funcionario {

	
	private String nome;
	private int idade;
	private String cpf;
	private String cargo;
	private double salario;
	
	
	public Funcionario() {
			
	}

	
	public Funcionario(String nome, int idade, String cpf, String cargo, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	
	
	public String getNome() {
		return nome;		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade >= 0) {			
			this.idade = idade;
		}
		
	}
	
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
		
	}
	
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
	
	
}

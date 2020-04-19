package entities;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta() {
	
	}
	
	// CONSTRUTORES PARA SOBRECARGA --------------------------
	public Conta(int numConta, String nomeTitular, double depositoInicial) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposita(depositoInicial);
	}
	public Conta(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}
	// CONSTRUTORES PARA SOBRECARGA ------------------------------
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valorSacado) {
		saldo -= valorSacado + 5;
	}
	
	public void deposita(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	
	
	
}

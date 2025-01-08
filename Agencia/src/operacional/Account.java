package operacional;

public class Account {
	int numero;
	String nome;
	double saldo;
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public Account(int numero, String nome, double depositoIni) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoIni);
	}
	public Account(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	public void deposito(double deposito) {
		saldo += deposito;
	}
	public void saque(double saque) {
		int tarifa = 5;
		saldo -= saque + tarifa;
	}
	public String toString() {
		return "Conta numero "
				+ numero
				+ ", nome do titular "
				+ nome
				+ ", seu saldo é de R$"
				+ String.format("%.2f", saldo);
		
	}
}

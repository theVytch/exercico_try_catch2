package entidade;

import entidade.exceptions.DomainExceptions;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque) throws DomainExceptions{
        if(limiteDeSaque > saldo){
            throw new DomainExceptions("Limite de saque nao pode ser maior que o saldo da conta");
        }
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposito(Double montante){
        this.saldo += montante;
    }

    public void saque(Double montante) throws DomainExceptions {
        if (montante > limiteDeSaque) {
            throw new DomainExceptions("Limite de saque indisponivel");
        }
        this.saldo -= montante;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + String.format("%.2f", saldo) +
                ", limiteDeSaque=" + limiteDeSaque +
                '}';
    }
}

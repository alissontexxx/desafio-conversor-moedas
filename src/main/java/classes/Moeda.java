package classes;

import java.util.List;

public class Moeda {

    List<String> conversion_rates;
    private String nome;

    public Moeda(List<String> conversion_rates, String nome) {
        this.conversion_rates = conversion_rates;
        this.nome = nome;
    }

    public List<String> getConversion_rates() {
        return this.conversion_rates;
    }

    public void setConversion_rates(List<String> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                " conversion_rates='" + getConversion_rates() + "'" +
                ", nome='" + getNome() + "'" +
                "}";
    }

}

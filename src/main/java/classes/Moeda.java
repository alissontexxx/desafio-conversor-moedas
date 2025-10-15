package classes;

public class Moeda {

    private String result;

    public Moeda(String result) {
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "{" +
                " result='" + getResult() + "'" +
                "}";
    }

}

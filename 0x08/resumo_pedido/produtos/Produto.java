package produtos;

public abstract class Produto{
    private String titulo;
    private int ano;
    private String pais;
    private double precoBruto;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        super();
        this.titulo = titulo;
        this.ano = ano;
        this.pais = pais;
       setPrecoBruto(precoBruto);
    }


    public abstract double obterPrecoLiquido();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPrecoBruto() {
        return precoBruto;
    }

    public void setPrecoBruto(double precoBruto) {
        this.precoBruto = precoBruto;
    }
}
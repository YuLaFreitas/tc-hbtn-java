import java.util.Objects;

public class Telefone{
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
            this.codigoArea = codigoArea;
            this.numero = numero;
    }

    @Override
    public String toString(){
        return String.format("(%s) %s", getCodigoArea(), getNumero());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(codigoArea, telefone.codigoArea) && Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((codigoArea == null) ? 0 : codigoArea.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    /*@Override
    public int hashCode() {
        final int prime = 31;
        int result = 7;
        result = prime * result + ((getCodigoArea() == null) ? 0 : getNumero().hashCode());
        result = prime * result + ((getCodigoArea() == null) ? 0 : getNumero().hashCode());
        return result;
    }*/

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }
}

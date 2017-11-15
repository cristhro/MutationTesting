public class Datos {
    private int pos;
    private int valor;

    public Datos(int pos, int valor) {
        this.pos = pos;
        this.valor = valor;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "pos=" + pos +
                ", valor=" + valor +
                '}';
    }
}

package es.netmind.simuladorcoches.modelos.ruedas;

public class Rueda {

    private long diametro;

    public long getDiametro() {
        return diametro;
    }

    public void setDiametro(long diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro=" + diametro +
                '}';
    }

    public Rueda(long diametro) {
        this.diametro = diametro;
    }
}

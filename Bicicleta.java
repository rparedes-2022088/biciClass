public class Bicicleta {

    private String marca;
    private int noRin;
    private String color;
    private String tipoBicicleta;
    private int noDeVelocidades;
    private String tipoFrenos;

    public Bicicleta(String marca, int noRin, String color, String tipoBicicleta, int noDeVelocidades, String tipoFrenos) {
        this.marca = marca;
        this.noRin = noRin;
        this.color = color;
        this.tipoBicicleta = tipoBicicleta;
        this.noDeVelocidades = noDeVelocidades;
        this.tipoFrenos = tipoFrenos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNoRin() {
        return noRin;
    }

    public void setNoRin(int noRin) {
        this.noRin = noRin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public int getNoDeVelocidades() {
        return noDeVelocidades;
    }

    public void setNoDeVelocidades(int noDeVelocidades) {
        this.noDeVelocidades = noDeVelocidades;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }
}
public class Smartphone {
    private String marca;
    private String modelo;
    private double tamanyoPantalla;
    private int capacidadBateria;
    private boolean encendido;
    private int nivelBateria;
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, double tamanyoPantalla, int capacidadBateria, boolean encendido, int nivelBateria, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanyoPantalla = tamanyoPantalla;
        this.capacidadBateria = capacidadBateria;
        this.encendido = encendido;
        this.nivelBateria = nivelBateria;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Smartphone() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanyoPantalla() {
        return tamanyoPantalla;
    }

    public void setTamanyoPantalla(double tamanyoPantalla) {
        this.tamanyoPantalla = tamanyoPantalla;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void encender() {
        boolean encendido = true;
    }

    public void apagar(){
        boolean encendido = false;
    }

    public void usar(int minutos){
        nivelBateria = nivelBateria - ((minutos*1)/5);
    }

    public void cargar (int minutos){
        nivelBateria = nivelBateria + ((minutos*1)/2);
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " -Encendido: " + this.encendido + " batería restante: " + this.nivelBateria;
    }
}

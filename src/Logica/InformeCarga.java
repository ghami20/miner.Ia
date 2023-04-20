package Logica;

public class InformeCarga {
    private Material material;
    private Double cantidad;

    @Override
    public String toString() {
        return "Informe de Carga " + material +
                ", cantidad= " + cantidad ;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public InformeCarga(Material material, Double cantidad) {
        this.material = material;
        this.cantidad = cantidad;
    }
}

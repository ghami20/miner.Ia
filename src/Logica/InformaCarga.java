package Logica;

public class InformaCarga {
    private Material material;
    private Double cantidad;

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

    public InformaCarga(Material material, Double cantidad) {
        this.material = material;
        this.cantidad = cantidad;
    }
}

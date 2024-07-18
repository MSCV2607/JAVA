import java.util.List;

public class Auto {
    private long id;
    private String marca;
    private String modelo;

    //Objeto propietario
    //1 a 1
    //private Propietario propietario;

    //Si yo quiero que un auto tenga muchos propietarios 1 a n
    private List<Propietario> listaPropietario;

    public Auto() {
    }

    public Auto(long id, String marca, String modelo, List<Propietario> listaPropietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietario = listaPropietario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<Propietario> getListaPropietario() {
        return listaPropietario;
    }

    public void setListaPropietario(List<Propietario> listaPropietario) {
        this.listaPropietario = listaPropietario;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", listaPropietario=" + listaPropietario +
                '}';
    }
}

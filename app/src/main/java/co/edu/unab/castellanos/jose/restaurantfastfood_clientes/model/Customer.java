package co.edu.unab.castellanos.jose.restaurantfastfood_clientes.model;

public class Customer {

    private int id;
    private String nombre, correo, password;

    public Customer(int id, String nombre, String correo, String password) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
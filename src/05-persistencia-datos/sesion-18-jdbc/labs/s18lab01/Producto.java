package s18lab01;

public class Producto {
    private int id;
    private String nombre;
    private int stock;

    public Producto(String nombre, int stock) {
        setNombre(nombre);
        setStock(stock);
    }

    public Producto(int id, String nombre, int stock) {
        this.id = id;
        setNombre(nombre);
        setStock(stock);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty() || nombre.length() > 100) {
            throw new IllegalArgumentException("El nombre es obligatorio y debe tener máximo 100 caracteres.");
        }
        this.nombre = nombre.trim();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }
}
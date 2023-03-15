package es.ieslavereda;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(String nombre,int edad){
        if (nombre.length()>=3)
            this.nombre = nombre;
        else
            throw new RuntimeException("Tiene que tener 3 caracteres");
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        if (nombre.length()>=3)
            this.nombre = nombre;
        else
            throw new RuntimeException("Tiene que tener 3 caracteres");
    }

    public void setEdad(int edad) throws Exception{
        if (edad>0)
            this.edad = edad;
        else
            throw new RuntimeException("No puede tener edad negativa");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

}

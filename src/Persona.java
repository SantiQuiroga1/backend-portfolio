public abstract class Persona{
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String email; //atributos basicos que van a compartir las clases hijas

    public Persona(int id, String nombre,String apellido, String dni, String email){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre + " | DNI: " + dni);
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }
} 
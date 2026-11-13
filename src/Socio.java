import java.time.LocalDate;

public class Socio extends Persona{
    private LocalDate FechaVencimientoMembresia;
    private boolean activo;
    public Socio(int id, String nombre,String apellido, String dni, String email,LocalDate fechaVencimientoMembrecia){
        super(id, nombre, apellido, dni, email);
        this.FechaVencimientoMembresia = fechaVencimientoMembrecia;
        this.activo = true;
    }
    public boolean isActivo(){
        return activo;
    }
    public LocalDate getFechaVencimientoMembresia() {
        return FechaVencimientoMembresia;
    }
    public void setFechaVencimientoMembresia(LocalDate fechaVencimientoMembresia) {
        FechaVencimientoMembresia = fechaVencimientoMembresia;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
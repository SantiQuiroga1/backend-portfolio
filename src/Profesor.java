public class Profesor extends Persona {
    private String especialidad;
    private String turno;

    public Profesor(String turno, int id, String nombre, String apellido, String dni, String email,String especialidad) {
        super(id, nombre, apellido, dni, email);
        this.especialidad = especialidad;
        this.turno = turno;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTurno() {
        return turno;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}

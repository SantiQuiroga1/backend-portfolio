import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gimnasio {
    private List<Socio> socios;

    // Constructor que inicializa la lista con datos de prueba
    public Gimnasio() {
        this.socios = new ArrayList<>();
        cargarDatosPrueba();
    }

    private void cargarDatosPrueba() {
        socios.add(new Socio(1, "Carlos", "Gomez", "35123456", "carlos@mail.com", LocalDate.of(2026, 12, 1)));
        socios.add(new Socio(2, "Lucia", "Perez", "38987654", "lucia@mail.com", LocalDate.of(2025, 1, 15)));
        socios.add(new Socio(3, "Marcos", "Benitez", "40111222", "marcos@mail.com", LocalDate.of(2026, 11, 30)));
    }

    // Método funcional usando Streams para filtrar socios activos
    public List<Socio> obtenerSociosActivos() {
        return socios.stream()
                .filter(Socio::isActivo) // Method reference (otra forma elegante de lambda)
                .collect(Collectors.toList());
    }

    // Método para agregar un socio nuevo al sistema
    public void registrarSocio(Socio nuevoSocio) {
        socios.add(nuevoSocio);
        System.out.println("Socio " + nuevoSocio.getNombre() + " registrado con éxito.");
    }
}
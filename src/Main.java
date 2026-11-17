public class Main {
    public static void main(String[] args) {
        // Instanciamos el gimnasio (nuestro sistema central)
        Gimnasio miGimnasio = new Gimnasio();

        System.out.println("--- SOCIOS ACTIVOS EN EL SISTEMA ---");
        
        // Pedimos los activos al servicio y los recorremos
        miGimnasio.obtenerSociosActivos().forEach(s -> 
            System.out.println(s.getNombre() + " " + s.getApellido() + " - Activo")
        );
    }
}
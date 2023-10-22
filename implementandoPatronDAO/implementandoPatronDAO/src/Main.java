import com.backend.dao.EstudianteDAOH2;
import com.backend.entidades.Estudiante;
import com.backend.servicios.EstudianteService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setId(1L);
        estudiante.setNombre("Jaimito");
        estudiante.setApellido("Perez");

        EstudianteService estudianteService = new EstudianteService();
          // Seteamos una estrategia de persistencia, es decir un DAO
        estudianteService.setEstudianteIDao(new EstudianteDAOH2());

        estudianteService.guardarEstudiante(estudiante);


        estudianteService.buscarEstudiante(1L);
    }
}
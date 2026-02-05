package fundamentos.tiposdedatos;

public class Estudiante {
    public String nombre;
    public String correo;
    public String curso;
    public int edad;
    public float promCalificacion;

    public Estudiante(String nombre, String correo, String curso, int edad, float promCalificacion){
        this.nombre = nombre;
        this.correo = correo;
        this.curso = curso;
        this.edad = edad;
        this.promCalificacion = promCalificacion;
    }

    public void mostrarInfo(){
        System.out.println(
                "\n\n---Datos del estudiante---" +
                "\nNombre: " + nombre +
                "\nCorreo: " + correo +
                "\nCurso: " + curso +
                "\nEdad: " + edad +
                "\nPromedio calificaciones: " + promCalificacion
        );
    }
}

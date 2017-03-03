package WalterOseguera_Lab7;

public class Empleados extends Personas{
    private String Seccion, Estado;
    private int Hora, Minutos;
    private int Sueldo;

    public Empleados() {
        super();
    }

    public Empleados(String Seccion, String Estado, int Hora, int Minutos, int Sueldo, String Nombre, int ID, int Edad, String Nacionalidad, String LugarNacimiento, java.awt.Color Color) {
        super(Nombre, ID, Edad, Nacionalidad, LugarNacimiento, Color);
        this.Seccion = Seccion;
        this.Estado = Estado;
        this.Hora = Hora;
        this.Minutos = Minutos;
        this.Sueldo = Sueldo;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
} // Fin class Empleados
package WalterOseguera_Lab7;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Personas {
    private String Nombre;
    private long ID;
    private int Edad;
    private String Nacionalidad;
    private String LugarNacimiento;
    private Color Color;

    public Personas() {
    }

    public Personas(String Nombre, long ID, int Edad, String Nacionalidad, String LugarNacimiento, Color Color) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.LugarNacimiento = LugarNacimiento;
        this.Color = Color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        if (Edad > 0) {
            this.Edad = Edad;
        } else {
            JOptionPane.showMessageDialog(null, "La edad no puede ser negativa o igual a cero");
        }
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getLugarNacimiento() {
        return LugarNacimiento;
    }

    public void setLugarNacimiento(String LugarNacimiento) {
        this.LugarNacimiento = LugarNacimiento;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
} // Fin class Personas
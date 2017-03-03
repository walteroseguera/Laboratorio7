package WalterOseguera_Lab7;

import java.util.ArrayList;

public class Clientes extends Personas{
    private int Ticket, Dinero;
    private ArrayList Ordenes = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(int Ticket, int Dinero, String Nombre, int ID, int Edad, String Nacionalidad, String LugarNacimiento, java.awt.Color Color) {
        super(Nombre, ID, Edad, Nacionalidad, LugarNacimiento, Color);
        this.Ticket = Ticket;
        this.Dinero = Dinero;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int Ticket) {
        this.Ticket = Ticket;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(ArrayList Ordenes) {
        this.Ordenes = Ordenes;
    }
    
} // Fin class Clientes
package vivero;

public class CondicionSosuplRiegoinf extends Condicion {

    protected int sol, riego;

    public CondicionSosuplRiegoinf(int sol, int riego) {
        this.sol = sol;
        this.riego = riego;
    }

    public CondicionSosuplRiegoinf() {
        this.sol = 5;
        this.riego = 3;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    @Override
    public boolean cumple(Object o, Planta p) {
        String nombre = (String) (o);
        return (p.getRiego() > riego && p.getSol() < sol);
    }
}

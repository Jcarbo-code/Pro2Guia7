package agroquimicos;

import java.util.ArrayList;

public class EmpresaAgricola {

    protected ArrayList<Agroquimico> agroquimicos;

    public EmpresaAgricola() {
        this.agroquimicos = new ArrayList();
    }

    public static void main(String[] arg) {
        EmpresaAgricola emp = new EmpresaAgricola();
        Enfermedad efe = new Enfermedad("matayuyo");
        Cultivo c = new Cultivo("soja");
        Agroquimico a1 = new Agroquimico("primero");
        Agroquimico a2 = new Agroquimico("el que no");
        Agroquimico a3 = new Agroquimico("secun. no culti");
        Agroquimico a4 = new Agroquimico("ulti");

        efe.addEstado("sequedad");
        a1.addEstado("sequedad");
        a3.addEstado("sequedad");
        a4.addEstado("sequedad");
        a3.cultivos.add(c);
        /*agroquimicos.add(a4);
        agroquimicos.add(a1);
        agroquimicos.add(a2);
        agroquimicos.add(a3);*/
        System.out.println(emp.allTratan(efe));
    }

    //Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.
    public ArrayList<Agroquimico> allTratan(Enfermedad efe) {
        ArrayList<Agroquimico> aux = new ArrayList();
        for (int i = 0; i < agroquimicos.size(); i++) {
            if (agroquimicos.get(i).trato(efe)) {
                aux.add(agroquimicos.get(i));
            }
        }
        return aux;
    }

    //Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los pueden tratar
    public ArrayList<Agroquimico> allTratan(Cultivo c, Enfermedad efe) {
        ArrayList<Agroquimico> aux = new ArrayList();
        for (int i = 0; i < agroquimicos.size(); i++) {
            if (agroquimicos.get(i).trato(efe) && agroquimicos.get(i).seAconseja(c)) {
                aux.add(agroquimicos.get(i));
            }
        }
        return aux;
    }
}

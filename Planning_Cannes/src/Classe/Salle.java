package Classe;

public class Salle {
    private int idsalle;
    private String nomsalle;
    private int nbrplaces;
    private String typefilm;


    public Salle() {
        idsalle = 0;
        nomsalle = "" ;
        nbrplaces = 0;
        typefilm = "";
    }

    public Salle(String n,int nb,String tf) {
        nomsalle = n ;
        nbrplaces = nb;
        typefilm = tf ;
    }


    public int getIdsalle() {
        return idsalle;
    }

    public void setIdsalle(int newIdsalle) {
        idsalle = newIdsalle;
    }
    public void setNomsalle(String newNomsalle) {
        nomsalle = newNomsalle;
    }
    public int getNbrplaces() {
        return nbrplaces;
    }

    public String getnomsalle() {
        return nomsalle;
    }

    public void setNbrplaces(int newNbrplaces) {
        nbrplaces = newNbrplaces;
    }

    public String getTypefilm() {
        if (typefilm == null)
            typefilm = new String();
        return typefilm;
    }

    public String getIteratorTypefilm() {
        if (typefilm == null)
            typefilm = new String();
        return typefilm;
    }

}

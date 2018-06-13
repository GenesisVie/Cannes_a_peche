/***********************************************************************
 * Module:  Salle.java
 * Author:  p1604581
 * Purpose: Defines the Class Salle
 ***********************************************************************/

/** @pdOid de300fcf-90e3-4a21-b6a5-ff0a1cfbb4e9 */
public class Salle {
    private int idsalle;
    private String nomsalle;
    private int nbrplaces;
    private String typefilm;

    /** @pdOid 6aebce8f-630f-457b-b875-253a27604eac */
    protected void finalize() {
        // TODO: implement
    }



    /** @pdOid 42ca0f8a-d72e-48a6-b637-a2a2551a3123 */
    public Salle() {
        idsalle = 0;
        nomsalle = "" ;
        nbrplaces = 0;
        typefilm = "";
    }

    public Salle(int id,String n,int nb,String tf) {
        idsalle = id;
        nomsalle = n ;
        nbrplaces = nb;
        typefilm = tf ;
    }


    /** @pdOid 47c42426-31fd-4b1a-8c2c-5812a62c8e2f */
    public int getIdsalle() {
        return idsalle;
    }

    /** @param newIdsalle
     * @pdOid b6816739-1399-41a1-8522-5e9404e1b92c */
    public void setIdsalle(int newIdsalle) {
        idsalle = newIdsalle;
    }


    /** @pdGenerated default getter */
    public String getTypefilm() {
        if (typefilm == null)
            typefilm = new String();
        return typefilm;
    }

    /** @pdGenerated default iterator getter */
    public String getIteratorTypefilm() {
        if (typefilm == null)
            typefilm = new String();
        return typefilm;
    }


    /* @pdGenerated default remove


    public void setTypefilm(java.util.Collection<Typefilm> newTypefilm) {
        removeAllTypefilm();
        for (java.util.Iterator iter = newTypefilm.iterator(); iter.hasNext();)
            addTypefilm((Typefilm)iter.next());
    }


    public void addTypefilm(Typefilm newTypefilm) {
        if (newTypefilm == null)
            return;
        if (this.typefilm == null)
            this.typefilm = new String();
        if (!this.typefilm.contains((CharSequence) newTypefilm))
            this.typefilm.add(newTypefilm);
    }


    public void removeTypefilm(Typefilm oldTypefilm) {
        if (oldTypefilm == null)
            return;
        if (this.typefilm != null)
            if (this.typefilm.contains((CharSequence) oldTypefilm))
                this.typefilm.remove(oldTypefilm);
    }

    @pdGenerated default removeAll

    public void removeAllTypefilm() {
        if (typefilm != null)
            typefilm.clear();
    }
 @param oldTypefilm */
}

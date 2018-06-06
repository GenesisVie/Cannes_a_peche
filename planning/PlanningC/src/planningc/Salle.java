/***********************************************************************
 * Module:  Salle.java
 * Author:  p1604581
 * Purpose: Defines the Class Salle
 ***********************************************************************/

package planningc;

import java.util.*;

/** @pdOid de300fcf-90e3-4a21-b6a5-ff0a1cfbb4e9 */
public class Salle {
   /** @pdOid 058516f4-c13d-4e0c-9964-0953d75f1363 */
   private int idsalle;
   /** @pdOid 1f694ca0-b31d-40a7-9d74-bb236125328a */
   private int nomsalle;
   /** @pdOid 6e210aa2-1585-47ee-8ec7-8c536e727dd6 */
   private int nbrplaces;
   
   /** @pdOid 6aebce8f-630f-457b-b875-253a27604eac */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Typefilm assc=association7 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Typefilm> typefilm;
   public Projection association6;
   
   /** @pdOid 42ca0f8a-d72e-48a6-b637-a2a2551a3123 */
   public Salle() {
      // TODO: implement
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
   public java.util.Collection<Typefilm> getTypefilm() {
      if (typefilm == null)
         typefilm = new java.util.HashSet<Typefilm>();
      return typefilm;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTypefilm() {
      if (typefilm == null)
         typefilm = new java.util.HashSet<Typefilm>();
      return typefilm.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTypefilm */
   public void setTypefilm(java.util.Collection<Typefilm> newTypefilm) {
      removeAllTypefilm();
      for (java.util.Iterator iter = newTypefilm.iterator(); iter.hasNext();)
         addTypefilm((Typefilm)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTypefilm */
   public void addTypefilm(Typefilm newTypefilm) {
      if (newTypefilm == null)
         return;
      if (this.typefilm == null)
         this.typefilm = new java.util.HashSet<Typefilm>();
      if (!this.typefilm.contains(newTypefilm))
         this.typefilm.add(newTypefilm);
   }
   
   /** @pdGenerated default remove
     * @param oldTypefilm */
   public void removeTypefilm(Typefilm oldTypefilm) {
      if (oldTypefilm == null)
         return;
      if (this.typefilm != null)
         if (this.typefilm.contains(oldTypefilm))
            this.typefilm.remove(oldTypefilm);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTypefilm() {
      if (typefilm != null)
         typefilm.clear();
   }

}
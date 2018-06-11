/***********************************************************************
 * Module:  Projection.java
 * Author:  p1604581
 * Purpose: Defines the Class Projection
 ***********************************************************************/

package planningc;

import java.util.*;

/** @pdOid e445124c-f2d1-430d-bb63-9c6b0aa7dc93 */
public class Projection implements Film Salle {
   private int dateP;
   private int heureP;
   public Film filmA;
   public Salle salleB;

   /** @pdOid 6b7ec17c-0932-467d-bf3b-506795752cec */
   public Projection() {
      dateP = 0;
      heureP = 0;
      filmA = "";
      salleB = "";
   }

   public Projection(int d,int h, Film f, Salle s) {
      dateP = d;
      heureP = h;
      filmA = f;
      salleB = s;
   }

   /** @pdOid f4b3af02-0d54-4e84-ac54-62fedf85ad9a */
   public int getDateP() {
      return dateP;
   }

   /** @param newDateP
    * @pdOid f2b5dd0f-f1a2-41ef-a15e-f8b048b050e0 */
   public void setDateP(int newDateP) {
      dateP = newDateP;
   }

   /** @pdOid 2a25ff0c-8331-48f2-9ee8-28b9e0682ddc */
   public void addSeance() {
      // TODO: implement
   }

}

/***********************************************************************
 * Module:  Projection.java
 * Author:  p1604581
 * Purpose: Defines the Class Projection
 ***********************************************************************/

package planningc;

import java.util.*;

/** @pdOid e445124c-f2d1-430d-bb63-9c6b0aa7dc93 */
public class Projection {
   /** @pdOid 588e0ce3-0ece-49aa-94a7-854838d48f5c */
   private int dateP;
   /** @pdOid 606709cc-2f91-459a-aaef-e458fe7d3355 */
   private int heureP;
   
   /** @pdOid 9f4d9a7d-bec1-4f71-a288-1fe0b3654ba9 */
   protected void finalize() {
      // TODO: implement
   }
   
   public Film filmA;
   public Salle salleB;
   
   /** @pdOid 6b7ec17c-0932-467d-bf3b-506795752cec */
   public Projection() {
      // TODO: implement
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
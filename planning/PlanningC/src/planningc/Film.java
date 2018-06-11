/***********************************************************************
 * Module:  Film.java
 * Author:  p1604581
 * Purpose: Defines the Class Film
 ***********************************************************************/

package planningc;

import java.util.*;

/** @pdOid 8403fbd9-a0b9-43eb-b933-468a227362d9 */
public class Film {
   private int idfilm;
   private String nomfilm;
   private int dureeF;

   /** @pdOid 023885bf-48fe-476d-9da5-4d9b65ff374e */
   protected void finalize() {
      // TODO: implement
   }

   public java.util.Collection association6;
   /** @pdRoleInfo migr=no name=Individu assc=association5 mult=0..1 side=A */
   public Individu individu;

   /** @pdOid f8b2dd36-b610-4454-b05a-10e98e4a1b2f */
   public Film() {
     idfilm = 0;
     nomfilm = "";
     dureeF = 0;
   }
   public Film(int id, String n, int d)
   {
     idfilm=id;
     nomfilm=n;
     dureeF=d;
   }

   /** @pdOid 995d9506-47c1-40c4-b291-a8fea7bee6df */
   public int getIdfilm() {
      return idfilm;
   }

   /** @param newIdfilm
    * @pdOid 673ce7ab-9a73-4dc9-9270-0a925e605f72 */
   public void setIdfilm(int newIdfilm) {
      idfilm = newIdfilm;
   }

   /** @pdOid 4f85c7f2-a953-4df9-9a5b-54efcdbad6ec */
   public HashSet generationP() {
      // TODO: implement
      return null;
   }

   /** @pdOid 89d3ad6b-7493-4e87-9266-0e0d4842641a */
   public Film addFilm() {
      // TODO: implement
      return null;
   }


   /** @pdGenerated default parent getter */
   public Individu getIndividu() {
      return individu;
   }

   /** @pdGenerated default parent setter
     * @param newIndividu */
   public void setIndividu(Individu newIndividu) {
      if (this.individu == null || !this.individu.equals(newIndividu))
      {
         if (this.individu != null)
         {
            Individu oldIndividu = this.individu;
            this.individu = null;
            oldIndividu.removeFilm(this);
         }
         if (newIndividu != null)
         {
            this.individu = newIndividu;
            this.individu.addFilm(this);
         }
      }
   }

}

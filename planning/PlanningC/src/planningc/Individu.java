/***********************************************************************
 * Module:  Individu.java
 * Author:  p1604581
 * Purpose: Defines the Class Individu
 ***********************************************************************/

package planningc;

import java.util.*;

/** @pdOid 4f9fab5d-d3ac-4d3d-b0b8-657a5e7c76e5 */
public class Individu {
   /** @pdOid 185778b4-968d-4de5-8688-539226a8bc88 */
   private int idindividu;
   /** @pdOid 901e9db3-9946-4e96-ab50-98f401f2cbd8 */
   private String nom;
   
   /** @pdOid 90baaa40-1e18-4e78-a5e9-f994543f2a18 */
   protected void finalize() {
      // TODO: implement
   }
   
   /** @pdRoleInfo migr=no name=Film assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Film> film;
   
   /** @pdOid bddbdd8a-5e97-4e63-91b8-1cae914f4e9c */
   public int getIdindividu() {
      return idindividu;
   }
   
   /** @param newIdindividu
    * @pdOid 8270be4f-0c09-4d47-9ff9-46cf6694ac8d */
   public void setIdindividu(int newIdindividu) {
      idindividu = newIdindividu;
   }
   
   /** @pdOid 2d15865b-3966-441e-854f-d91a78962701 */
   public Individu() {
      // TODO: implement
   }
   
   /** @pdOid 20b5a64e-a8fc-4515-9000-0fefaeb154f5 */
   public void assiste() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Film> getFilm() {
      if (film == null)
         film = new java.util.HashSet<Film>();
      return film;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorFilm() {
      if (film == null)
         film = new java.util.HashSet<Film>();
      return film.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newFilm */
   public void setFilm(java.util.Collection<Film> newFilm) {
      removeAllFilm();
      for (java.util.Iterator iter = newFilm.iterator(); iter.hasNext();)
         addFilm((Film)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newFilm */
   public void addFilm(Film newFilm) {
      if (newFilm == null)
         return;
      if (this.film == null)
         this.film = new java.util.HashSet<Film>();
      if (!this.film.contains(newFilm))
      {
         this.film.add(newFilm);
         newFilm.setIndividu(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldFilm */
   public void removeFilm(Film oldFilm) {
      if (oldFilm == null)
         return;
      if (this.film != null)
         if (this.film.contains(oldFilm))
         {
            this.film.remove(oldFilm);
            oldFilm.setIndividu((Individu)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllFilm() {
      if (film != null)
      {
         Film oldFilm;
         for (java.util.Iterator iter = getIteratorFilm(); iter.hasNext();)
         {
            oldFilm = (Film)iter.next();
            iter.remove();
            oldFilm.setIndividu((Individu)null);
         }
      }
   }

}
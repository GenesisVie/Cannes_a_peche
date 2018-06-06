/***********************************************************************
 * Module:  Jury.java
 * Author:  p1623124
 * Purpose: Defines the Class Jury
 ***********************************************************************/

package planningc;

import java.util.*;

/** @pdOid 496087c2-fee7-438b-9108-a4b7b3faa3bf */
public class Jury {
   /** @pdRoleInfo migr=no name=Individu assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Individu> individu;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Individu> getIndividu() {
      if (individu == null)
         individu = new java.util.HashSet<Individu>();
      return individu;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIndividu() {
      if (individu == null)
         individu = new java.util.HashSet<Individu>();
      return individu.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIndividu */
   public void setIndividu(java.util.Collection<Individu> newIndividu) {
      removeAllIndividu();
      for (java.util.Iterator iter = newIndividu.iterator(); iter.hasNext();)
         addIndividu((Individu)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIndividu */
   public void addIndividu(Individu newIndividu) {
      if (newIndividu == null)
         return;
      if (this.individu == null)
         this.individu = new java.util.HashSet<Individu>();
      if (!this.individu.contains(newIndividu))
         this.individu.add(newIndividu);
   }
   
   /** @pdGenerated default remove
     * @param oldIndividu */
   public void removeIndividu(Individu oldIndividu) {
      if (oldIndividu == null)
         return;
      if (this.individu != null)
         if (this.individu.contains(oldIndividu))
            this.individu.remove(oldIndividu);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIndividu() {
      if (individu != null)
         individu.clear();
   }

}
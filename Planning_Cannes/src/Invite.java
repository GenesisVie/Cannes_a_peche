/***********************************************************************
 * Module:  Invite.java
 * Author:  p1623124
 * Purpose: Defines the Class Invite
 ***********************************************************************/

/** @pdOid 161fcf6d-f0eb-4485-a89e-67653a34b234 */
public class Invite {
   /** @pdRoleInfo migr=no name=Individu assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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
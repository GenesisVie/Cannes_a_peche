package Classe;

public class Projection extends Film{
   private int Jour;
   private int heureP;

   public Projection() {
      super();
      Jour = 0;
      heureP = 0;
   }

   public Projection(int d,int h, String nomFilm, int dureeF) {

      super(nomFilm,dureeF);
      Jour = d;
      heureP = h;
   }

   public int getJour() {
      return Jour;
   }

   public void setJour(int newJour) {
      Jour = newJour;
   }

   public void addSeance() {
      // TODO: implement
   }

}

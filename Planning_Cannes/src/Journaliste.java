public class Journaliste {
   private int idJ;
   private String prenomJ;
   private String nomJ;
   private int telJ;

   public Journaliste() {
      idJ = 0 ;
      prenomJ = "" ;
      nomJ = "";
      telJ = 0;
   }

   public Journaliste(int id, String n, String p, int t) {
      idJ = id;
      prenomJ = n ;
      nomJ = p;
      telJ = t;
   }

   public Journaliste(int id, String n, String p) {
      idJ = id;
      prenomJ = n ;
      nomJ = p;
   }

   public int getById() {
      return idJ;
   }



}
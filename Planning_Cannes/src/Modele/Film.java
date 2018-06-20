package Modele;

import java.util.*;

public class Film {
   private String nomfilm;
   private int dureeF;

   public Film() {
     nomfilm = "";
     dureeF = 0;
   }
   public Film( String n, int d)
   {
     nomfilm=n;
     dureeF=d;
   }

   public String getNomfilm() {
      return nomfilm;
   }
    public int getDureeF() {
        return dureeF;
    }

   }



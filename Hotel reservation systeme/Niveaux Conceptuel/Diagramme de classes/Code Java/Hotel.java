/***********************************************************************
 * Module:  Hotel.java
 * Author:  power
 * Purpose: Defines the Class Hotel
 ***********************************************************************/

import java.util.*;

/** @pdOid 537433f1-4b23-490d-845d-a39ec080ea2b */
public class Hotel {
   /** @pdOid cd6ced13-4a6d-4c2d-a8aa-9d72bc36a1f4 */
   private String codeHotel;
   /** @pdOid 0bc02bd7-4d96-48fd-954d-c0b589dfab0c */
   private String nomHotel;
   /** @pdOid f4e25554-8daf-41e5-adbe-a514505752b4 */
   private String adresse;
   /** @pdOid 4d3b0856-d2ea-460b-9069-1da6c930e004 */
   private String telephone;
   /** @pdOid 4de087f8-676b-4e02-b3c1-d0ae9a043cba */
   private int classe;
   
   /** @pdRoleInfo migr=no name=Chambre assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Chambre> chambre;
   /** @pdRoleInfo migr=no name=Categorie assc=association2 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Categorie> categorie;
   
   /** @pdOid 880c5bfb-37fa-416b-927e-2964e2c9db14 */
   public void consulterDisponibilite() {
      // TODO: implement
   }
   
   /** @pdOid 53fbcd31-8165-4fa9-a3a4-c9b7f6ce9c60 */
   public void ajouterChambre() {
      // TODO: implement
   }
   
   /** @pdOid 164e97b6-2ff7-45c4-9ddc-8d7375691f4e */
   public void ajouterCategorie() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Chambre> getChambre() {
      if (chambre == null)
         chambre = new java.util.HashSet<Chambre>();
      return chambre;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorChambre() {
      if (chambre == null)
         chambre = new java.util.HashSet<Chambre>();
      return chambre.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newChambre */
   public void setChambre(java.util.Collection<Chambre> newChambre) {
      removeAllChambre();
      for (java.util.Iterator iter = newChambre.iterator(); iter.hasNext();)
         addChambre((Chambre)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newChambre */
   public void addChambre(Chambre newChambre) {
      if (newChambre == null)
         return;
      if (this.chambre == null)
         this.chambre = new java.util.HashSet<Chambre>();
      if (!this.chambre.contains(newChambre))
         this.chambre.add(newChambre);
   }
   
   /** @pdGenerated default remove
     * @param oldChambre */
   public void removeChambre(Chambre oldChambre) {
      if (oldChambre == null)
         return;
      if (this.chambre != null)
         if (this.chambre.contains(oldChambre))
            this.chambre.remove(oldChambre);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllChambre() {
      if (chambre != null)
         chambre.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Categorie> getCategorie() {
      if (categorie == null)
         categorie = new java.util.HashSet<Categorie>();
      return categorie;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCategorie() {
      if (categorie == null)
         categorie = new java.util.HashSet<Categorie>();
      return categorie.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCategorie */
   public void setCategorie(java.util.Collection<Categorie> newCategorie) {
      removeAllCategorie();
      for (java.util.Iterator iter = newCategorie.iterator(); iter.hasNext();)
         addCategorie((Categorie)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCategorie */
   public void addCategorie(Categorie newCategorie) {
      if (newCategorie == null)
         return;
      if (this.categorie == null)
         this.categorie = new java.util.HashSet<Categorie>();
      if (!this.categorie.contains(newCategorie))
         this.categorie.add(newCategorie);
   }
   
   /** @pdGenerated default remove
     * @param oldCategorie */
   public void removeCategorie(Categorie oldCategorie) {
      if (oldCategorie == null)
         return;
      if (this.categorie != null)
         if (this.categorie.contains(oldCategorie))
            this.categorie.remove(oldCategorie);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCategorie() {
      if (categorie != null)
         categorie.clear();
   }

}
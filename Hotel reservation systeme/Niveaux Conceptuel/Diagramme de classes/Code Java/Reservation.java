/***********************************************************************
 * Module:  Reservation.java
 * Author:  power
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;

/** @pdOid dd419633-e8a3-44aa-a26d-21215eed4ff8 */
public class Reservation {
   /** @pdOid 9769a5b4-e990-454d-a649-3ed3a2f3ecc6 */
   private int numReservation;
   /** @pdOid fda32412-c081-4bf7-87c4-270d37a69b84 */
   private Date dateDebut;
   /** @pdOid e0694a74-752c-44ea-aa12-c6a2067a3a75 */
   private Date dateFin;
   /** @pdOid b766f5bf-a23d-45b2-945a-6474fde50a9f */
   private Date datePayeArrhes;
   /** @pdOid 283f5f8e-4ced-496c-9775-7b45900161eb */
   private float montantArrhe;
   
   /** @pdRoleInfo migr=no name=Client assc=association5 mult=1..1 */
   public Client client;
   /** @pdRoleInfo migr=no name=Facture assc=association6 mult=0..1 type=Aggregation */
   public Facture facture;
   /** @pdRoleInfo migr=no name=Chambre assc=association9 mult=1..1 */
   public Chambre chambre;
   
   /** @pdOid 18c781de-640f-4ba1-b8ad-e668a091cb4e */
   public void confirmer() {
      // TODO: implement
   }
   
   /** @pdOid 3ff122bc-17c9-4b35-aeee-c496126fad94 */
   public void annuler() {
      // TODO: implement
   }
   
   /** @pdOid 45deec5c-02ce-4ccf-95ac-411b660f4b93 */
   public void modifierDates() {
      // TODO: implement
   }
   
   /** @pdOid 240328b3-f31b-487b-a926-e20f0f477f31 */
   public void enregistrer() {
      // TODO: implement
   }

}
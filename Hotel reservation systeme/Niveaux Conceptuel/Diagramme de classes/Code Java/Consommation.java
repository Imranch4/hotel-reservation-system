/***********************************************************************
 * Module:  Consommation.java
 * Author:  power
 * Purpose: Defines the Class Consommation
 ***********************************************************************/

import java.util.*;

/** @pdOid eb1fb81d-edcb-49ee-88ed-3c7fa367dcdc */
public class Consommation {
   /** @pdOid e317c62a-0029-4ece-b879-62f0a1ea4e5b */
   private int numConsommation;
   /** @pdOid 5843e690-cc78-4c63-97f5-690c006ed09e */
   private Date dateConsommation;
   /** @pdOid 71a6a14c-ab83-472f-8292-c169a5c517fe */
   private Time heureConsommation;
   /** @pdOid a07314ca-d76f-447d-b483-36ba0e55cbe7 */
   private int prixConsommation;
   /** @pdOid d506631c-a0c1-4bd7-9bf9-d3ad32cca7be */
   private Prestation prestationConsom;
   
   /** @pdRoleInfo migr=no name=Prestation assc=association8 mult=1..1 */
   public Prestation prestation;
   /** @pdRoleInfo migr=no name=Facture assc=association10 mult=1..1 type=Aggregation */
   public Facture facture;
   
   /** @pdOid d84b6fc2-c64b-44b7-90f6-c6ca325a3f12 */
   public void enregistrerConsommation() {
      // TODO: implement
   }
   
   /** @pdOid cfc8abdb-5bc1-4a88-8064-805fb81eb890 */
   public float calculerTotal() {
      // TODO: implement
      return 0;
   }

}
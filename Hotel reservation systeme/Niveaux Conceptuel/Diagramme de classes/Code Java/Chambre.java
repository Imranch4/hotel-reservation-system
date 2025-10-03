/***********************************************************************
 * Module:  Chambre.java
 * Author:  power
 * Purpose: Defines the Class Chambre
 ***********************************************************************/

import java.util.*;

/** @pdOid d0cf06a7-df7c-4bdf-8e4d-f4e98be60470 */
public class Chambre {
   /** @pdOid d0e69641-0051-4df8-9699-0f030d8dc443 */
   private int numChambre;
   /** @pdOid c354dd0e-84a7-4596-a86c-fc7236ead99d */
   private String numTelephone;
   
   /** @pdRoleInfo migr=no name=Categorie assc=association3 mult=1..1 */
   public Categorie categorie;
   
   /** @pdOid 51aaef3b-3ea8-4df7-bd63-c25d8141eb0d */
   public boolean reserver() {
      // TODO: implement
      return false;
   }
   
   /** @pdOid ea2c8df9-071a-41be-b2e4-671a03eff9b7 */
   public void liberer() {
      // TODO: implement
   }

}
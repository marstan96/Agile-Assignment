package Control;

import domain.Affiliates;
import da.affiliatesDA;

public class MaintainAffiliates {

    private affiliatesDA affiliatesDA = new affiliatesDA();
    
    public void addCustomerDetails(Affiliates customerDetails){
        affiliatesDA.addAfiliatesDetails(customerDetails);
    }
    
    public Affiliates readID(){
        return affiliatesDA.readID();
    }
    
}

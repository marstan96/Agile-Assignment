package domain;

public class Affiliates {

    private String affiliatesID;
    private String affiliatesName;
    private String affiliatesICNumber;
    private int affiliatesAge;
    private String affiliatesGender;
    private String phoneNumber;

    public Affiliates(String affiliatesID, String affiliatesName, String affiliatesICNumber, String phoneNumber, int affiliatesAge, String affiliatesGender) {
        this.affiliatesID = affiliatesID;
        this.affiliatesName = affiliatesName;
        this.affiliatesICNumber = affiliatesICNumber;
        this.affiliatesAge = affiliatesAge;
        this.affiliatesGender = affiliatesGender;
        this.phoneNumber = phoneNumber;
    }
    
    public Affiliates(String affiliatesID) {
        this.affiliatesID = affiliatesID;
    }

    public String getAffiliatesID() {
        return affiliatesID;
    }

    public void setAffiliatesID(String affiliatesID) {
        this.affiliatesID = affiliatesID;
    }

    public String getAffiliatesICNumber() {
        return affiliatesICNumber;
    }

    public void setAffiliatesICNumber(String affiliatesICNumber) {
        this.affiliatesICNumber = affiliatesICNumber;
    }

    public int getAffiliatesAge() {
        return affiliatesAge;
    }

    public void setAffiliatesAge(int affiliatesAge) {
        this.affiliatesAge = affiliatesAge;
    }

    public String getAffiliatesGender() {
        return affiliatesGender;
    }

    public void setAffiliatesGender(String affiliatesGender) {
        this.affiliatesGender = affiliatesGender;
    }

    public String getAffiliatesName() {
        return affiliatesName;
    }

    public void setAffiliatesName(String affiliatesName) {
        this.affiliatesName = affiliatesName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

package day31_Constructors;

public class Offer {


    public String location, companyName,jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO,isWFH, isFullTime;

    // right click, generate, constructor, select all, and we create a constructor.
    // by default it generates public offer but we delete this part and write public void setInfo

    public void setInfo (String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    // we need toString method to avoid hashtags

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $ " + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}



    // if local variable and instance variable are the same we use "This" keyword to call the instance variable.
/*
    create a custom class named offer

    attributes:
    location, companyName, jobTitle, salary, hasBenefit, has PTO, is WFH, isFullTime

    actions:
    setInfo: sets all the instance variables
    toString () returns the full info of the offer object.
     */



package Lab_task_3_mid;


public class contact {
    private String personName;
    private String  personID;
    private int age;
    private String mobileNumber;
    private char gender;
    
    contact(){}
    
    contact(String personName, String personID, int age, String mobileNumber, char gender)
    {
        this.personName=personName;
        this.personID=personID;
        this.age=age;
        this.mobileNumber=mobileNumber;
        this.gender=gender;
    }
    
    public void showPersonInfo()
    {
        System.out.println("Person name:"+personName);
         System.out.println("Person ID:"+personID);
          System.out.println("Person age:"+age);
           System.out.println("Person mobile number:"+mobileNumber);
            System.out.println("Person gender:"+gender);
    }
    
    void detectMobileOperator()
    {
        int code=mobileNumber.charAt(2);
        switch(code){
            case '8':System.out.println("Robi");
            break;
            case '7':System.out.println("Gp");
            break;
            case '6':System.out.println("Banglalink");
            break;
            default: System.out.println("Not Mobile Number");
            break;
        }
    }
    
}
//void detectMobileOperator(contact con)
//    {
//        int code=con.mobileNumber.charAt(2);
//        switch(code){
//            case '8':System.out.println("Robi");
//            break;
//            case '7':System.out.println("Gp");
//            break;
//            case '6':System.out.println("Banglalink");
//            break;
//            default: System.out.println("Not Mobile Number");
//            break;
//        }
//    }
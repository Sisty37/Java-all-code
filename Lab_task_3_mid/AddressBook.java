
package Lab_task_3_mid;


public class AddressBook {
    private String ownerName;
    private String info;
    private contact[] listofContact;
    private int totalContact;
    
    AddressBook(){}
    
    AddressBook(String ownerName, String info, int totalContactc, contact con)
    {
        this.ownerName=ownerName;
        this.info=info;
        this.totalContact=totalContact;
        listofContact=new contact[totalContact];
        

        for (int i=0; i<listofContact.length; i++) {
            if(listofContact[i]==null){
                listofContact[i]=con;
                break;
            }
        }      
    }
    void showAllContactInfo()
    {
        System.out.println("Owner name:"+ownerName);
        System.out.println("Owner info:"+info);
        System.out.println("Total Contact:"+totalContact);     
        for(int i=0;i<totalContact;i++){
            if(listofContact[i]!=null){
                System.out.println("Contact:"+listofContact[i]);
            }
            else{
                break;
            }
        }
    }
    
    void addContact (contact con)
    {
        totalContact++;
        
        
        for(int i=0; i<listofContact.length; i++)
        {
            if(listofContact[i]==null){
                listofContact[i]=con;
//                listofContact[i].detectMobileOperator();
                break;
            }
        }
        
    }
    
    
    
}

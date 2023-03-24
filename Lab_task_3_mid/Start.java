
package Lab_task_3_mid;


public class Start {
    public static void main(String[] args) {
        
        
        
        
        
        contact C1=new contact("Sisty", "22-49133-3", 21, "01849365043",'M');
        C1.showPersonInfo();
        
        contact C2=new contact("Sisty", "22-49133-3", 21, "01749365043",'M');
        C2.showPersonInfo();
        
        AddressBook ab1=new AddressBook("sisty", "Bashundhara",3,C1);
        ab1.showAllContactInfo();
        ab1.addContact(C2);
        
        
    }
}

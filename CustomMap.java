
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

class Customer {
    private int id;
    private String name;
    private double balance;
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int hashCode() {
        return 1;
    }

    public boolean equals(Object p) {
        Customer z = (Customer)p;
        return name.equals(z.getName());
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        return "id: " + getId() + " , name: " + getName() + " , bal: " + getBalance();        
    }
}

public class CustomMap {
    
    public void printMap(Map<Customer, String> mp) {
        
        for(Map.Entry<Customer, String> mentry: mp.entrySet()) {
            System.out.println("key:[ " + mentry.getKey() + " ], val: [" + mentry.getValue() + " ]");
        }
        
    }
    
    public static void main(String args[]) {
        CustomMap me = new CustomMap();
        Map<Customer, String> custmap = new HashMap<>();
        Customer a = new Customer();
        Customer b = new Customer();
        Customer c = new Customer();
        Customer d = new Customer();
        Customer e = new Customer();
        
        a.setId(1);
        a.setName("ramesh");
        a.setBalance(100.0);

        b.setId(1);
        b.setName("ramesh");
        b.setBalance(1000.0);
        
        c.setId(3);
        c.setName("mohan");
        c.setBalance(20.0);
        
        d.setId(4);
        d.setName("bolu");
        d.setBalance(40.0);
        
        e.setId(5);
        e.setName("gullu");
        e.setBalance(500.0);
        
        custmap.put(a,"a");
        custmap.put(b,"b");
        custmap.put(c,"c");
        custmap.put(d,"d");
        custmap.put(e,"e");
        
        me.printMap(custmap);
    }
}

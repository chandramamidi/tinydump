import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Customer implements Comparable<Customer> {
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
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public int compareTo(Customer a) {
        
        if(name.compareTo(a.getName()) == 0) {
            if(id==a.id) {
                return 0;
            }else if(id > a.getId()) {
                return 1;
            }else {
                return -1;
            }
        }
        return name.compareTo(a.getName());
    }
    
    public String toString() {
        return "id: " + getId() + " , name: " + getName() + " , bal: " + getBalance();        
    }
}

public class DupCustomer {
    
    public void printSorted(List<Customer> clist) {
        Collections.sort(clist);
        
        for(Customer cs: clist) {
            System.out.println(""+cs.toString());            
        }
        
    }
    
    public void removeDuplicateCustomers(List<Customer> clist) {
        Set<Customer> s = new TreeSet<>();
        
        for(Customer cr: clist) {
         s.add(cr);   
        }
        
        for(Customer x: s) {
            System.out.println(""+x.toString());
        }
    }
    
    public static void main(String args[]) {
        DupCustomer me = new DupCustomer();
        List<Customer> list = new ArrayList<>();
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
        
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        
        me.removeDuplicateCustomers(list);
        //me.printSorted(list);
    }
}

package aula08ex;

public class Manager extends User {
    //constructor
    public Manager(String name, String password) {
        super(name, password);
    }
    
    //methods
    public static double openCashBox(CashBox c){
        c.setStatus();
        return c.getAmount();
    }
    public  double closeCashBox (Worker[] w, CashBox c){
        int balance = 0;
        for (int i = 0; i < w.length; i++) {
            c.addAmount(w[i].getSell());
            balance += w[i].getSell();
        }
        c.setStatus();
        return balance;
    }
}

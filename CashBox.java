package aula08ex;

public class CashBox {
    private double amount;
    private boolean status;
    
    public CashBox(double a){
        this.amount = a;
    }
    
    public void addAmount (double value){
        this.amount += value;
    }
    
    public double getAmount (){
        return this.amount;
    }
    
    public void setStatus(){
        this.status = !this.status;
    }
    
    
}

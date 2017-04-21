package aula08ex;

public class Worker extends User {

    //attributes
    private double payment;
    private double sell;
    private double comission;

    //Constructor
    public Worker(double payment, String name, String password) {
        super(name, password);
        this.payment = payment;
        this.sell = 0;
        this.comission = 0;
    }

    //Payment methods
    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    //Sell methods
    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    //Comission methods
    public double getComission() {
        return comission;
    }

    public void setComission(double v) {
        this.comission = sell * 0.05;
    }

}

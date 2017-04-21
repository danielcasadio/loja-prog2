package aula08ex;

public class Client extends User {

    protected String rg;
    protected String cpf;
    protected String address;
    protected String phone;

    public Client(String rg, String cpf, String address, String phone, String name, String password) {
        super(name, password);
        this.rg = rg;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    private void changePassword(String p) {
        this.password = p;
    }

    private void changePhone(String p) {
        this.phone = p;
    }

    private void changeAddress(String a) {
        this.address = a;
    }

}

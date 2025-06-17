public class Pessoa<T> {
    private String nome;
    private String e_mail;
    private T celular;

    public Pessoa(String nome, String e_mail, T celular){
        this.nome = nome;
        this.e_mail = e_mail;
        this.celular = celular;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setE_mail(String e_mail){
        this.e_mail = e_mail;
    }
    public void setCelular(T celular){
        this.celular =  celular;
    }

    public String getNome(){
        return nome;
    }
    public String getE_mail(){
        return e_mail;
    }
    public T getCelular(){
        return celular;
    }
    @Override
    public String toString() {
        return "nome: "+ nome + " | email: " +  e_mail + " | telefone: " + celular;
    }
}

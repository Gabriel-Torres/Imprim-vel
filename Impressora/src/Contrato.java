public class Contrato implements Imprimível{

    public String nome;
    public String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimir(){
        System.out.println("Sou um contrato muito legal"+ getNome());
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
    }
}
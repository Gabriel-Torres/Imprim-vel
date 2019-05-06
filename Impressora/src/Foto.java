public class Foto implements Imprimível {

    public String nome;
    public String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimir(){
        System.out.println("Sou uma selfie"+nome);
        System.out.println("Nome: "+nome);
        System.out.println("Tipo: "+tipo);
    }
}

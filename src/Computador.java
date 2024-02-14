public class Computador {

    private String cor;
    private String tamanho;

    //Propriedades do computador

    public Computador(String tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    //Método para obter tamanho do computador

    public String getTamanho() {
        return tamanho;
    }

    //Método para definir tamanho do computador

    public void setTamanho() {
        this.tamanho = tamanho;
    }

    //Método para obter cor do computador

    public String getCor() {
        return cor;
    }

    //Método para definir cor do computador

    public void setCor() {
        this.cor = cor;
    }

    //Método para exibir caracteristicas do computador

    public void exibirCaracteristicas() {
        System.out.println("tamanho" + tamanho);
        System.out.println("cor" + cor);
    }

    //Método para saber caracteristicas do computador

    public static void main(String[] args) {
        //Criando caracteristicas
        Computador meuComputador = new Computador(": Médio", ": Preto");

        //Exibindo caracteristicas do computador
        meuComputador.exibirCaracteristicas();
    }
}

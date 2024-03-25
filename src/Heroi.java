// Heroi.java
// Classe para representar um super-herói
public class Heroi {
    // Atributos
    private String nome;            // Nome do herói
    private String superpoder;      // Superpoder do herói
    private String nomeDaVidaReal;  // Nome da vida real do herói
    private Universo universo;      // Universo do herói (Marvel ou DC)

    // Construtor
    public Heroi(String nome, String superpoder, String nomeDaVidaReal, Universo universo) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.nomeDaVidaReal = nomeDaVidaReal;
        this.universo = universo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public String getNomeDaVidaReal() {
        return nomeDaVidaReal;
    }

    public void setNomeDaVidaReal(String nomeDaVidaReal) {
        this.nomeDaVidaReal = nomeDaVidaReal;
    }

    public Universo getUniverso() {
        return universo;
    }

    public void setUniverso(Universo universo) {
        this.universo = universo;
    }

    // Método para realizar um ataque com o superpoder
    public void atacar() {
        System.out.println(nome + " está atacando com o poder " + superpoder + "!");
    }
}

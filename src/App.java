// App.java
// Classe principal para testar a implementação da classe Heroi
public class App {
    public static void main(String[] args) {
        // Criando um objeto da classe Heroi - Wolverine
        Heroi wolverine = new Heroi("Wolverine", "Fator de Cura e Garras de Adamantium", "Logan", Universo.MARVEL);

        // Imprimindo o universo do herói
        System.out.println();
        System.out.println("Universo: " + wolverine.getUniverso());
        System.out.println();
        
        // Utilizando o método atacar
        wolverine.atacar(); 
        System.out.println();
        
    }
}

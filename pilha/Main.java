import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pilha p1 = new Pilha();
        Pilha pa = new Pilha();
        Pilha p2 = new Pilha();

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // Empilha cada letra em p1
        for (int i = 0; i < palavra.length(); i++) {
            p1.push(palavra.charAt(i));
        }

        // Copia invertendo para pa
        while (!p1.estaVazia()) {
            pa.push(p1.pop());
        }

        // Copia de pa para p2 (restaurando a original em p1)
        while (!pa.estaVazia()) {
            char letra = pa.pop();
            p2.push(letra);     // palavra invertida
            p1.push(letra);     // restaurando p1
        }

        // Mostrar pilhas
        p1.mostrar("p1 (inicial)");
        p2.mostrar("p2 (invertida)");

        // compara original e invertida
        String original = p1.obterConteudoBaseParaTopo();
        String invertida = p2.obterConteudoTopoParaBase();

        if (original.equals(invertida)) {
            System.out.println("A palavra \"" + original + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + original + "\" não é um palíndromo.");
            System.out.println("Comparação: \"" + original + "\" ≠ \"" + invertida + "\"");
        }

        sc.close();
    }
}

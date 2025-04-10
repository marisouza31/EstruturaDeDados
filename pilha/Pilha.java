/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Pilha {
    private char[] pilha;
    private int topo;
    private int tamanho;
    private int qtdElementos;

    public Pilha() {
        topo = -1;
        tamanho = 100;
        pilha = new char[tamanho];
        qtdElementos = 0;
    }

    public boolean estaVazia() {
        return qtdElementos == 0;
    }

    public boolean estaCheia() {
        return qtdElementos == tamanho;
    }

    public boolean push(char e) {
        if (!estaCheia()) {
            topo++;
            pilha[topo] = e;
            qtdElementos++;
            return true;
        }
        return false;
    }

    public char pop() {
        if (!estaVazia()) {
            char x = pilha[topo];
            topo--;
            qtdElementos--;
            return x;
        }
        return '\0';
    }

    public void mostrar(String nome) {
        System.out.print("Conteúdo da pilha " + nome + ": ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }

    // Pega a pilha de baixo para cima (base para topo) → palavra original
    public String obterConteudoBaseParaTopo() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= topo; i++) {
            sb.append(pilha[i]);
        }
        return sb.toString();
    }

    // Pega a pilha de cima para baixo (topo para base) → palavra invertida
    public String obterConteudoTopoParaBase() {
        StringBuilder sb = new StringBuilder();
        for (int i = topo; i >= 0; i--) {
            sb.append(pilha[i]);
        }
        return sb.toString();
    }
}

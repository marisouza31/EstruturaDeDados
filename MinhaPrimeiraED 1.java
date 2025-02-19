/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minhaprimeiraed;

/**
 * A classe MinhaPrimeiraED implementa uma estrutura de dados simples que
 * armazena objetos em um vetor. O vetor pode ser expandido automaticamente
 * quando estiver cheio. A classe permite adicionar, remover e buscar objetos
 * dentro do vetor.
 */
public class MinhaPrimeiraED {

    // Vetor inicial de objetos, com capacidade para armazenar até 10 elementos
    private Object[] objetos = new Object[10];  
    // Total de objetos atualmente armazenados no vetor
    private int totalDeObjetos = 0;  

    /**
     * Adiciona um objeto a uma posição específica no vetor.
     * Caso a posição já esteja ocupada, desloca os objetos à direita para
     * abrir espaço para o novo objeto.
     *
     * @param posicao A posição onde o objeto será adicionado.
     * @param objeto O objeto a ser adicionado.
     */
    public void adiciona(int posicao, Object objeto) {
        // Verifica se a posição fornecida é válida
        if (posicaoValida(posicao)) {
            // Se a posição estiver ocupada, desloca os objetos à direita
            if (posicaoOcupada(posicao)) {
                for (int i = totalDeObjetos; i > posicao; i--) {
                    objetos[i] = objetos[i - 1];
                }
            }
            // Adiciona o objeto na posição especificada
            objetos[posicao] = objeto;
            totalDeObjetos++;  // Incrementa o total de objetos
        }
    }

    /**
     * Adiciona um objeto ao final do vetor. Caso o vetor esteja cheio,
     * ele é expandido para o dobro de seu tamanho.
     *
     * @param objeto O objeto a ser adicionado.
     */
    public void adiciona(Object objeto) {
        // Verifica se o vetor está cheio
        if (totalDeObjetos == objetos.length) {
            // Cria um novo vetor com o dobro do tamanho
            Object[] novoVetor = new Object[objetos.length * 2];
            // Copia os elementos do vetor antigo para o novo vetor
            System.arraycopy(objetos, 0, novoVetor, 0, objetos.length);
            // Atualiza o vetor original para o novo vetor
            objetos = novoVetor;
        }
        // Adiciona o objeto na próxima posição disponível
        objetos[totalDeObjetos] = objeto;
        totalDeObjetos++;  // Incrementa o total de objetos
    }

    /**
     * Verifica se a posição fornecida está ocupada.
     * Uma posição é considerada ocupada se estiver dentro do limite e
     * contiver um objeto.
     *
     * @param posicao A posição a ser verificada.
     * @return true se a posição estiver ocupada, false caso contrário.
     */
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < totalDeObjetos;
    }

    /**
     * Verifica se a posição fornecida é válida.
     * Uma posição é válida se ela está dentro dos limites do vetor.
     *
     * @param posicao A posição a ser verificada.
     * @return true se a posição for válida, false caso contrário.
     */
    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao < objetos.length;
    }

    /**
     * Remove um objeto de uma posição específica do vetor.
     * Após a remoção, os objetos à direita são deslocados uma posição à esquerda
     * para preencher o espaço vazio.
     *
     * @param posicao A posição do objeto a ser removido.
     */
    public void remove(int posicao) {
        // Verifica se a posição está ocupada
        if (posicaoOcupada(posicao)) {
            // Desloca os objetos à esquerda, para preencher o espaço
            for (int i = posicao; i < totalDeObjetos - 1; i++) {
                objetos[i] = objetos[i + 1];
            }
            // Apaga o último objeto (já foi deslocado)
            objetos[totalDeObjetos - 1] = null;
            totalDeObjetos--;  // Decrementa o total de objetos
        }
    }

    /**
     * Verifica se um objeto está presente no vetor.
     * Realiza uma busca linear para encontrar o objeto.
     *
     * @param objeto O objeto a ser pesquisado.
     * @return true se o objeto for encontrado, false caso contrário.
     */
    public boolean contem(Object objeto) {
        // Percorre o vetor para verificar se o objeto está presente
        for (int i = 0; i < totalDeObjetos; i++) {
            if (objetos[i].equals(objeto)) {
                return true;
            }
        }
        return false;  // Retorna false se não encontrar o objeto
    }

    /**
     * Retorna o número total de objetos no vetor.
     *
     * @return O número de objetos armazenados.
     */
    public int tamanho() {
        return totalDeObjetos;
    }

    /**
     * Verifica se o vetor está cheio.
     * O vetor está cheio quando o total de objetos é igual ao tamanho do vetor.
     *
     * @return true se o vetor estiver cheio, false caso contrário.
     */
    public boolean vetorCheio() {
        return totalDeObjetos == objetos.length;
    }

    /**
     * Verifica se o vetor está vazio.
     * O vetor está vazio quando o total de objetos é igual a 0.
     *
     * @return true se o vetor estiver vazio, false caso contrário.
     */
    public boolean estaVazia() {
        return totalDeObjetos == 0;
    }

    /**
     * Exibe os objetos armazenados no vetor e suas respectivas posições.
     */
    public void mostrarVetor() {
        for (int i = 0; i < totalDeObjetos; i++) {
            System.out.println("Posição " + i + ": " + objetos[i]);
        }
    }

    /**
     * Método principal para testar a classe MinhaPrimeiraED.
     * Realiza operações de adição, remoção, busca e exibição dos objetos no vetor.
     *
     * @param args Argumentos passados pela linha de comando (não utilizado aqui).
     */
    public static void main(String[] args) {
        // Cria uma nova instância da classe MinhaPrimeiraED
        MinhaPrimeiraED lista = new MinhaPrimeiraED();

        // Testa se a lista está vazia
        System.out.println("A lista está vazia? " + lista.estaVazia());

        // Adiciona alguns objetos à lista
        lista.adiciona("Objeto 1");
        lista.adiciona("Objeto 2");
        lista.adiciona("Objeto 3");
        System.out.println("Lista após adições iniciais:");
        lista.mostrarVetor();

        // Testa o método contem() para verificar se um objeto existe na lista
        System.out.println("A lista contém 'Objeto 2'? " + lista.contem("Objeto 2"));

        // Adiciona um novo objeto em uma posição específica
        lista.adiciona(1, "Novo Objeto");
        System.out.println("Lista após adição em posição específica:");
        lista.mostrarVetor();

        // Remove um objeto da lista
        lista.remove(2);
        System.out.println("Lista após remoção:");
        lista.mostrarVetor();

        // Verifica o tamanho atual da lista
        System.out.println("Tamanho atual da lista: " + lista.tamanho());

        // Preenche o vetor até o limite e testa a expansão automática
        for (int i = 4; i <= 15; i++) {
            lista.adiciona("Objeto " + i);
        }
        System.out.println("Lista após adicionar mais elementos:");
        lista.mostrarVetor();

        // Verifica se o vetor está cheio
        System.out.println("O vetor está cheio? " + lista.vetorCheio());
    }
}

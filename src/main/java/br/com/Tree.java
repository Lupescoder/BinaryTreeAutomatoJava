package br.com;

public class Tree {
  Node root = null; // Raiz da árvore 

  public void insert(Island island) {
    root = insertRecursive(root, island); // Chama a função recursiva
  } 

  public Node insertRecursive(Node node, Island island) {
    if (node == null) {
      return new Node(island); // Cria um novo nó se a árvore estiver vazia
    }

    if (island.getIndex() < node.getIsland().getIndex()) {
      node.left = insertRecursive(node.left, island);// Chama a função recursiva para o filho esquerdo
    } else {
      node.right = insertRecursive(node.right, island);// Chama a função recursiva para o filho direito
    }

    return node;// Retorna o nó atual

  }

  public void move() throws InterruptedException {
    moveRecursive(root);// Chama a função recursiva
  }

  public boolean moveRecursive(Node node) throws InterruptedException {
    Thread.sleep(1000); // Adicionei um timing de 1s

    if (node == null) {
      return false;
    }

    System.out.println("Visitando a ilha : " + node.getIsland().getName());// Imprime o nome da ilha

    if (node.getIsland().hasTreasure()) { // Verifica se a ilha possui tesouro
                                                             
      System.out.println("Tesouro encontrado na ilha: " + node.getIsland().getName());
      System.exit(0);// Encerra o programa
    } else if (node.getIsland().isDeathIsland()) {// Verifica se a ilha é uma ilha de morte
      System.out.println("Parou na ilha da morte, você morreu !" + node.getIsland().getName());
      init("restart");// Reinicia o jogo
      return false;
    }

    boolean foundTreasure = moveRecursive(node.left);// Chama a função recursiva para o filho esquerdo
    if (!foundTreasure)
      foundTreasure = moveRecursive(node.right);// Chama a função recursiva para o filho direito

    return foundTreasure;// Retorna se o tesouro foi encontrado ou não
  }

  public void init(String type) throws InterruptedException {
    if (type == "restart")  System.out.println("\nReiniciando .....\n");// Reinicia o jogo
    
    root = null;
    insert(new Island(13, "Baia do Naufrágio"));
    insert(new Island(11, "Ilha dos Piratas"));
    insert(new Island(5, "Ilha do Dragão"));
    insert(new Island(7, "Ilha dos Peixes"));
    insert(new Island(3, "Ilha dos Contrabandistas"));
    insert(new Island(19, "Ilha da Caveira"));
    insert(new Island(23, "Ilha da Cobra"));// Insere as ilhas no árvore

    move();// Chama a função move()
  }


}
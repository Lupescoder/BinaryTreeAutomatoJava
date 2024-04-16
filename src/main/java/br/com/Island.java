package br.com;

import java.util.Random;

public class Island {
  private final int index;
  private final String name;
  private final boolean hasTreasure;
  private final boolean isDeathIsland;

  public Island(int index, String name) {
    this.index = index;
    this.name = name;

    Random random = new Random();
    // Criei um objeto Random para gerar números aleatórios.
    Random random2 = new Random();

    if (index != 11 && index != 13) {
      this.hasTreasure = random.nextBoolean();// Define a aleatoriamente a ilha com tesouro exeto a primeira e a segunda
      this.isDeathIsland = random2.nextBoolean();
      // Define aleatoriamente a ilha da morte exeto a primeira e a segunda
      
    } else {
      this.hasTreasure = false;// Define a ilha sem tesouro
      this.isDeathIsland = false;// Define a ilha sem morte
    }

  }

  public int getIndex() {
    return index;
  }

  public String getName() {
    return name;
  }

  public boolean hasTreasure() {
    return hasTreasure;
  }

  public boolean isDeathIsland() {
    return isDeathIsland;
  }

}
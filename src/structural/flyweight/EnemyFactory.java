package structural.flyweight;

import java.util.HashMap;

public class EnemyFactory {
    private static HashMap<String, Enemy> enemies = new HashMap<>();

    public static Enemy getEnemy(String type) {
        Enemy enemy = null;
        if (enemies.containsKey(type)) {
            enemy = enemies.get(type);
        } else {
            switch (type) {
                case "Private":
                    enemy = new Private();
                    System.out.println("Soldado");
                    break;
                case "Detective":
                    System.out.println("Detective");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("Te has equivocado");
            }
            enemies.put(type, enemy);

        }
        return enemy;
    }
}

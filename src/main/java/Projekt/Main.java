package Projekt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Block block1 = new BasicBlock("Red", "Brick");
        Block block2 = new BasicBlock("Blue", "Stone");
        Block block3 = new BasicBlock("Green", "Wood");

        List<Block> blocksList = Arrays.asList(block1, block2, block3);

        Wall wall = new Wall(blocksList);

        testFindBlockByColor(wall, "Red");
        testFindBlocksByMaterial(wall, "Stone");
        testCount(wall);
    }

    private static void testFindBlockByColor(Wall wall, String color) {
        Optional<Block> foundBlock = wall.findBlockByColor(color);
        if (foundBlock.isPresent()) {
            System.out.println("Block found by color " + color + ": " + foundBlock.get().getColor());
        } else {
            System.out.println("Block with color " + color + " not found.");
        }
    }

    private static void testFindBlocksByMaterial(Wall wall, String material) {
        List<Block> blocksByMaterial = wall.findBlocksByMaterial(material);
        System.out.println("Blocks found by material " + material + ": " + blocksByMaterial.size());
    }

    private static void testCount(Wall wall) {
        int count = wall.count();
        System.out.println("Total number of blocks: " + count);
    }

}

class BasicBlock implements Block {
    private String color;
    private String material;

    public BasicBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }
}

package Projekt;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Wall implements Structure, CompositeBlock {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    // Przeszukuje listę bloków w Wall i zwraca pierwszy blok o podanym kolorze, jeśli taki istnieje.
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    // Zwraca listę bloków zgodnych z podanym materiałem.
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }

    @Override
    //  Zwraca liczbę bloków
    public int count() {
        return blocks.size();
    }

    @Override
    // Zwraca wszystkie bloki przechowywane w Wall
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    // Zwracają kolor i materiał pierwszego bloku w Wall
    public String getColor() {
        if (!blocks.isEmpty()) {
            return blocks.get(0).getColor();
        }
        return "";
    }

    @Override
    public String getMaterial() {
        if (!blocks.isEmpty()) {
            return blocks.get(0).getMaterial();
        }
        return "";
    }
}
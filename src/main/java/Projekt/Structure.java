package Projekt;

import java.util.List;
import java.util.Optional;


// Interfejsy umieściłem w jednym pliku ze względu na krótki kod i przejrzystośc kodu.
// Gdyby projekt był bardziej rozbudowany a interfejsy posiadały więcej metod, umieściłbym je w osobnych plikach dla lepszej przejrzystości
public interface Structure {
    Optional<Block> findBlockByColor(String color);

    List<Block> findBlocksByMaterial(String material);

    int count();
}
interface Block {
    String getColor();
    String getMaterial();
}
interface CompositeBlock extends Block {
    List<Block> getBlocks();
}

package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();
        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        // Mon livre et mon album préférés
        mediatheque.addItem( new Book("Albert Camus", "L'Étranger"));
        mediatheque.addItem( new CD(10, "Random Access Memories"));
        mediatheque.printCatalog();
        //mediatheque.printOnlyBooks();
        //mediatheque.printOnlyCDs();
    }
}

package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	/** Fait visiter chaque item de la médiathèque par le visiteur v. */
	public void accept(Visitor v) {
		for (Item i : items)
			i.accept(v);
	}

	public void printCatalog() {
		accept(new CatalogPrinter());
	}

	public void printOnlyBooks() {
		accept(new BookPrinter());
	}

	public void printOnlyCDs() {
		accept(new CDPrinter());
	}

}

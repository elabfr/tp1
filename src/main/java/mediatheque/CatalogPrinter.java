package mediatheque;

/** Édition du catalogue complet : affiche tous les items. */
public class CatalogPrinter implements Visitor {
	@Override
	public void visit(Book book) {
		System.out.println(book);
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}

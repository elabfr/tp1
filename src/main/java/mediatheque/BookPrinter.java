package mediatheque;

/** Édition limitée aux livres : les CD sont ignorés. */
public class BookPrinter implements Visitor {
	@Override
	public void visit(Book book) {
		System.out.println(book);
	}

	@Override
	public void visit(CD cd) {
		// on n'affiche pas les CD
	}
}

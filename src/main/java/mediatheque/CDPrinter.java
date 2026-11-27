package mediatheque;

/** Édition limitée aux CD : les livres sont ignorés. */
public class CDPrinter implements Visitor {
	@Override
	public void visit(Book book) {
		// on n'affiche pas les livres
	}

	@Override
	public void visit(CD cd) {
		System.out.println(cd);
	}
}

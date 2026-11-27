package mediatheque;

/**
 * Visiteur du patron "Visitor" : une méthode visit() par classe concrète
 * de la structure de données (Book, CD).
 * Ajouter une nouvelle fonctionnalité = écrire un nouveau visiteur,
 * sans modifier Mediatheque, Item, Book ou CD.
 */
public interface Visitor {
	void visit(Book book);

	void visit(CD cd);
}

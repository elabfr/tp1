package mediatheque;

public abstract class Item {
	private String title;

	protected Item(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Accepte un visiteur. Chaque sous-classe appelle la méthode visit()
	 * qui lui correspond (double dispatch) : plus besoin de tester le type de l'item.
	 */
	public abstract void accept(Visitor v);

	@Override
	public String toString() {
		return title;
	}

}

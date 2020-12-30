import java.util.TreeSet;

public class Actor implements Comparable<Actor> {
	private final String name;
	private TreeSet<String> films;
	
	public Actor(String name, TreeSet<String> films) {
		this.name = name;
		this.films = films;
	}
	
	public String getName() {
		return this.name;
	}
	
	public TreeSet<String> getFilms() {
		return (TreeSet<String>) this.films.clone();
	}
	
	public void addFilm(String film) {
		this.films.add(film);
	}

	@Override
	public int compareTo(Actor o) {
		return this.name.compareTo(o.getName());
	}
	
}
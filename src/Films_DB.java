import java.util.Comparator;
import java.util.TreeSet;

public class Films_DB {
	private static class FilmsComparator implements Comparator<Film> {

		@Override
		public int compare(Film o1, Film o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	}
	private static TreeSet<Film> films = new TreeSet<Film>(new FilmsComparator());
	private static TreeSet<Actor> actors = new TreeSet<Actor>();
	
	private Films_DB() {
	}
	
	public static void addFilm(Film film) {
		if (!films.contains(film))
			films.add(film);
	}
	
	public static boolean removeFilm(Film film) {
		return films.remove(film);
	}
	
	public static void addActor(Actor actor) {
		if (!actors.contains(actor))
			actors.add(actor);
	}
	
	public static boolean removeActor(Actor actor) {
		return actors.remove(actor);
	}
	
	public static TreeSet<Film> getFilms() {
		return (TreeSet<Film>) films.clone();
	}
	
	public static TreeSet<Actor> getActors() {
		return (TreeSet<Actor>) actors.clone();
	}
} 
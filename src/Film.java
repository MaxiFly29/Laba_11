import java.util.TreeSet;

public class Film {
	private final String name;
	private final TreeSet<String> actors;
	
	public Film(String name, TreeSet<String> actors) {
		this.name = name;
		this.actors = actors;
	}
	
	public String getName() {
		return this.name;
	}
	
	public TreeSet<String> getActors() {
		return (TreeSet<String>) this.actors.clone();
	}
}
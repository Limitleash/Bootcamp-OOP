import java.util.Comparator;

public class NameComparator<T> implements Comparator<Participant>{

	@Override
	public int compare(Participant x, Participant y) {
		return x.getName().compareTo(y.getName());
	}
}

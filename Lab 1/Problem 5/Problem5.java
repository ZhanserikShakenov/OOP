import java.util.*;
public class Problem5 {
	static Vector<Gender> queue = new Vector<>();
	public static void main(String[] args) {
		
		Person p = new Person(Gender.MALE);
		kidnap(p);
		Person t = new Person(Gender.MALE);
		kidnap(t);
		Person b = new Person(Gender.FEMALE);
		kidnap(b);
		Person r = new Person(Gender.FEMALE);
		kidnap(r);		
		System.out.print(willDragonEatOrNot());
	}
	static void kidnap(Person p) {
		queue.add(p.gender);
		check();
	}
	static void check() {
			for(int i=1; i<queue.size(); i++) {  
				if(queue.elementAt(i) ==Gender.FEMALE && queue.elementAt(i-1) == Gender.MALE) {
					queue.removeElementAt(i);;
					queue.removeElementAt(i-1);
					i = 1;
					}
			}
	}
	static boolean willDragonEatOrNot() {
		if(queue.isEmpty()) {
			return false;
		}
		return true;
	}
}
	
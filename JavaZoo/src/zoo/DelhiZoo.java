package zoo;

import org.animals.Deer;
import org.animals.Giraffe;
import org.animals.Lion;
import org.animals.Monkey;
import org.animals.Tiger;

public class DelhiZoo {
	public static void main(String[] args) {
		Deer d=new Deer("golden", 30.0, 5);
		d.isVegetarian();
		d.canClimb();
		d.sound();
		System.out.println("---------------------------------");
		Tiger t=new Tiger("orange-black",35.0,7);
		t.isVegetarian();
		t.canClimb();
		t.sound();
		System.out.println("---------------------------------");
		Lion l=new Lion("yellow",40.0,8);
		l.isVegetarian();
		l.canClimb();
		l.sound();
		System.out.println("---------------------------------");
		Monkey m=new Monkey("cement",10.0,2);
		m.canClimb();
		m.isVegetarian();
		m.sound();
		System.out.println("---------------------------------");
		Giraffe g=new Giraffe("yelloe-red",40,4);
		g.canClimb();
		g.isVegetarian();
		g.sound();
	}
}

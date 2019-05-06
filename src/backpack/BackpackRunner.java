package backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
 Ruler r = new Ruler();
 Pencil p = new Pencil(); 
 Textbook t = new Textbook();
 Backpack b = new Backpack();
 b.putInBackpack(p);
p.write("Matt is weird lol");
 r.measure();
 t.read();
b.putInBackpack(r);
b.putInBackpack(t);
b.packAndCheck();
	}
}

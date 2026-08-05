package InfosisInterviewQuestions;
class Abcd {
    void add() {
        System.out.println("Hello");
    }
}



public class DynamicPolymoephism extends Abcd{
	@Override
    void add() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
//because of runtime polymorphism. The JVM calls the overridden method in DynamicPolymoephism.
        Abcd t = new DynamicPolymoephism();
        t.add();    // Output: Hi
        Abcd obj = new Abcd();
        obj.add();// Output: Hello
    }

	

}

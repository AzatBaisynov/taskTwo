import java.util.LinkedList;

public class Main {

    private static Object IllegalStateException;

    public static void main(String[] args) throws Throwable {
        LinkedList<Person> list = new LinkedList<>();
        list.add(new Person("O", "B", "Q"));
        list.add(new Person("T", "N", "T"));
        list.add(new Person("O", "B", "Q"));

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if (list.get(j).equals(list.get(i))){
                    System.err.println("Same");
                    throw (Throwable) IllegalStateException;
                }
            }
        }
    }
}

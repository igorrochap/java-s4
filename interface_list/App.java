package interface_list;

public class App {
    public static void main(String[] args) {
        String l[] = {"Um", "Dois", "Tres", "Quatro", "Cinco"};
        IListStr list = new List(l); 

        list.list();
    }
}

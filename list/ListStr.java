package list;

public abstract class ListStr {
    public abstract String first();
    public abstract String next();

    public void list(){
        String element = first();

        while(element != null){
            System.out.println(element);
            element = next();
        }
    }
}

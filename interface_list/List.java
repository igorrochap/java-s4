package interface_list;

public class List implements IListStr{
    private static int count;
    public String list[] = new String[5];

    public List(String list[]){
        this.list = list;
    }

    public String first(){
        count = 1;
        return this.list[0];
    }

    public String next(){
        if(count != 5){
            String element = this.list[count];
            count++;
            return element;
        }
        else{
            System.out.println("Todos os elementos da lista foram listados");
            count = 0;
        }
        
        return null;
    }

    public void list(){
        String element = first();

        while(element != null){
            System.out.println(element);
            element = next();
        }
    }
}

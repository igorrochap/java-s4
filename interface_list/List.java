package interface_list;

public class List implements IListStr{
    private static int count;
    public String list[] = new String[5];

    public List(String list[]){
        this.list = list;
    }

    public String first(){
        count = 0;
        return this.list[0];
    }

    public String next(){
        count++;
        
        if(count < this.list.length){
            String element = this.list[count];
            return element;
        }
        else{
            count = 0;
            System.out.println("Todos os elementos da lista foram listados");
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

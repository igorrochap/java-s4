package list;

public class List extends ListStr{
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
            System.out.println("Todos os elementos da lista foram listados");
            count = 0;
        }
        
        return null;
    }
}

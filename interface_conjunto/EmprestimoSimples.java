package interface_conjunto;

public class EmprestimoSimples implements IEmprestimo{
    private float s, j, p;
    private int n, corrente;  // s = valor da primeira parcela       
                             // n = numero de parcelas
                            // p = ṕarcela
                           // j = percentual de juros mensal
    
    public EmprestimoSimples(float s, int n, float j){
        this.s = s;
        this.n = n;
        this.j = j;
        corrente = 1;
        this.p = s;
    }
    
    public float proximaParcela(){
        int ret = 0;
        corrente++;

        if(corrente <= n){
            return p + (p * (j/100));
        }
        else{
            ret = 0;
        }
    
        return ret;
    }
}

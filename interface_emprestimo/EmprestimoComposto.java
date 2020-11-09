package interface_emprestimo;

public class EmprestimoComposto implements IEmprestimo{
    private float s, j, p;
    private int n, corrente;  // s = valor da primeira parcela       
                             // n = numero de parcelas
                            // p = ṕarcela
                           // j = percentual de juros mensal

    public EmprestimoComposto(float s, int n, float j){
        this.s = s;
        this.n = n;
        this.j = j;
        corrente = 1;
        this.p = s;
    }

    public float proximaParcela(){
        float ret = p;
        corrente++;
        
        if(corrente <= n)
            p = p + (p * j/100);
        else
            p = 0;

        return ret;
    }
}

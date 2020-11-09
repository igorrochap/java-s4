package interface_emprestimo;

public class App {
    public static void main(String[] args) {
        IEmprestimo emp1 = new EmprestimoSimples(200, 5, 1);
        IEmprestimo emp2 = new EmprestimoComposto(200, 5, 1);

        int i = 1;

        float pe1 = emp1.proximaParcela();
        float pe2 = emp2.proximaParcela();

        while(pe1 > 0 || pe2 > 0){
            if(pe1 > 0){
                System.out.println("Emprestimo simples com parcela numero " + i + " de: " + pe1);
            }
            if(pe2 > 0){
                System.out.println("Emprestimo composto com parcela numero " + i + " de: " + pe2);
            }

            pe1 = emp1.proximaParcela();
            pe2 = emp2.proximaParcela();
            i++;
        }
    }
}

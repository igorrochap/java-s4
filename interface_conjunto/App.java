//package interface_conjunto;

public class App {
    public static void main(String[] args) {
        int max = 10;
        ConjuntoEmprestimos cj = new ConjuntoEmprestimos(max);

        IEmprestimo emp1 = new EmprestimoSimples(200, 5, 1);
        IEmprestimo emp2 = new EmprestimoComposto(200, 5, 1);
        IEmprestimo emp3 = new EmprestimoSimples(100, 3, 4);
        IEmprestimo emp4 = new EmprestimoComposto(100, 3, 4);
        IEmprestimo emp5 = new EmprestimoSimples(500, 4, 2);
        IEmprestimo emp6 = new EmprestimoComposto(500, 4, 2);
        IEmprestimo emp7 = new EmprestimoSimples(250, 2, 3);
        IEmprestimo emp8 = new EmprestimoComposto(250, 2, 3);
        IEmprestimo emp9 = new EmprestimoSimples(350, 6, 5);
        IEmprestimo emp10 = new EmprestimoComposto(350, 6, 5);

        cj.add(emp1);
        cj.add(emp2);
        cj.add(emp3);
        cj.add(emp4);
        cj.add(emp5);
        cj.add(emp6);
        cj.add(emp7);
        cj.add(emp8);
        cj.add(emp9);
        cj.add(emp10);

        cj.proximasParcelas();
    } 
}

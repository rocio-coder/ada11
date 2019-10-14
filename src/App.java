public class App {
    public static void main(String[] args) {

        Result res= new Result();
        Arithmetic ar = new Arithmetic();
        int a=3, b=6;

        ar.sum(res,a,b);
        ar.division(res, a,b);
        ar.multiplication(res, a,b);
        ar.subtraction(res, a ,b);

        System.out.println(res.getResultmult());
    }
}

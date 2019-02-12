public class Square  implements FunctionalInterface {


    public static void main(String args[]){
        int n=5;
        FunctionalInterface f=(int x)->x*x;
        int result= f.square(n);
        System.out.println(result);

    }

    @Override
    public int square(int x) {
        return 0;
    }
}

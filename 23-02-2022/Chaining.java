public class Chaining {

    public Chaining(){
        System.out.println("inside no argument constructor");

    }

    public Chaining(String s) {

        this();
        System.out.println(s);



    }

    public Chaining(String s1 , String s2 ){

        this("inside single argument constructor");
        System.out.println(s1+s2);


    }

    public static void main(String[] args) {


        new Chaining("inside ","double argument constructor");

    }



}
public class Dogexample2
{
        private String name;

        public Dogexample2(String name)
        {
            this.name = name;
        }

        public boolean equals(Object other)
        {
            Dogexample2 d1 = (Dogexample2) other;
            return this.name.equals(d1.name);
        }

        public static void main(String[] args)
        {
            Dogexample2 d1 = new Dogexample2("Rufus");
            Dogexample2 d2 = new Dogexample2("Sally");
            Dogexample2 d3 = new Dogexample2("Rufus");
            Dogexample2 d4 = d3;
            System.out.println(d1.equals(d2));
            System.out.println(d2.equals(d3));
            System.out.println(d1.equals(d3));
            System.out.println(d3.equals(d4));
        }
}


public class Soccer extends  Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );

    }

    public static void main(String[] args) {

         Sports sport = new Sports();
        System.out.println(sport.getName());
        sport.getNumberOfTeamMembers();
        sport = new Soccer();
        System.out.println(sport.getName());
        sport.getNumberOfTeamMembers();
    }

}

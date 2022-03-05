public class Animal {
    private String voice;

    public Animal(String voice) {
        this.voice = voice;
    }

    public void speak(){
        System.out.println(voice);
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public static void main(String[] args) {

        Animal dog = new Animal("hoof");
        Animal cat = new Animal("meow");
        Animal cow = new Animal("moo");
        Animal elephant = new Animal("trumpet");

        dog.speak();
        cat.speak();
        cow.speak();
        elephant.speak();



    }
}

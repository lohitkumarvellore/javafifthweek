import java.util.Scanner;
class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
    }
}
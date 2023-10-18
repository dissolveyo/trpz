import Entities.TextFile;

public class Main {
    public static void main(String[] args) {
        System.out.println(System.getenv("PASSWORD"));
        TextFile zxc = new TextFile("zxc", "zxc", "zxc");

        System.out.println(zxc.toString());
    }
}
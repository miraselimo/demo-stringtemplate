import org.stringtemplate.v4.*;

public class Hello {
    public static void main(String[] args) {
        ST hello = new ST("Hello, <name>");
        hello.add("name", "world");
        System.out.println(hello.render());
    }
}

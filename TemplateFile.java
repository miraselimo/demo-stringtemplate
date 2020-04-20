import org.stringtemplate.v4.*;

public class TemplateFile {
    public static void main(String[] args) {
        STGroup group  = new STGroupFile("templates/email.stg");
        ST st = group.getInstanceOf("body");

        st.add("fromaddress", "exa@example.com");
        st.add("toaddress", "max@example.com");
        st.add("to", "exa");

        System.out.println(st.render());

        ST st1 = group.getInstanceOf("signature");
        st1.add("from", "max");

        System.out.println(st1.render());
    }
}

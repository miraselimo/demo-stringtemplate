import org.stringtemplate.v4.*;

public class TemplateFile {
    STGroup group  = new STGroupDir("templates");
    ST st = group.getInstanceOf("email.stg");
}

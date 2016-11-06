package JavaOOP.Lesson5.Composition;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public class CompositionSample {

    public static void main(String[] args) {
        Document document = new Document(new Header1(), new Body2());
        System.out.println(document.getDocument());
    }
}

interface Content {
    String build();
}

interface Header extends Content {
    // some methods
}

interface Body extends Content{
    // some methods
}

class Document {

    private Header header;
    private Body body;

    public Document(Header header, Body body) {
        this.header = header;
        this.body = body;
    }

    public String getDocument() {
        return header.build() + "\n" + body.build();
    }
}

class Body1 implements Body {
    @Override
    public String build() {
        return "Body 1";
    }
}

class Body2 implements Body {
    @Override
    public String build() {
        return "Body 2";
    }
}

class Header1 implements Header {
    @Override
    public String build() {
        return "Header 1";
    }
}

class Header2 implements Header {
    @Override
    public String build() {
        return "Header 2";
    }
}

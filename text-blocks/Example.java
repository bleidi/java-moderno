public class Example {

    public static void main(String[] args) {
        var texto = """
            

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce condimentum dui ut ultricies faucibus. Morbi elementum varius malesuada. Phasellus at lectus semper, rutrum massa at, efficitur eros. Morbi dapibus odio dui, sed posuere neque imperdiet in. Phasellus eleifend elit ut vestibulum rutrum. Suspendisse sed varius nulla, ut feugiat dolor. Nunc ullamcorper sagittis nisi sit amet rutrum. Nullam tempor, tellus vitae luctus posuere, nunc diam finibus mauris, ac tempus risus nunc lobortis augue. Donec sem tellus, lobortis accumsan lobortis eu, gravida tincidunt risus.

Phasellus sagittis urna sit amet posuere congue. Suspendisse ornare pretium purus, et pellentesque lectus vehicula nec. Duis semper pretium hendrerit. Sed et sem eget nulla hendrerit varius. Morbi tellus lorem, aliquam nec felis consequat, rhoncus sodales lorem. Nulla interdum nibh at ex mattis dapibus. Phasellus posuere risus vehicula fermentum convallis. Morbi commodo risus sit amet consectetur posuere. 
            """;


            var json = """
                {
                    "glossary": {
                        "title": "example glossary",
                        "GlossDiv": {
                            "title": "S",
                            "GlossList": {
                                "GlossEntry": {
                                    "ID": "SGML",
                                    "SortAs": "SGML",
                                    "GlossTerm": "Standard Generalized Markup Language",
                                    "Acronym": "SGML",
                                    "Abbrev": "ISO 8879:1986",
                                    "GlossDef": {
                                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
                                        "GlossSeeAlso": ["GML", "XML"]
                                    },
                                    "GlossSee": "markup"
                                }
                            }
                        }
                    }
                }
                    """;


        // System.out.println(texto);
            System.out.println(json);
    }

  
    
}

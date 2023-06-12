package sealed;

public class Example {
    
    sealed interface Animal permits Cachorro, Gato {
    }

    static final class Cachorro implements Animal {

        public String late() {
            return "🐶";
        }

    }

    static class Gato implements Animal {

        public String mia() {
            return "🐱";
        }
    }

    static final class Passaro implements Animal {

    }

    public static void main(String[] args) {
        System.out.println(new Passaro());
    }
    
}

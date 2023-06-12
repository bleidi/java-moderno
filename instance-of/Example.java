public class Example {

    interface Animal {
    }

    static class Cachorro implements Animal {

        public String late() {
            return "🐶";
        }

    }

    static class Gato implements Animal {

        public String mia() {
            return "🐱";
        }
    }

    public static String antigo(Animal animal) {

        if (animal instanceof Gato) {
            Gato gato = (Gato) animal;
            return gato.mia();
        } else if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            return cachorro.late();
        }

        return "💔";
    }

    public static String novo(Animal animal) {

        if (animal instanceof Gato gato) {
            return gato.mia();
        } else if (animal instanceof Cachorro cachorro) {
            return cachorro.late();
        }

        return "💔";
    }


    public static void main(String[] args) {
        System.out.println(novo(new Gato()));
    }
    
}

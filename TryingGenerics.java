public class TryingGenerics {
    /**
     * Represents a pair of two values with generic types.
     * @param <F> Type of `first`
     * @param <S> Type of `second`
     */
    static class Pair<F, S> {
        public F first;
        public S second;

        /**
         * Initializes the `Pair` with `null` values
         */
        public Pair() {
            this.first = null;
            this.second = null;
        }

        /**
         * Initializes the `Pair` with supplied `first` and `second` values
         * @param first First value
         * @param second Second value
         */
        public Pair(final F first, final S second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object obj) {
            // If `obj` is not an instance of
            // `Pair`, return `false`
            if (!(obj instanceof Pair<?, ?> obj2))
                return false;

            // If `obj` is indeed an instance
            // of `Pair`, compare the `first`
            // and `second` data members of both
            // this object and `obj`, by comparing
            // by references and using `equals`
            return (first == obj2.first || first.equals(obj2.first)) && (second == obj2.second || second.equals(obj2.second));
        }

        @Override
        public String toString() {
            return "Pair(" + first + ", " + second + ")";
        }
    }

    public static void main(String[] args) {
        final Pair<Integer, String> intStrPair = new Pair<>();
        intStrPair.first = 10;
        intStrPair.second = "Ten";

        System.out.println(intStrPair);

        final Pair<Double, Double> coordinates = new Pair<>(1.2, 3.4);
        System.out.println(coordinates);

        final Pair<Integer, String> intStrPair2 = new Pair<>(10, "ten");
        System.out.println(intStrPair2.equals(intStrPair));

        intStrPair2.second = "Ten";
        System.out.println(intStrPair2.equals(intStrPair));
    }
}

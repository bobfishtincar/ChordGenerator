public class ChordGenerator {

    public enum Flavor {Major, Minor, Dominant, Diminished, HalfDiminished};

    private class Chord {

        private int note;
        private Flavor flavor;
        private int rando;
        private static final int MAX_VALUE = 1000;

        public Chord(int note, Flavor flavor) {
            this.note = note;
            this.flavor = flavor;
            this.rando = (int) Math.random() * MAX_VALUE;
        }

        public Chord next() {

            switch (flavor) {

                case Major:
                    return nextMajor();

                case Minor:
                    return null;

                case Dominant:
                    return null;

                case Diminished:
                    return null;

                case HalfDiminished:
                    return null;

                default:
                    return null;
            }

        }

        private Chord nextMajor() {

            int numNext = 8;

            switch (rando % numNext) {

                case 0:
                    return new Chord(note, Flavor.Minor);

                case 1:
                    return new Chord(note, Flavor.Dominant);

                default:
                    return null;
            }

        }

    }

}

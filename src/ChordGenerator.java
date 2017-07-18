public class ChordGenerator {

    enum Flavor {Major, Minor, Dominant, Diminished};

    private class Chord {

        private int note;
        private Flavor flavor;

        Chord(int note, Flavor flavor) {
            this.note = note;
            this.flavor = flavor;
        }

        Chord next() {

            switch (flavor) {

                case Major:
                    return nextMajor();

                case Minor:
                    return null;

                case Dominant:
                    return null;

                case Diminished:
                    return null;

                default:
                    return null;
            }

        }

        private int modNote(int note) {
            return note % 12;
        }

        private Chord nextMajor() {

            // assume C major
            // C
            // C#
            // D
            // D#
            // E
            // F
            // F#
            // G
            // G#
            // A min
            // A#
            // B

            int rando = 8;

            switch (rando) {

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

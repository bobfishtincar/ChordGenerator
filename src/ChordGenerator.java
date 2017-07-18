public class ChordGenerator {

    enum Flavor {Major, Minor, Dominant, Diminished};

    private class Chord {

        private int note;
        private Flavor flavor;

        Chord(int note, Flavor flavor) {
            this.note = modNote(note);
            this.flavor = flavor;
        }

        Chord next() {

            switch (flavor) {

                case Major:
                    return nextMajor();

                case Minor:
                    return nextMinor();

                case Dominant:
                    return nextDominant();

                case Diminished:
                    return nextDiminished();

                default:
                    return null;
            }

        }

        private int modNote(int note) {
            return note % 12;
        }

        private Chord nextMajor() {

            // assume C major
            // 0 C Min
            // 1 C#
            // 2 D Min
            // 3 D#
            // 4 E Min
            // 5 F Maj, F Dom
            // 6 F#
            // 7 G Dom
            // 8 G# Dim
            // 9 A min
            // 10 A#
            // 11 B

            int rando = (int) (Math.random() * 8);

            switch (rando) {

                case 0:
                    return new Chord(note, Flavor.Minor);

                case 1:
                    return new Chord(note + 2, Flavor.Minor);

                case 2:
                    return new Chord(note + 4, Flavor.Minor);

                case 3:
                    return new Chord(note + 5, Flavor.Major);

                case 4:
                    return new Chord(note + 5, Flavor.Dominant);

                case 5:
                    return new Chord(note + 7, Flavor.Dominant);

                case 6:
                    return new Chord(note + 8, Flavor.Diminished);

                case 7:
                    return new Chord(note + 9, Flavor.Minor);

                default:
                    return null;
            }

        }

        private Chord nextMinor() {
            // assume C minor
            // 0 C
            // 1 C#
            // 2 D
            // 3 D#
            // 4 E
            // 5 F Dom, F Min
            // 6 F#
            // 7 G
            // 8 G#
            // 9 A Dim
            // 10 A#
            // 11 B Dom

            int rando = (int) (Math.random() * 4);

            switch (rando) {

                case 0:
                    return new Chord(note + 5, Flavor.Dominant);

                case 1:
                    return new Chord(note + 5, Flavor.Minor);

                case 2:
                    return new Chord(note + 9, Flavor.Diminished);

                case 3:
                    return new Chord(note + 11, Flavor.Dominant);

                default:
                    return null;
            }

        }

        private Chord nextDominant() {

            // assume C dominant
            // 0 C
            // 1 C#
            // 2 D
            // 3 D#
            // 4 E
            // 5 F Maj
            // 6 F# Dom
            // 7 G Dom, G Min
            // 8 G#
            // 9 A
            // 10 A#
            // 11 B Min

            int rando = (int) (Math.random() * 5);

            switch (rando) {

                case 0:
                    return new Chord(note + 5, Flavor.Major);

                case 1:
                    return new Chord(note + 6, Flavor.Dominant);

                case 2:
                    return new Chord(note + 7, Flavor.Dominant);

                case 3:
                    return new Chord(note + 7, Flavor.Minor);

                case 4:
                    return new Chord(note + 11, Flavor.Minor);

                default:
                    return null;
            }

        }

        private Chord nextDiminished() {
            // assume C diminished
            // 0 C
            // 1 C# Maj
            // 2 D Min
            // 3 D#
            // 4 E
            // 5 F Min
            // 6 F#
            // 7 G
            // 8 G# Min
            // 9 A
            // 10 A#
            // 11 B Min

            int rando = (int) (Math.random() * 5);

            switch (rando) {

                case 0:
                    return new Chord(note + 1, Flavor.Major);

                case 1:
                    return new Chord(note + 2, Flavor.Minor);

                case 2:
                    return new Chord(note + 5, Flavor.Minor);

                case 3:
                    return new Chord(note + 8, Flavor.Minor);

                case 4:
                    return new Chord(note + 11, Flavor.Minor);

                default:
                    return null;
            }
        }

    }


}

package Random;

/**
* Created by blinky on 21.01.15.
*/

    public abstract class Bookstore implements Readable {
        protected String sentences;
        protected int wordCount;

        public Bookstore() {
        }

        public Bookstore(String sentences, int wordCounter) {
            this.sentences = sentences;
            this.wordCount = wordCounter;
        }

        public String getSentences() {
            return sentences;
        }

        public void setSentences(String sentences) {
            this.sentences = sentences;
        }

        public int getWordCounter() {
            return wordCount;
        }

        public void setWordCounter(int wordCounter) {
            this.wordCount = wordCounter;
        }

        @Override
        public void read(int text) {

            String separator = text.split(" |!|,|\\.|\\?");
            int counter = 0;
            for (int i = 0; i < separator.length; i++) counter++;
            setWordCounter(counter);
            System.out.println("\n\the words nubmer is:"
                    + getWordCounter());
        }
    }

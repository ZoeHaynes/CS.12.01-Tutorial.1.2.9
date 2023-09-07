import java.util.ArrayList;

public class WordPairList {

    private ArrayList<WordPair> allPairs;


    public WordPairList(String[] words) {
        this.allPairs = new ArrayList<>();
        for(int i = 0; i<words.length-1; i++){
            for(int j = i+1; j<words.length;j++) {
                WordPair pair = new WordPair(words[i], words[j]);
                allPairs.add(pair);

            }

        }


    }

    public ArrayList<WordPair> getAllPairs(){
        return allPairs;
    }

    public int numMatches() {
        int numMatches = 0;
        for(int i=0;i<allPairs.size();i++){
            if(allPairs.get(i).getFirst()==allPairs.get(i).getSecond()){
                numMatches++;
            }
        }

        return numMatches;


    }
}
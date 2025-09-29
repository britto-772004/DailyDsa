package leetcode;

import java.util.List;

public class CountItems1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int rowlength = items.size();
        

        int i=-1;

        if(ruleKey.equals("type")){
            i = 0;
        }
        else if(ruleKey.equals("color")){
            i=1;
        }
        else{
            i=2;
        }

        int output = 0;

        for(int j=0;j<rowlength;j++){
            if(items.get(j).get(i).equals(ruleValue)){
                output++;
            }
        }

        return output;
    }
}

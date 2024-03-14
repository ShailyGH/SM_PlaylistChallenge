package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList)
    {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection)
    {
        //Create an arrayList from the playList string array
        ArrayList<String> musicSelections = new ArrayList<String>(Arrays.asList(this.playList));

        // count the number of forward (down) action by calculating song selection index - starting song index
        int numberOfForwardPress = Math.abs(musicSelections.indexOf(selection) - startIndex);
        // count the number of backward (up) action by calculating playlist size + starting index - song selection last index
        int numberOfBackwardPress = Math.abs((musicSelections.size() + startIndex) - musicSelections.lastIndexOf(selection));
        // Use Math minimum function to find out which action (up or down) gets user reach to the selected song
        return Math.min(numberOfForwardPress, numberOfBackwardPress);
    }
}

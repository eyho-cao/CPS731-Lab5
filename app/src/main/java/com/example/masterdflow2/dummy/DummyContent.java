package com.example.masterdflow2.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

   // private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1","Photos"));
        addItem(new DummyItem("2","tour"));
        addItem(new DummyItem("3","Website","https://www.bikebarge.com"));
        // Add some sample items.
      //  for (int i = 1; i <= COUNT; i++) {
       //     addItem(createDummyItem(i));
       // }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

   // private static DummyItem createDummyItem(int position) {
   //     return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position), website_url);
   // }

   // private static String makeDetails(int position) {
    //    StringBuilder builder = new StringBuilder();
    //    builder.append("Details about Item: ").append(position);
    //    for (int i = 0; i < position; i++) {
    //        builder.append("\nMore details information here.");
    //    }
    //    return builder.toString();
   // }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public  String id;
        public  String content;
        public  String website_name;
        public  String website_URL;

        public DummyItem(String id, String content) {
            this.id = id;
            this.content = content;
        }
        public DummyItem(String id, String website_name, String website_url) {
            this.id = id;
            content = website_name;
            this.website_name = website_name;
            website_URL = website_url;
        }


        @Override
        public String toString() {
            return content;
        }
    }
}
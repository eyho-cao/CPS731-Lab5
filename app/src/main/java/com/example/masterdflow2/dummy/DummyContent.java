package com.example.masterdflow2.dummy;

import android.text.Html;

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
    private static ArrayList<String>recipeTitle = new ArrayList<>();
    private static ArrayList<String> mURLList = new ArrayList<>();
    private static String recipeDesc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sollicitudin porttitor fermentum. Suspendisse id magna finibus, molestie felis aliquet, pellentesque diam. Nullam elit justo, lobortis id lectus nec, dictum iaculis felis.";

    static {
        initArrays();
        int numItems = recipeTitle.size();
        for(int i = 0; i < numItems; i++) {
            addItem(new DummyItem(Integer.toString(i), Html.fromHtml(recipeTitle.get(i)) +"\n" +recipeDesc));
        }

        // Add some sample items.
      //  for (int i = 1; i <= COUNT; i++) {
       //     addItem(createDummyItem(i));
       // }
    }

    private static void initArrays()
    {
        recipeTitle.add("Mac & Cheese");
        recipeTitle.add("Kale/Lemon Sandwiches");
        recipeTitle.add("Mango-Lime Bean Salad");
        recipeTitle.add("Sweet  Potato and Lentil Soup w/ Shiitake Mushrooms");
        recipeTitle.add("Lorem Ipsum");
        recipeTitle.add("Lorum more Ipsum");
        recipeTitle.add("Lorem some more Ipsum");
        recipeTitle.add("I dont know what im doing now");
        recipeTitle.add("some more filler");
        recipeTitle.add("There aint nothin else here my guy");
        recipeTitle.add("There aint nothin else here my guy");
        recipeTitle.add("There aint nothin else here my guy");
        recipeTitle.add("There aint nothin else here my guy");
        recipeTitle.add("There aint nothin else here my guy");
        recipeTitle.add("There aint nothin else here my guy");

        /*
        mURLList.add("https://celebratingsweets.com/wp-content/uploads/2016/03/Guinness-Irish-Cheddar-Macaroni-and-Cheese-2-500x500.jpg");
        mURLList.add("https://freshforkmarket.com/wp-content/uploads/2015/05/kale_lemon_sandwiches_2.jpg");
        mURLList.add("https://healthyfitnessmeals.com/wp-content/uploads/2018/04/mango-black-bean-salad-2.jpg");
        mURLList.add("https://vegan-magazine.com/wp-content/uploads/2012/04/Lentil-sweet-potato-soup.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
        mURLList.add("https://storcpdkenticomedia.blob.core.windows.net/media/recipemanagementsystem/media/recipe-media-files/recipes/retail/x17/18134-five-star-chocolate-chip-cookies-760x580.jpg?ext=.jpg");
    */
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


        @Override
        public String toString() {
            return content;
        }
    }
}
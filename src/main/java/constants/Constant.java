package constants;

import java.util.Arrays;
import java.util.List;

public class Constant {
    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls {
        public static final String MAIN_PAGE_URL = "https://hookupdate.net/";
        public static final String REVIEW_CATEGORY_URL = "https://hookupdate.net/reviews/";
        public static final String REVIEW_CATEGORY_SECOND_PAGE_URL = "https://hookupdate.net/reviews/page/2/";
        public static final String REVIEW_PAGE_URL = "https://hookupdate.net/tenderfling-review/";
        public static final String QUIZ_PAGE_URL = "https://hookupdate.net/quiz/";
        public static final String ESCORT_PAGE_URL = "https://hookupdate.net/escort-index/";
        public static final String BLOG_CATEGORY_URL = "https://hookupdate.net/blog/";
        public static final String BLOG_CATEGORY_SECOND_URL = "https://hookupdate.net/blog/page/2/";
        public static final String BLOG_PAGE_URL = "https://hookupdate.net/tinder-bio-lines-for-guys/";
        public static final String SUGAR_DADDIES_PAGE_URL = "https://hookupdate.net/sugar-daddies-uk/";
        public static final String LOCAL_HOOKUP_URL = "https://hookupdate.net/local-hookup/";
        public static final String CONTACT_US_PAGE_URL = "https://hookupdate.net/contact-us/";
    }

    public static class Header {
        public static final List<String> HEADER_TITLES = Arrays.asList(
                "dating",
                "Escort",
                "Blog",
                "Hookup"
        );
        public static final int NUMBER_OF_GOOD_HEADER_BUTTONS = 4;

        public static final List<String> LANGUAGE_URLS = Arrays.asList(
                "/fr/",
                "/de/",
                "/it/",
                "/es/",
                "/pl/",
                "/cs/",
                "/nl/",
                "/tr/",
                "/ro/",
                "/no/"
        );
        public static final int MAX_AMOUNT_LANGUAGE_CHANGE_BUTTONS = 10;
    }

    public static class Footer {
        public static final List<String> FOOTER_TITLES = Arrays.asList(
                "hookupdate.net",
                "Dating",
                "Sites",
                "Review",
                "Hookupdate.net",
                "dating",
                "OkCupid",
                "About Us"
        );
        public static final int NUMBER_OF_GOOD_FOOTER_BUTTONS = 49;
    }

    public static class Reg {
        public static final List<String> REG_TITLES = Arrays.asList(
                "BeNaughty",
                "Flirt",
                "OneNightFriend",
                "flirtyamateurs.com",
                "Flirtymature",
                "Together2Night",
                "localcrush.co.uk",
                "Together2night.com",
                "This Site Contains Photos of Beautiful Women",
                "WeMeetToday.com",
                "NaughtyDate",
                "MeetWild",
                "BigoFun",
                "Best dating worldwide",
                "Dating Site ONLINE",
                "Jucydate",
                "Craigslist",
                "Exciting talks and flirting with hot girls!",
                "Exciting chats with hot women",
                "Casualdating",
                "Loveeto.com",
                "Find the one who's right for you",
                "BeSexcited",
                "My Dirty Neighbour",
                "Online Hookups",
                "naughty-hub.com",
                "Dream Singles"
        );
        public static final int NUMBER_OF_DOWNLOAD_APP_REG_BUTTONS = 5;
        public static final int NUMBER_OF_VISIT_SITE_REG_BUTTONS = 24;
        public static final int NUMBER_OF_PICTURE_REG_BUTTONS = 3;
        public static final int NUMBER_OF_VISIT_SITE_REG_BUTTONS_SUGAR_DADDIES_PAGE = 3;
        public static final int NUMBER_OF_VISIT_SITE_REG_BUTTONS_IN_TOP_SITES_FOR_SUGAR_DATING_SUGAR_DADDIES_PAGE = 5;
        public static final int NUMBER_OF_SEND_MESSAGE_REG_BUTTONS_SUGAR_DADDIES_PAGE = 6;
        public static final int NUMBER_OF_VISIT_SITE_REG_BUTTONS_LOCAL_HOOKUP_PAGE = 5;
        public static final int NUMBER_OF_VISIT_SITE_IN_TEXT_REG_BUTTON = 5;
    }

    public static class Reviews {

        public static final List<String> REVIEW_TITLES = Arrays.asList(
                "Review",
                "review",
                "Dating",
                "Guide",
                "Tinder",
                "Date",
                "eHarmony",
                "Best Hinge",
                "Match.com",
                "Zoosk",
                "Hookup",
                "Erotic",
                "Sugar",
                "Men",
                "BDSM",
                "hookups",
                "sexual life"
        );
        public static final List<String> AUTHORS_TITLES = Arrays.asList(
                "Samantha",
                "Hana",
                "Veronica"
        );
        public static final List<String> CITIES_TITLES = Arrays.asList(
                "Aberdeen",
                "Birmingham",
                "Bournemouth",
                "Bristol",
                "Cardiff",
                "Edinburgh",
                "Glasgow",
                "Leeds",
                "Liverpool",
                "London",
                "Manchester",
                "Oxford",
                "Sheffield",
                "York"
        );
        public static final int NUMBER_OF_READ_REVIEW_BUTTONS_MAIN_PAGE = 5;
        public static final int NUMBER_OF_READ_ARTICLE_BUTTONS_MAIN_PAGE = 3;
        public static final int NUMBER_OF_READ_REVIEW_BUTTONS_REVIEW_CATEGORY = 24;
        public static final int NUMBER_OF_TYPES_OF_RELATIONSHIPS_BUTTONS_REVIEW_PAGE = 2;
        public static final int NUMBER_OF_LATEST_REVIEW_BUTTONS = 5;
        public static final int NUMBER_OF_BLOG_POST_BUTTONS_BLOG_CATEGORY = 24;
        public static final int NUMBER_OF_TOP_POST_BLOG_BUTTONS_BLOG_CATEGORY = 5;
        public static final int NUMBER_OF_TOP_POST_BUTTONS_BLOG_CATEGORY = 5;
        public static final int NUMBER_OF_TOP_POST_BLOG_BUTTONS_BLOG_PAGE = 4;
        public static final int NUMBER_OF_TOP_POST_BUTTONS_BLOG_PAGE = 4;
        public static final int NUMBER_OF_FIND_SUGAR_CITIES_SUGAR_DADDIES_PAGE = 14;
        public static final int NUMBER_OF_READ_REVIEW_SUGAR_DADDIES_PAGE = 3;
        public static final int NUMBER_OF_READ_FULL_REVIEW_SUGAR_DADDIES_PAGE = 5;
        public static final int NUMBER_OF_READ_FULL_REVIEW_LOCAL_HOOKUP_PAGE = 5;
        public static final int NUMBER_OF_ARTICLES_LOCAL_HOOKUP_PAGE = 20;
        public static final int NUMBER_OF_RED_REVIEW_LOCAL_HOOKUP_PAGE = 5;
    }

    public static class Common {
        public static final int NUMBER_OF_FAQ_COLLAPSE_BUTTONS = 4;
    }

    public static class CommentForm {
        public static final String NAME = "TestTest123";
        public static final String EMAIL = "testtest123@gmail.com";
        public static final String SUBJECT = "TestTest123";
        public static final String COMMENT = "TesttestTesttest123";
        public static final String EMPTY = "";
        public static final int NUMBER_OF_ERROR_MESSAGE = 3;
    }
}

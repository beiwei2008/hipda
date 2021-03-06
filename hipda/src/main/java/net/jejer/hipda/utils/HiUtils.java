package net.jejer.hipda.utils;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;

import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.typeface.IIcon;

import net.jejer.hipda.R;
import net.jejer.hipda.bean.Forum;
import net.jejer.hipda.bean.HiSettingsHelper;
import net.jejer.hipda.ui.HiApplication;

public class HiUtils {
    public static final String UserAgentPrefix = "net.jejer.hipda ";

    public static final String BaseUrl = "http://www.hi-pda.com/forum/";
    public static final String ImageBaseUrl = "http://img.hi-pda.com/forum/";
    public static final String AvatarBaseUrl = ImageBaseUrl + "uc_server/data/avatar/";
    public final static String SmiliesBaseUrl = ImageBaseUrl + "images/smilies/";
    public static final String CookieDomain = "hi-pda.com";
    public static final String AvatarSuffix = "_avatar_middle.jpg";
    public static final String NewPMImage = "images/default/notice_newpm.gif";

    public static final String ThreadListUrl = BaseUrl + "forumdisplay.php?fid=";
    public static final String DetailListUrl = BaseUrl + "viewthread.php?tid=";
    public static final String ReplyUrl = BaseUrl + "post.php?action=reply&tid=";
    public static final String EditUrl = BaseUrl + "post.php?action=edit";
    public static final String NewThreadUrl = BaseUrl + "post.php?action=newthread&fid=";
    public static final String MyReplyUrl = BaseUrl + "my.php?item=posts";
    public static final String MyPostUrl = BaseUrl + "my.php?item=threads";
    public static final String LastPageUrl = BaseUrl + "redirect.php?goto=lastpost&from=fastpost&tid=";
    public static final String RedirectToPostUrl = BaseUrl + "redirect.php?goto=findpost&pid={pid}&ptid={tid}";
    public static final String GotoPostUrl = BaseUrl + "gotopost.php?pid={pid}";
    public static final String SMSUrl = BaseUrl + "pm.php?filter=privatepm";
    public static final String SMSDetailUrl = BaseUrl + "pm.php?daterange=5&uid=";
    public static final String SMSPreparePostUrl = BaseUrl + "pm.php?daterange=1&uid=";
    public static final String SMSPostByUid = BaseUrl + "pm.php?action=send&pmsubmit=yes&infloat=yes&inajax=1&uid={uid}";
    public static final String SMSPostByUsername = BaseUrl + "pm.php?action=send&pmsubmit=yes&infloat=yes&inajax=1";
    public static final String ThreadNotifyUrl = BaseUrl + "notice.php?filter=threads";
    public static final String CheckSMS = BaseUrl + "pm.php?checknewpm";
    public static final String NewSMS = BaseUrl + "pm.php?filter=newpm";
    public static final String ClearSMS = BaseUrl + "pm.php?action=del&uid={uid}&filter=privatepm";
    public static final String UploadImgUrl = BaseUrl + "misc.php?action=swfupload&operation=upload&simple=1&type=image";
    public static final String SearchTitle = BaseUrl + "search.php?srchtype=title&searchsubmit=true&st=on&srchuname=&srchfilter=all&srchfrom=0&before=&orderby=lastpost&ascdesc=desc&srchfid%5B0%5D=all&srchtxt=";
    public static final String SearchFullText = BaseUrl + "search.php?srchtype=fulltext&searchsubmit=true&st=on&srchuname=&srchfilter=all&srchfrom=0&before=&orderby=lastpost&ascdesc=desc&srchfid%5B0%5D=all&srchtxt=";
    public static final String SearchUserThreads = BaseUrl + "search.php?srchfid=all&srchfrom=0&searchsubmit=yes&srchuid=";
    public static final String FavoritesUrl = BaseUrl + "my.php?item={item}&type=thread";
    public static final String FavoriteAddUrl = BaseUrl + "my.php?item={item}&action=add&inajax=1&ajaxtarget=favorite_msg&tid={tid}";
    public static final String FavoriteRemoveUrl = BaseUrl + "my.php?item={item}&action=remove&inajax=1&ajaxtarget=favorite_msg&tid={tid}";
    public static final String UserInfoUrl = BaseUrl + "space.php?uid=";

    public static final String LoginSubmit = BaseUrl + "logging.php?action=login&loginsubmit=yes&inajax=1";
    public static final String LoginGetFormHash = BaseUrl + "logging.php?action=login&referer=http%3A//www.hi-pda.com/forum/logging.php";

    private static String userAgent;

    private final static String AVATAR_BASE = "000000000";
    public static int MAX_THREADS_IN_PAGE = 50;

    public final static int FID_BS = 6;
    public final static int FID_DISCOVERY = 2;

    public final static Forum[] FORUMS = {
            new Forum(FID_DISCOVERY, "Discovery", FontAwesome.Icon.faw_cc_discover, 1),
            new Forum(FID_BS, "Buy & Sell", FontAwesome.Icon.faw_shopping_cart, 1),
            new Forum(7, "Geek Talks", FontAwesome.Icon.faw_forumbee, 1),
            new Forum(59, "E-INK", FontAwesome.Icon.faw_book, 1),
            new Forum(12, "PalmOS", FontAwesome.Icon.faw_mobile, 1),
            new Forum(57, "疑似机器人", FontAwesome.Icon.faw_reddit, 1),
            new Forum(63, "已完成交易", FontAwesome.Icon.faw_circle, 1),
            new Forum(62, "Joggler", FontAwesome.Icon.faw_circle, 1),
            new Forum(5, "站务与公告", FontAwesome.Icon.faw_circle, 1),
            new Forum(9, "Smartphone", FontAwesome.Icon.faw_circle, 1),
            new Forum(56, "iPhone, iPod Touch，iPad", FontAwesome.Icon.faw_circle, 1),
            new Forum(60, "Android, Chrome, & Google", FontAwesome.Icon.faw_circle, 1),
            new Forum(14, "Windows Mobile，PocketPC，HPC", FontAwesome.Icon.faw_circle, 1),
            new Forum(22, "麦客爱苹果", FontAwesome.Icon.faw_circle, 1),
            new Forum(50, "DC,NB,MP3,Gadgets", FontAwesome.Icon.faw_circle, 1),
            new Forum(24, "意欲蔓延", FontAwesome.Icon.faw_circle, 1),
            new Forum(25, "吃喝玩乐", FontAwesome.Icon.faw_circle, 1),
            new Forum(51, "La Femme", FontAwesome.Icon.faw_circle, 1),
            new Forum(65, "改版建议", FontAwesome.Icon.faw_circle, 1),
            new Forum(64, "只讨论2.0", FontAwesome.Icon.faw_circle, 1),
    };

    public static String[] FORUM_NAMES;
    public static int[] FORUM_IDS;
    public static IIcon[] FORUM_ICONS;

    static {
        FORUM_NAMES = new String[FORUMS.length];
        FORUM_IDS = new int[FORUMS.length];
        FORUM_ICONS = new IIcon[FORUMS.length];
        for (int i = 0; i < FORUMS.length; i++) {
            Forum forum = FORUMS[i];
            FORUM_NAMES[i] = forum.getName();
            FORUM_IDS[i] = forum.getId();
            FORUM_ICONS[i] = forum.getIcon();
        }
    }

    public static int getForumID(int idx) {
        return FORUM_IDS[idx];
    }

    public static int getForumIndexByFid(int fid) {
        for (int i = 0; i < FORUM_IDS.length; i++) {
            if (fid == FORUM_IDS[i]) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isForumEnabled(int fid) {
        if (fid == FID_DISCOVERY) {
            return true;
        }
        if (getForumIndexByFid(fid) >= 0) {
            if (HiSettingsHelper.getInstance().getForums().contains(fid + ""))
                return true;
        }
        return false;
    }

    public static boolean isForumValid(int fid) {
        return getForumIndexByFid(fid) != -1;
    }

    public final static String[] BS_TYPES = {"全部", "手机", "掌上电脑", "笔记本电脑", "无线产品", "数码相机、摄像机", "MP3随身听", "各类配件", "其他好玩的"};
    public final static String[] BS_TYPE_IDS = {"", "1", "2", "3", "4", "5", "6", "7", "8"};
    public final static IIcon[] BS_TYPE_ICONS = {
            FontAwesome.Icon.faw_tags,
            FontAwesome.Icon.faw_mobile,
            FontAwesome.Icon.faw_tablet,
            FontAwesome.Icon.faw_laptop,
            FontAwesome.Icon.faw_wifi,
            FontAwesome.Icon.faw_camera_retro,
            FontAwesome.Icon.faw_music,
            FontAwesome.Icon.faw_desktop,
            FontAwesome.Icon.faw_gamepad
    };

    public static int getBSTypeIndexByFid(String typeId) {
        for (int i = 0; i < BS_TYPE_IDS.length; i++) {
            if (BS_TYPE_IDS[i].equals(typeId)) {
                return i;
            }
        }
        return -1;
    }

    public static String getFullUrl(String particalUrl) {
        return BaseUrl + particalUrl;
    }

    public static String getAvatarUrlByUid(String uid) {
        if (TextUtils.isEmpty(uid)
                || uid.length() > AVATAR_BASE.length()
                || !TextUtils.isDigitsOnly(uid))
            return "";

        String fullUid = AVATAR_BASE.substring(0, AVATAR_BASE.length() - uid.length()) + uid;
        String url = AvatarBaseUrl
                + fullUid.substring(0, 3) + "/"
                + fullUid.substring(3, 5) + "/"
                + fullUid.substring(5, 7) + "/"
                + fullUid.substring(7, 9) + HiUtils.AvatarSuffix;
        return url;
    }

    public static int getThemeValue(Context context, String theme, int primaryColor) {
        if ("dark".equals(theme)) {
            return R.style.ThemeDark;
        } else if ("black".equals(theme)) {
            return R.style.ThemeBlack;
        } else if ("light".equals(theme)) {
            if (primaryColor == ContextCompat.getColor(context, R.color.md_red_700))
                return R.style.ThemeLight_Red;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_pink_700))
                return R.style.ThemeLight_Pink;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_purple_700))
                return R.style.ThemeLight_Purple;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_deep_purple_700))
                return R.style.ThemeLight_DeepPurple;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_indigo_700))
                return R.style.ThemeLight_Indigo;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_blue_700))
                return R.style.ThemeLight_Blue;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_light_blue_700))
                return R.style.ThemeLight_LightBlue;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_cyan_700))
                return R.style.ThemeLight_Cyan;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_teal_700))
                return R.style.ThemeLight_Teal;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_green_700))
                return R.style.ThemeLight_Green;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_light_green_700))
                return R.style.ThemeLight_LightGreen;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_lime_700))
                return R.style.ThemeLight_Lime;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_yellow_700))
                return R.style.ThemeLight_Yellow;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_amber_700))
                return R.style.ThemeLight_Amber;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_orange_700))
                return R.style.ThemeLight_Orange;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_deep_orange_700))
                return R.style.ThemeLight_DeepOrange;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_brown_700))
                return R.style.ThemeLight_Brown;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_grey_700))
                return R.style.ThemeLight_Grey;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_blue_grey_700))
                return R.style.ThemeLight_BlueGrey;
            if (primaryColor == ContextCompat.getColor(context, R.color.md_black_1000))
                return R.style.ThemeLight_Black;
        }
        HiSettingsHelper.getInstance().setTheme("light");
        HiSettingsHelper.getInstance().setPrimaryColor(ContextCompat.getColor(context, R.color.md_blue_grey_700));
        return R.style.ThemeLight_BlueGrey;
    }

    public static boolean isValidId(String id) {
        try {
            return !TextUtils.isEmpty(id) && TextUtils.isDigitsOnly(id) && Integer.parseInt(id) > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static String getUserAgent() {
        if (userAgent == null)
            userAgent = UserAgentPrefix + " " + HiApplication.getAppVersion();
        return userAgent;
    }

}

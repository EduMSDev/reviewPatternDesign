package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet internet = new AccessToInternet();
    private static List<String> bannedUrl;

    static {
        bannedUrl = new ArrayList<>();
        bannedUrl.add("twitter.com");
        bannedUrl.add("facebook.com");
    }

    @Override
    public void connecTo(String url) throws Exception {
        if (bannedUrl.contains(url)) {
            throw new Exception("URL bloqueada");
        }
        internet.connecTo(url);
    }
}

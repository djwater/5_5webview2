package com.example.administrator.a5_5webview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private WebView webview;
    String string= "<div><div id=\"js-repo-pjax-container\" class=\"repository-content context-loader-container\"> <div class=\"file-wrap\"> <table class=\"files\"> <tbody class=\"\"> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/tree/master/.idea\" class=\"js-directory-link\" id=\"95b55b1e3a304f4e340394a679893575-656b39bd98683e450af7c8e1d4736bb9f35df9ee\" title=\".idea\">.idea</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/50e5243bc107dea87db74be91e80d24a2638b28f\" class=\"message\" title=\"Added butterknife\">Added butterknife</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-07-07T00:40:55Z\">July 06, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/tree/master/app\" class=\"js-directory-link\" id=\"d2a57dc1d883fd21fb9951699df71cc7-7a9c6521772a080270920b283a57e7aab5b43cee\" title=\"app\">app</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/4b6f6404de29aaf4e4ed2bf24cf723ed56e7c42c\" class=\"message\" title=\"Bug fixes\">Bug fixes</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-07-16T07:52:32Z\">July 16, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/tree/master/gradle\" class=\"js-directory-link\" id=\"8ed1a771bc236c287ad93c699bfdd2d7-42cd74daa8500bbdae82280ecfc1baf3de87f2db\" title=\"gradle\">gradle</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/9223bcf737755533498af92e8f16671a4b42f7c8\" class=\"message\" title=\"Added quickreturnheaderlistfragment\">Added quickreturnheaderlistfragment</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-28T04:07:16Z\">June 27, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/tree/master/images\" class=\"js-directory-link\" id=\"59b514174bffe4ae402b3d63aad79fe0-fc905932e44b60e4a4e3c3a0b3608aadf5cad767\" title=\"images\">images</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/28fa7fb8fd049626baa08d87fe045c40c6a90e6d\" class=\"message\" title=\"Updated gif\">Updated gif</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-07-06T01:17:43Z\">July 05, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/.gitignore\" class=\"js-directory-link\" id=\"a084b794bc0759e7a6b77810e01874f2-0f885ac8988dafa183eddb434d69bea1f1b04529\" title=\".gitignore\">.gitignore</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/aa76a67d90775f9f95b9d3337be21acbc0b14db5\" class=\"message\" title=\"Initial commit\">Initial commit</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-24T07:44:55Z\">June 24, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/QuickReturn.iml\" class=\"js-directory-link\" id=\"09b2ca0ee17bc2e457f8b0e10454b0b5-0bb6048ae08a8e6e87a69ee6b675e1d40b6e648b\" title=\"QuickReturn.iml\">QuickReturn.iml</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/9223bcf737755533498af92e8f16671a4b42f7c8\" class=\"message\" title=\"Added quickreturnheaderlistfragment\">Added quickreturnheaderlistfragment</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-28T04:07:16Z\">June 28, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/README.md\" class=\"js-directory-link\" id=\"04c6e90faac2675aa89e2176d2eec7d8-12ae9fb97373ffc896ab0bca707ed6054b4ce604\" title=\"README.md\">README.md</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/28c00305500d1ff0b610458a62e250d6ddb444a0\" class=\"message\" title=\"Updated README.md\">Updated README.md</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-07-07T07:40:11Z\">July 07, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/build.gradle\" class=\"js-directory-link\" id=\"c197962302397baf3a4cc36463dce5ea-a1d991f77c6abebb740fad7a0806b8bc91d1a4e7\" title=\"build.gradle\">build.gradle</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/9223bcf737755533498af92e8f16671a4b42f7c8\" class=\"message\" title=\"Added quickreturnheaderlistfragment\">Added quickreturnheaderlistfragment</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-28T04:07:16Z\">June 28, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/gradle.properties\" class=\"js-directory-link\" id=\"503f218d646c10f484fdc9d6315bf2e3-5d08ba75bb97fd0f586f3c64e237c3439dbb5925\" title=\"gradle.properties\">gradle.properties</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/aa76a67d90775f9f95b9d3337be21acbc0b14db5\" class=\"message\" title=\"Initial commit\">Initial commit</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-24T07:44:55Z\">June 24, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/gradlew\" class=\"js-directory-link\" id=\"36ffbd2ea7085cf19547193a7faf30c8-91a7e269e19dfc62e27137a0b57ef3e430cee4fd\" title=\"gradlew\">gradlew</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/aa76a67d90775f9f95b9d3337be21acbc0b14db5\" class=\"message\" title=\"Initial commit\">Initial commit</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-24T07:44:55Z\">June 24, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/gradlew.bat\" class=\"js-directory-link\" id=\"c9b677a57d25a366595a35b2230d0502-aec99730b4e8fcd90b57a0e8e01544fea7c31a89\" title=\"gradlew.bat\">gradlew.bat</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/aa76a67d90775f9f95b9d3337be21acbc0b14db5\" class=\"message\" title=\"Initial commit\">Initial commit</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-24T07:44:55Z\">June 24, 2014</time></span> </td> </tr> <tr> <td class=\"icon\"> <img alt=\"\" class=\"spinner\" src=\"https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif\" width=\"16\"> </td> <td class=\"content\"> <span class=\"css-truncate css-truncate-target\"><a href=\"https://github.com/lawloretienne/QuickReturn/blob/master/settings.gradle\" class=\"js-directory-link\" id=\"88b7c47e47b8ee65263b6784b86fa0a7-e7b4def49cb53d9aa04228dd3edb14c9e635e003\" title=\"settings.gradle\">settings.gradle</a></span> </td> <td class=\"message\"> <span class=\"css-truncate css-truncate-target \"> <a href=\"https://github.com/lawloretienne/QuickReturn/commit/aa76a67d90775f9f95b9d3337be21acbc0b14db5\" class=\"message\" title=\"Initial commit\">Initial commit</a> </span> </td> <td class=\"age\"> <span class=\"css-truncate css-truncate-target\"><time datetime=\"2014-06-24T07:44:55Z\">June 24, 2014</time></span> </td> </tr> </tbody> </table> </div> <div id=\"readme\" class=\"clearfix announce instapaper_body md\"> <span class=\"name\"> README.md </span> <article class=\"markdown-body entry-content\"> <p>Showcases QuickReturn view as a header, footer, and both header and footer.</p> <p>Support for ScrollView and ListView</p> <p>Now supports Twitter and Facebook QuickReturn</p> <p>Download the app by clicking on the badge below.</p> <p><a href=\"https://play.google.com/store/apps/details?id=com.etiennelawlor.quickreturn\"> <img alt=\"Get it on Google Play\" src=\"https://github.com/lawloretienne/QuickReturn/raw/master/images/en_generic_rgb_wo_60.png\"></a></p> <p><a href=\"https://raw.githubusercontent.com/lawloretienne/QuickReturn/master/images/quick_return_demo.gif\" target=\"_blank\"><img src=\"https://raw.githubusercontent.com/lawloretienne/QuickReturn/master/images/quick_return_demo.gif\"></a></p></article> </div> </div> </div>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webview = ((WebView) findViewById(R.id.webview));
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.loadData(string,"text/html;charset=utf-8","utf-8");
    }
}

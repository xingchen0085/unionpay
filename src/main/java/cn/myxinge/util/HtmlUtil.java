package cn.myxinge.util;

/**
 * Created by chenxinghua on 2018/1/5.
 */
public class HtmlUtil {
    public static String getFormHtml() {
        String strVar = "";
        strVar += "<html>\n";
        strVar += "<head>\n";
        strVar += "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n";
        strVar += "</head>\n";
        strVar += "<body>\n";

        /*支付调用地址*/
        strVar += "<form id=\"pay_form\" action=\"https://gateway.test.95516.com/gateway/api/frontTransReq.do\" method=\"post\">\n";

        /*参数拼装开始*/
        strVar += "<input type=\"hidden\" name=\"txnType\" id=\"txnType\" value=\"01\" />\n";
        strVar += "<input type=\"hidden\" name=\"frontUrl\" id=\"frontUrl\" value=\"http://127.0.0.1:8080/ACPSample_B2C/frontRcvResponse\" />\n";
        strVar += "<input type=\"hidden\" name=\"channelType\" id=\"channelType\" value=\"07\" />\n";
        strVar += "<input type=\"hidden\" name=\"currencyCode\" id=\"currencyCode\" value=\"156\" />\n";
        strVar += "<input type=\"hidden\" name=\"merId\" id=\"merId\" value=\"777290058110048\" />\n";
        strVar += "<input type=\"hidden\" name=\"txnSubType\" id=\"txnSubType\" value=\"01\" />\n";
        strVar += "<input type=\"hidden\" name=\"txnAmt\" id=\"txnAmt\" value=\"10000\" />\n";
        strVar += "<input type=\"hidden\" name=\"version\" id=\"version\" value=\"5.0.0\" />\n";
        strVar += "<input type=\"hidden\" name=\"signMethod\" id=\"signMethod\" value=\"01\" />\n";
        strVar += "<input type=\"hidden\" name=\"backUrl\" id=\"backUrl\" value=\"http://222.222.222.222:8080/ACPSample_B2C/BackRcvResponse\" />\n";
        strVar += "<input type=\"hidden\" name=\"certId\" id=\"certId\" value=\"68759663125\" />\n";
        strVar += "<input type=\"hidden\" name=\"encoding\" id=\"encoding\" value=\"UTF-8\" />\n";
        strVar += "<input type=\"hidden\" name=\"bizType\" id=\"bizType\" value=\"000201\" />\n";
        strVar += "<input type=\"hidden\" name=\"signature\" id=\"signature\" value=\"q75cUw1E90Z/3zoPLoaWwOsHoiLmw4PvD1xgUIapsxKY3tcQpHmI/Y/4oKsG3lli4DpU63EoZScTEZNjdOvorAd5+DTSmKNLECVSBxy7mRTfTVISX/jYuVuc87ogdro8GpT4sHaY0jwVjp1dWalOSQ/jfoYniAggUuhSgQtz/0dSH//R4GVa3sP22jJjHWeWUVFJi5bMNeYe57qqcdZ5Ga04rnKnGuIpIQC3I3GosKziRtRGjdo+OYFmbl28W3QwB5qohG1QIqPvwpDM6WUlVbStuEVBf/FwpZ8yuai8WXOU+GQ9kZYuRSoSDNrRR9/jmYqkwyJDEMtWsl9pehQ4Og==\" />\n";
        strVar += "<input type=\"hidden\" name=\"orderId\" id=\"orderId\" value=\"20160303100902\" />\n";
        strVar += "<input type=\"hidden\" name=\"txnTime\" id=\"txnTime\" value=\"1515137570\" />\n";
        strVar += "<input type=\"hidden\" name=\"accessType\" id=\"accessType\" value=\"0\" />\n";
        strVar += "</form>\n";
        strVar += "<script type=\"text/javascript\">\n";
        strVar += "alert(\"开始提交表单\");\n";
        strVar += "document.all.pay_form.submit();</script>\n";
        strVar += "</body>\n";
        strVar += "</html>\n";
        return strVar;
    }
}

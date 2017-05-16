import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by xiaoxi on 2017/3/29.
 * 简单的爬虫类
 */
public class Spider {
    private static HttpClient httpClient = new HttpClient();


    /**
     *
     * @param path 目标网页链接
     * @return 返回布尔值，表示是否正常下载目标网页
     * @throws Exception 读取网页流或写入本地文件流的IO异常
     */
    public static boolean downloadPage(String path) throws Exception{
        //定义输入输出流
        InputStream input = null;
        OutputStream output = null;
        //得到post方法
        GetMethod getMethod = new GetMethod(path);
        //执行，返回状态码
        int statusCode = httpClient.executeMethod(getMethod);
        //针对状态码进行处理
        //简单起见，只处理返回值为200的状态码
        if (statusCode == HttpStatus.SC_OK){
            input = getMethod.getResponseBodyAsStream();
            //通过url得到文件名
            String fileName = path.substring(path.lastIndexOf("/") + 1) + ".html";
            //获取文件输出流
            output = new FileOutputStream(fileName);
            //输出文件
            int tempByte = -1;
            while ((tempByte = input.read()) > 0){
                output.write(tempByte);
            }
            //关闭输入流
            if (input != null){
                input.close();
            }
            //关闭输出流
            if (output != null){
                output.close();
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        try {
            Spider.downloadPage("http://www.baidu.com");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

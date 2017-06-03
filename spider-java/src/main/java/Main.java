import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main

{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        //以下是代码实现

        Pattern expression = Pattern.compile("\\d+");//匹配数字
        Matcher matcher = expression.matcher(word);//设置匹配器
        long sum = 0;//初始化sum
        while (matcher.find()){
            sum += Long.parseLong(matcher.group());//将得到的数字相加
        }
        System.out.print(sum);//输出


        /*//设置规则
        Pattern expression = Pattern.compile("[a-zA-Z]+");//匹配单词
        word = word.toLowerCase();//转换成小写
        TreeMap treeMap = new TreeMap();
        Integer count = 0;//次数
        String newWord = null;
        Matcher matcher = expression.matcher(word);//设置匹配器

        //匹配文章中的单词
        while (matcher.find()){
            newWord = matcher.group();
            if (treeMap.containsKey(newWord)){
                count = (Integer)treeMap.get(newWord);
                count +=1;
                treeMap.put(newWord,count);
            }else {
                treeMap.put(newWord,1);
            }
        }


        //排序
        List<Map.Entry<String, Integer>> result = new ArrayList<Map.Entry<String, Integer>>(treeMap.entrySet());
        Collections.sort(result,new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue().compareTo(o2.getValue()) == 0){
                    return (o1.getKey()).toString().compareTo(o2.getKey());
                }else {
                    return o2.getValue().compareTo(o1.getValue());
                }

            }
        });
        //输出
        for (int i=0;i<result.size();i++){
            System.out.println(result.get(i).getKey() + " " + result.get(i).getValue());
        }*/
    }

}
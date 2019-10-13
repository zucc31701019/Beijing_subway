

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class data {

    public static List<Station> line1 = new ArrayList<Station>();//1号线
    public static List<Station> line2 = new ArrayList<Station>();//2号线
    public static List<Station> line3 = new ArrayList<Station>();//3号线
    public static List<Station> line4 = new ArrayList<Station>();//4号线
    public static List<Station> line5 = new ArrayList<Station>();//5号线
    public static List<Station> line6 = new ArrayList<Station>();//6号线
    public static List<Station> line7 = new ArrayList<Station>();//7号线
    public static List<Station> line8 = new ArrayList<Station>();//8号线
    public static List<Station> line9 = new ArrayList<Station>();//9号线
    public static List<Station> line10 = new ArrayList<Station>();//10号线
    public static List<Station> line11 = new ArrayList<Station>();//11号线
    public static List<Station> line12 = new ArrayList<Station>();//12号线
    public static List<Station> line13 = new ArrayList<Station>();//13号线
    public static List<Station> line14 = new ArrayList<Station>();//14号线
    public static List<Station> line15 = new ArrayList<Station>();//15号线
    public static List<Station> line16 = new ArrayList<Station>();//16号线
    public static List<Station> lineS1 = new ArrayList<Station>();//s1号线
    public static List<Station> lineS2 = new ArrayList<Station>();//八通线
    public static List<Station> lineS3 = new ArrayList<Station>();//昌平线
    public static List<Station> lineS4 = new ArrayList<Station>();//亦庄线
    public static List<Station> lineS5 = new ArrayList<Station>();//房山线
    public static List<Station> lineS6 = new ArrayList<Station>();//首都机场线
    public static List<Station> lineS7 = new ArrayList<Station>();//大兴线
    public static Set<List<Station>> lineSet = new HashSet<List<Station>>();//所有线集合
    public static int totalStaion = 0;//总的站点数量
    static {
        //1号线
        String pathname = "C:\\Users\\dell\\Desktop\\subway.txt";
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader) // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            int flag=1;
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                //此处需要修改
                if(flag==1){
                String line1Str =line;
                String[] line1Arr = line1Str.split("、");
                for(String s : line1Arr){
                    if(line1.size()!=0){
                    Station station=new Station(s);
                    station.setLine(line1.get(0).getName());
                    line1.add(station);
                    }
                    else
                    line1.add(new Station(s));
                }
                for(int i =0;i<line1.size();i++){
                    if(i<line1.size()-1){
                        line1.get(i).next = line1.get(i+1);
                        line1.get(i+1).prev = line1.get(i);
                    }
                }
                flag++;
            }
                else if(flag==2){
                    String line2Str =line;
                    String[] line2Arr = line2Str.split("、");
                    for(String s : line2Arr){
                        if(line2.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line2.get(0).getName());
                            line2.add(station);
                        }
                        else
                            line2.add(new Station(s));
                    }
                    for(int i =0;i<line2.size();i++){
                        if(i<line2.size()-1){
                            line2.get(i).next = line2.get(i+1);
                            line2.get(i+1).prev = line2.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==3){
                    String line3Str =line;
                    String[] line3Arr = line3Str.split("、");
                    for(String s : line3Arr){
                        if(line3.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line3.get(0).getName());
                            line3.add(station);
                        }
                        else
                            line3.add(new Station(s));
                    }
                    for(int i =0;i<line3.size();i++){
                        if(i<line3.size()-1){
                            line3.get(i).next = line3.get(i+1);
                            line3.get(i+1).prev = line3.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==4){
                    String line4Str =line;
                    String[] line4Arr = line4Str.split("、");
                    for(String s : line4Arr){
                        if(line4.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line4.get(0).getName());
                            line4.add(station);
                        }
                        else
                            line4.add(new Station(s));
                    }
                    for(int i =0;i<line4.size();i++){
                        if(i<line4.size()-1){
                            line4.get(i).next = line4.get(i+1);
                            line4.get(i+1).prev = line4.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==5){
                    String line5Str =line;
                    String[] line5Arr = line5Str.split("、");
                    for(String s : line5Arr){
                        if(line5.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line5.get(0).getName());
                            line5.add(station);
                        }
                        else
                            line5.add(new Station(s));
                    }
                    for(int i =0;i<line5.size();i++){
                        if(i<line5.size()-1){
                            line5.get(i).next = line5.get(i+1);
                            line5.get(i+1).prev = line5.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==6){
                    String line6Str =line;
                    String[] line6Arr = line6Str.split("、");
                    for(String s : line6Arr){
                        if(line6.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line6.get(0).getName());
                            line6.add(station);
                        }
                        else
                            line6.add(new Station(s));
                    }
                    for(int i =0;i<line6.size();i++){
                        if(i<line6.size()-1){
                            line6.get(i).next = line6.get(i+1);
                            line6.get(i+1).prev = line6.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==7){
                    String line7Str =line;
                    String[] line7Arr = line7Str.split("、");
                    for(String s : line7Arr){
                        if(line7.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line7.get(0).getName());
                            line7.add(station);
                        }
                        else
                            line7.add(new Station(s));
                    }
                    for(int i =0;i<line7.size();i++){
                        if(i<line7.size()-1){
                            line7.get(i).next = line7.get(i+1);
                            line7.get(i+1).prev = line7.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==8){
                    String line8Str =line;
                    String[] line8Arr = line8Str.split("、");
                    for(String s : line8Arr){
                        if(line8.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line8.get(0).getName());
                            line8.add(station);
                        }
                        else
                            line8.add(new Station(s));
                    }
                    for(int i =0;i<line8.size();i++){
                        if(i<line8.size()-1){
                            line8.get(i).next = line8.get(i+1);
                            line8.get(i+1).prev = line8.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==9){
                    String line9Str =line;
                    String[] line9Arr = line9Str.split("、");
                    for(String s : line9Arr){
                        if(line9.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line9.get(0).getName());
                            line9.add(station);
                        }
                        else
                            line9.add(new Station(s));
                    }
                    for(int i =0;i<line9.size();i++){
                        if(i<line9.size()-1){
                            line9.get(i).next = line9.get(i+1);
                            line9.get(i+1).prev = line9.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==10){
                    String line10Str =line;
                    String[] line10Arr = line10Str.split("、");
                    for(String s : line10Arr){
                        if(line10.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line10.get(0).getName());
                            line10.add(station);
                        }
                        else
                            line10.add(new Station(s));
                    }
                    for(int i =0;i<line10.size();i++){
                        if(i<line10.size()-1){
                            line10.get(i).next = line10.get(i+1);
                            line10.get(i+1).prev = line10.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==11){
                    String line11Str =line;
                    String[] line11Arr = line11Str.split("、");
                    for(String s : line11Arr){
                        if(line11.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line11.get(0).getName());
                            line11.add(station);
                        }
                        else
                            line11.add(new Station(s));
                    }
                    for(int i =0;i<line11.size();i++){
                        if(i<line11.size()-1){
                            line11.get(i).next = line11.get(i+1);
                            line11.get(i+1).prev = line11.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==12){
                    String line12Str =line;
                    String[] line12Arr = line12Str.split("、");
                    for(String s : line12Arr){
                        if(line12.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line12.get(0).getName());
                            line12.add(station);
                        }
                        else
                            line12.add(new Station(s));
                    }
                    for(int i =0;i<line12.size();i++){
                        if(i<line12.size()-1){
                            line12.get(i).next = line12.get(i+1);
                            line12.get(i+1).prev = line12.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==13){
                    String line13Str =line;
                    String[] line13Arr = line13Str.split("、");
                    for(String s : line13Arr){
                        if(line13.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line13.get(0).getName());
                            line13.add(station);
                        }
                        else
                            line13.add(new Station(s));
                    }
                    for(int i =0;i<line13.size();i++){
                        if(i<line13.size()-1){
                            line13.get(i).next = line13.get(i+1);
                            line13.get(i+1).prev = line13.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==14){
                    String line14Str =line;
                    String[] line14Arr = line14Str.split("、");
                    for(String s : line14Arr){
                        if(line14.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line14.get(0).getName());
                            line14.add(station);
                        }
                        else
                            line14.add(new Station(s));
                    }
                    for(int i =0;i<line14.size();i++){
                        if(i<line14.size()-1){
                            line14.get(i).next = line14.get(i+1);
                            line14.get(i+1).prev = line14.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==15){
                    String line15Str =line;
                    String[] line15Arr = line15Str.split("、");
                    for(String s : line15Arr){
                        if(line15.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line15.get(0).getName());
                            line15.add(station);
                        }
                        else
                            line15.add(new Station(s));
                    }
                    for(int i =0;i<line15.size();i++){
                        if(i<line15.size()-1){
                            line15.get(i).next = line15.get(i+1);
                            line15.get(i+1).prev = line15.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==16){
                    String line16Str =line;
                    String[] line16Arr = line16Str.split("、");
                    for(String s : line16Arr){
                        if(line16.size()!=0){
                            Station station=new Station(s);
                            station.setLine(line16.get(0).getName());
                            line16.add(station);
                        }
                        else
                            line16.add(new Station(s));
                    }
                    for(int i =0;i<line16.size();i++){
                        if(i<line16.size()-1){
                            line16.get(i).next = line16.get(i+1);
                            line16.get(i+1).prev = line16.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==17){
                    String lineS1Str =line;
                    String[] lineS1Arr = lineS1Str.split("、");
                    for(String s : lineS1Arr){
                        if(lineS1.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS1.get(0).getName());
                            lineS1.add(station);
                        }
                        else
                            lineS1.add(new Station(s));
                    }
                    for(int i =0;i<lineS1.size();i++){
                        if(i<lineS1.size()-1){
                            lineS1.get(i).next = lineS1.get(i+1);
                            lineS1.get(i+1).prev = lineS1.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==18){
                    String lineS2Str =line;
                    String[] lineS2Arr = lineS2Str.split("、");
                    for(String s : lineS2Arr){
                        if(lineS2.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS2.get(0).getName());
                            lineS2.add(station);
                        }
                        else
                            lineS2.add(new Station(s));
                    }
                    for(int i =0;i<lineS2.size();i++){
                        if(i<lineS2.size()-1){
                            lineS2.get(i).next = lineS2.get(i+1);
                            lineS2.get(i+1).prev = lineS2.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==19){
                    String lineS3Str =line;
                    String[] lineS3Arr = lineS3Str.split("、");
                    for(String s : lineS3Arr){
                        if(lineS3.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS3.get(0).getName());
                            lineS3.add(station);
                        }
                        else
                            lineS3.add(new Station(s));
                    }
                    for(int i =0;i<lineS3.size();i++){
                        if(i<lineS3.size()-1){
                            lineS3.get(i).next = lineS3.get(i+1);
                            lineS3.get(i+1).prev = lineS3.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==20){
                    String lineS4Str =line;
                    String[] lineS4Arr = lineS4Str.split("、");
                    for(String s : lineS4Arr){
                        if(lineS4.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS4.get(0).getName());
                            lineS4.add(station);
                        }
                        else
                            lineS4.add(new Station(s));
                    }
                    for(int i =0;i<lineS4.size();i++){
                        if(i<lineS4.size()-1){
                            lineS4.get(i).next = lineS4.get(i+1);
                            lineS4.get(i+1).prev = lineS4.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==21){
                    String lineS5Str =line;
                    String[] lineS5Arr = lineS5Str.split("、");
                    for(String s : lineS5Arr){
                        if(lineS5.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS5.get(0).getName());
                            lineS5.add(station);
                        }
                        else
                            lineS5.add(new Station(s));
                    }
                    for(int i =0;i<lineS5.size();i++){
                        if(i<lineS5.size()-1){
                            lineS5.get(i).next = lineS5.get(i+1);
                            lineS5.get(i+1).prev = lineS5.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==22){
                    String lineS6Str =line;
                    String[] lineS6Arr = lineS6Str.split("、");
                    for(String s : lineS6Arr){
                        if(lineS6.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS6.get(0).getName());
                            lineS6.add(station);
                        }
                        else
                            lineS6.add(new Station(s));
                    }
                    for(int i =0;i<lineS6.size();i++){
                        if(i<lineS6.size()-1){
                            lineS6.get(i).next = lineS6.get(i+1);
                            lineS6.get(i+1).prev = lineS6.get(i);
                        }
                    }
                    flag++;
                }
               else if(flag==23){
                    String lineS7Str =line;
                    String[] lineS7Arr = lineS7Str.split("、");
                    for(String s : lineS7Arr){
                        if(lineS7.size()!=0){
                            Station station=new Station(s);
                            station.setLine(lineS7.get(0).getName());
                            lineS7.add(station);
                        }
                        else
                            lineS7.add(new Station(s));
                    }
                    for(int i =0;i<lineS7.size();i++){
                        if(i<lineS7.size()-1){
                            lineS7.get(i).next = lineS7.get(i+1);
                            lineS7.get(i+1).prev = lineS7.get(i);
                        }
                    }
                    flag++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        lineSet.add(line1);
        lineSet.add(line2);
        lineSet.add(line3);
        lineSet.add(line4);
        lineSet.add(line5);
        lineSet.add(line6);
        lineSet.add(line7);
        lineSet.add(line8);
        lineSet.add(line9);
        lineSet.add(line10);
        lineSet.add(line11);
        lineSet.add(line12);
        lineSet.add(line13);
        lineSet.add(line14);
        lineSet.add(line15);
        lineSet.add(line16);
        lineSet.add(lineS1);
        lineSet.add(lineS2);
        lineSet.add(lineS3);
        lineSet.add(lineS4);
        lineSet.add(lineS5);
        lineSet.add(lineS6);
        lineSet.add(lineS7);

        totalStaion  = line1.size() + line2.size() + line3.size() + line4.size() + line5.size() + line6.size() + line7.size() + line8.size() +line9.size() +
                line10.size() + line11.size() + line12.size() + line13.size() + line14.size() + line15.size() + line16.size() + lineS1.size() + lineS2.size()+
                lineS3.size() + lineS4.size() + lineS5.size() + lineS6.size() + lineS7.size();
        //System.out.println("总的站点数量："+totalStaion);
    }
//    public static void main(String[] args) {
//        System.out.print(line1.get(1).getName());
//    }

}

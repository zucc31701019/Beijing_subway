

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;



public class subway {
    public static List<Station> Rline = new ArrayList<Station>();//储存输出的搜索X号线
    public static List<String> Txtline = new ArrayList<String>();//储存搜索的最短换乘站名
    public String line="0";
    private List<Station> outList = new ArrayList<Station>();
    public void calculate(Station s1,Station s2){
        if(outList.size() == data.totalStaion){
            System.out.println("找到目标站点："+s2.getName()+"，共经过"+(s1.getAllPassedStations(s2).size()-1)+"站");
            int flag=0;
            for(Station station : s1.getAllPassedStations(s2)){
                if(!station.getline().equals(line)&&flag==1){
                    line=station.getline();
                    System.out.println("请换乘"+line+"->");
                    System.out.print(station.getName()+"->");
                    Txtline.add(line);
                    Txtline.add(station.getName());
                }
                else if(!station.getline().equals(line)&&flag==0) {
                    System.out.print("首先 ：");
                    System.out.print(station.getName()+"->");
                    flag=1;
                    Txtline.add(station.getName());
                }
                else{
                    System.out.print(station.getName()+"->");
                    Txtline.add(station.getName());
                }
            }
            return;
        }
        if(!outList.contains(s1)){
            outList.add(s1);
        }
        if(s1.getOrderSetMap().isEmpty()){
            List<Station> Linkedstations = getAllLinkedStations(s1);
            for(Station s : Linkedstations){
                s1.getAllPassedStations(s).add(s);
            }
        }
        Station parent = getShortestPath(s1);
        if(parent == s2){
            System.out.println("找到目标站点："+s2.getName()+"，共经过"+(s1.getAllPassedStations(s2).size()-1)+"站");
            for(Station station : s1.getAllPassedStations(s2)){
                if(!station.getline().equals(line)){
                    line=station.getline();
                    System.out.println("请换乘"+line+"->");
                    System.out.print(station.getName()+"->");
                    Txtline.add(line);
                    Txtline.add(station.getName());
                }
                else
                System.out.print(station.getName()+"->");
                Txtline.add(station.getName());
            }
            return;
        }
        for(Station child : getAllLinkedStations(parent)){
            if(outList.contains(child)){
                continue;
            }
            int shortestPath = (s1.getAllPassedStations(parent).size()-1) + 1;
            if(s1.getAllPassedStations(child).contains(child)){
                if((s1.getAllPassedStations(child).size()-1) > shortestPath){
                    s1.getAllPassedStations(child).clear();
                    s1.getAllPassedStations(child).addAll(s1.getAllPassedStations(parent));
                    s1.getAllPassedStations(child).add(child);
                }
            } else {         s1.getAllPassedStations(child).addAll(s1.getAllPassedStations(parent));
                s1.getAllPassedStations(child).add(child);
            }
        }
        outList.add(parent);
        calculate(s1,s2);
    }
    private Station getShortestPath(Station station){
        int minPatn = Integer.MAX_VALUE;
        Station rets = null;
        for(Station s :station.getOrderSetMap().keySet()){
            if(outList.contains(s)){
                continue;
            }
            LinkedHashSet<Station> set  = station.getAllPassedStations(s);
            if(set.size() < minPatn){
                minPatn = set.size();
                rets = s;
            }
        }
        return rets;
    }
    private List<Station> getAllLinkedStations(Station station){
        List<Station> linkedStaions = new ArrayList<Station>();
        for(List<Station> line : data.lineSet){
            if(line.contains(station)){
                Station s = line.get(line.indexOf(station));
                if(s.prev != null){
                    linkedStaions.add(s.prev);
                }
                if(s.next != null){
                    linkedStaions.add(s.next);
                }
            }
        }
        return linkedStaions;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            long t1 = System.currentTimeMillis();
            subway sw = new subway();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入起点站：");
            String s1 = sc.nextLine();
            System.out.println("请输入终点站：");
            String s2 = sc.nextLine();
            sw.calculate(new Station(s1), new Station(s2));
            long t2 = System.currentTimeMillis();
            System.out.println();
            System.out.println("耗时：" + (t2 - t1) + "ms");
        }
        else {
            for(int i=0;i<args.length;i++) {
                if(args[i].equals("-a")){
                    i++;
                    data data=new data();
                    if(args[i].equals("1号线")){
                        for(int j=0;j<data.line1.size();j++)
                            System.out.print(data.line1.get(j).getName()+" ");
                        Rline=data.line1;
                    }
                    else if(args[i].equals("2号线")){
                        for(int j=0;j<data.line2.size();j++)
                            System.out.print(data.line2.get(j).getName()+" ");
                        Rline=data.line2;
                    }
                    else if(args[i].equals("4号线")){
                        for(int j=0;j<data.line3.size();j++)
                            System.out.print(data.line3.get(j).getName()+" ");
                        Rline=data.line3;
                    }
                    else if(args[i].equals("5号线")){
                        for(int j=0;j<data.line4.size();j++)
                            System.out.print(data.line4.get(j).getName()+" ");
                        Rline=data.line4;
                    }
                    else if(args[i].equals("6号线")){
                        for(int j=0;j<data.line5.size();j++)
                            System.out.print(data.line5.get(j).getName()+" ");
                        Rline=data.line5;
                    }
                    else if(args[i].equals("7号线")){
                        for(int j=0;j<data.line6.size();j++)
                            System.out.print(data.line6.get(j).getName()+" ");
                        Rline=data.line6;
                    }
                    else if(args[i].equals("8号线")){
                        for(int j=0;j<data.line7.size();j++)
                            System.out.print(data.line7.get(j).getName()+" ");
                        Rline=data.line7;
                    }
                    else if(args[i].equals("9号线")){
                        for(int j=0;j<data.line8.size();j++)
                            System.out.print(data.line8.get(j).getName()+" ");
                        Rline=data.line8;
                    }
                    else if(args[i].equals("10号线")){
                        for(int j=0;j<data.line9.size();j++)
                            System.out.print(data.line9.get(j).getName()+" ");
                        Rline=data.line9;
                    }
                    else if(args[i].equals("13号线")){
                        for(int j=0;j<data.line10.size();j++)
                            System.out.print(data.line10.get(j).getName()+" ");
                        Rline=data.line10;
                    }
                    else if(args[i].equals("14号线")){
                        for(int j=0;j<data.line11.size();j++)
                            System.out.print(data.line11.get(j).getName()+" ");
                        Rline=data.line11;
                    }
                    else if(args[i].equals("15号线")){
                        for(int j=0;j<data.line12.size();j++)
                            System.out.print(data.line12.get(j).getName()+" ");
                        Rline=data.line12;
                    }
                    else if(args[i].equals("16号线")){
                        for(int j=0;j<data.line13.size();j++)
                            System.out.print(data.line13.get(j).getName()+" ");
                        Rline=data.line13;
                    }
                    else if(args[i].equals("s1线")||args[i].equals("S1线")){
                        for(int j=0;j<data.line14.size();j++)
                            System.out.print(data.line14.get(j).getName()+" ");
                        Rline=data.line14;
                    }
                    else if(args[i].equals("八通线")){
                        for(int j=0;j<data.line15.size();j++)
                            System.out.print(data.line15.get(j).getName()+" ");
                        Rline=data.line15;
                    }
                    else if(args[i].equals("昌平线")){
                        for(int j=0;j<data.line16.size();j++)
                            System.out.print(data.line16.get(j).getName()+" ");
                        Rline=data.line16;
                    }
                    else if(args[i].equals("亦庄线")){
                        for(int j=0;j<data.lineS1.size();j++)
                            System.out.print(data.lineS1.get(j).getName()+" ");
                        Rline=data.lineS1;
                    }
                    else if(args[i].equals("房山线")){
                        for(int j=0;j<data.lineS2.size();j++)
                            System.out.print(data.lineS2.get(j).getName()+" ");
                        Rline=data.lineS2;
                    }
                    else if(args[i].equals("首都机场线")){
                        for(int j=0;j<data.lineS3.size();j++)
                            System.out.print(data.lineS3.get(j).getName()+" ");
                        Rline=data.lineS3;
                    }
                    else if(args[i].equals("大兴线")){
                        for(int j=0;j<data.lineS4.size();j++)
                            System.out.print(data.lineS4.get(j).getName()+" ");
                        Rline=data.lineS4;
                    }
                    else
                        System.out.print("未查到该线路，请确认输入是否正确");
                }
                else if(args[i].equals("-o")){
                    i++;
                    if(args[i-3].equals("-a")){
                    try {
                        File writeName = new File("C:\\Users\\dell\\Desktop\\"+args[i]+""); // 相对路径，如果没有则要建立一个新的output.txt文件
                        System.out.print("文件创建成功");
                        writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
                        try (FileWriter writer = new FileWriter(writeName);
                             BufferedWriter out = new BufferedWriter(writer)
                        ) {
                            for(int j=0;j<Rline.size();j++)
                            out.write(Rline.get(j).getName()+" "); // \r\n即为换行

                            out.flush(); // 把缓存区内容压入文件
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    }
                    else if(args[i-4].equals("-b")){
                        try {
                            File writeName = new File("C:\\Users\\dell\\Desktop\\"+args[i]+""); // 相对路径，如果没有则要建立一个新的output.txt文件
                            System.out.print("文件创建成功");
                            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
                            try (FileWriter writer = new FileWriter(writeName);
                                 BufferedWriter out = new BufferedWriter(writer)
                            ) {
                                for(int j=0;j<Txtline.size();j++)
                                    out.write(Txtline.get(j)+"\r\n"); // \r\n即为换行

                                out.flush(); // 把缓存区内容压入文件
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                else if(args[i].equals("-b")){
                    i++;
                    subway sw = new subway();
                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入起点站：");
                    String s1 = args[i];
                    i++;
                    System.out.println("请输入终点站：");
                    String s2 = args[i];
                    sw.calculate(new Station(s1), new Station(s2));

                }
            }
        }
    }
}
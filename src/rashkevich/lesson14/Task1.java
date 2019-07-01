package rashkevich.lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Task1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String filename=sc.nextLine();
        int b=0;
        File file=new File(filename);
        List<Integer> list=new ArrayList<Integer>();
        try(FileInputStream fis=new FileInputStream(file);){
            while((b=fis.read())!=-1){
                list.add(b);
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();

        for (Integer i:list){
            hm.put(i,0);
        }
        for(Integer i:list){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
        }
        int max=0; int count=0;
        for (Map.Entry<Integer,Integer> entry:hm.entrySet()){
           if(entry.getValue()>count){
               max=entry.getKey();
               count=entry.getValue();
           }
        }
        System.out.println("Байт:"+max+" Количество повторов:"+count);
    }
}

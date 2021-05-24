package bfindstring;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String charater;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi bat ki: ");
        charater = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        System.out.println("chuoi xap xep la: ");
        for (int i = 0; i < charater.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(charater.charAt(i));
        for (int j = 0; j < charater.length(); j++) {
    if(charater.charAt(j)>list.getLast()){
        list.add(charater.charAt(j));
    }
        }
        if(list.size()>max.size()){
            max.clear();
            max.addAll(list);
        }
        list.clear();
        }
        for(Character ch: max){
            System.out.println(ch);
        }
    }
}

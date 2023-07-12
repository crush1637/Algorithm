package WEEK1;

import java.io.IOException;
import java.util.Scanner;

public class Baekjun {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Hello World!
    }
    public void test() throws IOException {
        int A = (int)System.in.read();
        int B = (int)System.in.read();
        System.out.println(A+B);
    }
    //System.in.read() 는 문자를 읽어서 아스키 코드로 반환하는 메서드임. 그래서 (int) 도 필요없고, int A 인경우 아스키 코드로 저장된다.
    public void test2() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A+B);
    }

}

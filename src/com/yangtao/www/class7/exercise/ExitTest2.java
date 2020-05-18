package com.yangtao.www.class7.exercise;

import java.io.*;

/**
 * @author CoderYT
 * @date 2020/5/17
 **/
public class ExitTest2 {
    public static void main(String[] args) {


        try(InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(System.out);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);) {
            String str = "";
            while (!str.equals("exit")) {
                str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package com.test;
public static void writeContentToTxt(StringBuffer Content,File f){
        FileWriter fw = null;
        try {
        //如果文件存在，则追加内容；如果文件不存在，则创建文件
        //File f=new File("D:\\hei.txt");
        fw = new FileWriter(f, true);
        } catch (IOException e) {
        e.printStackTrace();
        }

        PrintWriter pw = new PrintWriter(fw);
        pw.println(Content);
        pw.flush();
        try {
        fw.flush();
        pw.close();
        fw.close();
        } catch (IOException e) {
        e.printStackTrace();
        }

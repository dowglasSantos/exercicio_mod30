package main.java;

import java.sql.Connection;
import main.java.br.com.rpires.dao.generic.jdbc.ConnectionFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        try{
            Connection conn = ConnectionFactory.getConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
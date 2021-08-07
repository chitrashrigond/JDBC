package com.xworkz.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class JdbcTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="root";
		String password="kariya@2021";
		String url="jdbc:mysql://localhost:3306/jdbctask";
		String fqnOfDriverImpl="com.mysql.cj.jdbc.Driver";
		
		try{
			Class.forName(fqnOfDriverImpl);
			
			Connection cn=DriverManager.getConnection(url, userName,password);
			System.out.println(cn);
		}
		catch(SQLException c){
			c.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
String query2 = "insert into ScamI values(1,'BOFORS SCAM','F',1987,'Lalit Modi ',15,'Delhi','The Bofors scandal was a major weapons-contract political scandal that occurred between India and Sweden during the 1980s and 1990s, ')";
String query3 = "insert into ScamI values(10,'HARSHAD MEHTA SCAM','G' ,1992,'DDD',1998,'Bombay ','The 1992 Indian stock market scam was a market manipulation carried out by Harshad Shantilal Mehta with other bankers and politicians on the Bombay Stock Exchange.')";
String query4 = "insert into ScamI values(23,'COBBLER SCAM','Shoes',5,'BBBGI',1995,'India','The cobbler scam in Maharashtra is snowballing into one of the biggest financial scandals in recent times.')";
String query5 = "insert into ScamI values(12,'FODDER SCAM','I',2019,' Jagannath Mishra',94 ,'Bihar','The Fodder Scam was a corruption scandal that involved the embezzlement of about 9.4 billion (equivalent to 39 billion or US$540 million in 2019)')";
String query6 = "insert into ScamI values(28,'HAWLA SCANDAL','J',1996,' Raychand Soni ',18 ,'Kashmir','The Hawala scandal, also called the Jain Diaries case or the hawala scam was an Indian political')";
String query7 = "insert into ScamI values(15,'PREFERENTI','company ',1995,' BBBB',80 ,'Bihar','Comparison between Issue of shares on Right Basis (Right Issue) and Issue of shares on Preferential Basis (Preferential Allotment through Preferential Offer) under Companies Act, 2013.')";
String query8 = "insert into ScamI values(26,'Fertiliser import','L',1996,'DDDD',54000 ,'Bihar','India imports 19.97 mln tons of fertilisers till Feb: Fertiliser minister Gowda. ... Of the total import of 19.97 million tonnes, 11.33 million tonnes were imported during the kharif (summer)')";
String query9 = "insert into ScamI values(13,'Sukh Ram telecom','M',1997,' sssss',86 ,'Bihar','Pandit Sukh Ram (born 27 July 1927) is an Indian politician who served as the Minister of Communications and Information Technology from 1993 to 1996.')";
String query10 = "insert into ScamI values(22,'Teak plantation','N',1998,' Jagannath Mishra',9.4 ,'Bihar','Anubhav Plantations was an Indian Chennai-based plantation company founded in 1992.[1] It sold shares in teak plantations on guaranteed interests.')";
String query11 = "insert into ScamI values(18,'UTI scam','O',2001,'Mark Nelson',9.4 ,'Bihar','The Unit Trust of India Act 1963 was repealed, paving way for the bifurcation of UTI into: Specified Undertaking of Unit Trust of India (SUUTI) and UTI Mutual Fund (UTIMF).')";
String query12 = "insert into ScamI values(35,'SanjayAgarwal','P',2002,' Jagannath Mishra',9.4 ,'Bihar','Consider for example the core of the current “scam” constituted by transactions involving a set of cooperative banks and Home Trade, which has once again seen a few hundred')";
String query13 = "insert into ScamI values(16,'Jharkhand medical','Q',2008,'harkhand medical',130,'Jarkhand','Former Jharkhand Health Minister Bhanu Pratap Sahi surrendered in a CBI court in Ranchi in connection with Rs 130 crores, National Rural Health Mission (NRHM) scam popularly known as medicine scam. ')";
String query14 = "insert into ScamI values(43,' HassanAliKhantax','R',2008,'Hassan Ali Khan',34000,'India','Having hit the national headlines in 2007, he was alleged to have owed more than Rs 34,000 crore to the government in tax dues.')";
String query15 = "insert into ScamI values(52,'IPO-Demat scam','Bank',2005,'Financiers',24000,'Delhi','Eleven years on, while 80% of scam-hit investors have been fully ... hit by what has come to be known as the IPO scam or the demat scam')";
String query17 = "insert into ScamI values(100,'TELGI SCAM','Sugar',2003,'Telgi ',25,'Banglore',' The size scam was valued at a massive Rs 20,000 crore, leaving the entire nation in shock. Other estimates ranged from Rs 3,000 crore to Rs 30,000 crore.')";



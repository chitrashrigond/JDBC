
package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ScamTester {

	public static void main(String[] args) throws SQLException {

		String username = "root";
		String password = "kariya@2021";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";

		try {

			Connection connect = DriverManager.getConnection(url, username, password);
			System.out.println(connect);

			String query1 = "insert into ScamDetails values(38,'Sugar import Scam','Sugar',1994,'Khusro Bakhtiar',25000,'India','Brown/white sugar Global purchases of imported sugar cost a total US$25.1 billion in 2020. an average -10.6% since 2016 when sugar purchases')";
			String query2 = "insert into ScamDetails values(1,'BOFORS SCAM','Army',1987,'Bofors Martin Ardbo',1437,'Delhi','The Bofors scandal was a major weapons-contract political scandal that occurred between India and Sweden during the 1980s and 1990s, ')";
			String query3 = "insert into ScamDetails values(2,'HARSHAD MEHTA SCAM','Market' ,1992,'HARSHAD',19920,'Bombay ','The 1992 Indian stock market scam was a market manipulation carried out by Harshad Shantilal Mehta with other bankers and politicians on the Bombay Stock Exchange.')";
			String query4 = "insert into ScamDetails values(3,'COBBLER SCAM','loan',1995,'',60000,'Mumbai','The cobbler scam in Maharashtra is snowballing into one of the biggest financial scandals in recent times.')";
			String query5 = "insert into ScamDetails values(4,'FODDER SCAM','I',2019,' Jagannath Mishra',94 ,'Bihar','The Fodder Scam was a corruption scandal that involved the embezzlement of about 9.4 billion (equivalent to 39 billion or US$540 million in 2019)')";
			String query6 = "insert into ScamDetails values(5,'HAWLA SCANDAL','J',1996,' Raychand Soni ',18 ,'Kashmir','The Hawala scandal, also called the Jain Diaries case or the hawala scam was an Indian political')";
			String query7 = "insert into ScamDetails values(6,'PREFERENTI Allotment scam','company ',1993,'Controlling group',80000,'India','Comparison between Issue of shares on Right Basis (Right Issue) and Issue of shares on Preferential Basis (Preferential Allotment through Preferential Offer) under Companies Act, 2013.')";
			String query8 = "insert into ScamDetails values(7,'Fertiliser import','Fertilizer',1996,'Amarendra',54000 ,'Dubai','India imports 19.97 mln tons of fertilisers till Feb: Fertiliser minister Gowda. ... Of the total import of 19.97 million tonnes, 11.33 million tonnes were imported during the kharif (summer)')";
			String query9 = "insert into ScamDetails values(8,'Sukh Ram telecom','M',1997,' sssss',86 ,'Bihar','Pandit Sukh Ram (born 27 July 1927) is an Indian politician who served as the Minister of Communications and Information Technology from 1993 to 1996.')";
			String query10 = "insert into ScamDetails values(9,'Teak plantation','N',1998,' Jagannath Mishra',9.4 ,'Bihar','Anubhav Plantations was an Indian Chennai-based plantation company founded in 1992.[1] It sold shares in teak plantations on guaranteed interests.')";
			String query11 = "insert into ScamDetails values(10,'UTI scam','O',2001,'Mark Nelson',9.4 ,'Bihar','The Unit Trust of India Act 1963 was repealed, paving way for the bifurcation of UTI into: Specified Undertaking of Unit Trust of India (SUUTI) and UTI Mutual Fund (UTIMF).')";
			String query12 = "insert into ScamDetails values(11,'SanjayAgarwal','P',2002,' Jagannath Mishra',9.4 ,'Bihar','Consider for example the core of the current “scam” constituted by transactions involving a set of cooperative banks and Home Trade, which has once again seen a few hundred')";
			String query13 = "insert into ScamDetails values(12,'Jharkhand medical','Q',2008,'harkhand medical',130,'Jarkhand','Former Jharkhand Health Minister Bhanu Pratap Sahi surrendered in a CBI court in Ranchi in connection with Rs 130 crores, National Rural Health Mission (NRHM) scam popularly known as medicine scam. ')";
			String query14 = "insert into ScamDetails values(13,' HassanAliKhantax','R',2008,'Hassan Ali Khan',34000,'India','Having hit the national headlines in 2007, he was alleged to have owed more than Rs 34,000 crore to the government in tax dues.')";
			String query15 = "insert into ScamDetails values(14,'IPO-Demat scam','Bank',2005,'Financiers',24000,'Delhi','Eleven years on, while 80% of scam-hit investors have been fully ... hit by what has come to be known as the IPO scam or the demat scam')";
			String query16 = "insert into ScamDetails values(15,'TELGI SCAM','Sugar',2003,'Telgi ',25,'Banglore',' The size scam was valued at a massive Rs 20,000 crore, leaving the entire nation in shock. Other estimates ranged from Rs 3,000 crore to Rs 30,000 crore.')";
			String query17 = "insert into ScamDetails values(16,'2G Spectrum Scam','Former',2008,'Raja ',176000,'Banglore','The 2G Spectrum Case is an ongoing[1] alleged scam case that the politicians and private officials of the United Progressive Alliance coalition government in India are accused in.On 21 December 2017, the special court in New Delhi after thorough examination of the case and hearing what the CBI had to say, acquitted all accused in the 2G spectrum case including prime accused A Raja and Kanimozhi.')";
			String query18 = "insert into ScamDetails values(18,'CommonWealth Game Scam','Game',2010,'Suresh kalmadi ',35000,'India','CWG scam was one of the biggest Indian scams involving rounding of Rs. 70,000 crores. Just half of the amount allocated was estimated to be spent on Indian sportspeople. The athletes were supposedly forced to move from those allocated by the authorities to shabby flats.')";
			String query19 = "insert into ScamDetails values(19,'Satyam SCAM','Company',2015,'Ramalinga Raju ',14000,'India','The Satyam Computer Services scandal was a corporate scandal affecting India-based company Satyam Computer Services in 2009,in which chairman Byrraju Ramalinga Raju confessed that the companys accounts had been falsified')";
			String query20 = "insert into ScamDetails values(20,'IPL SCAM','Game',2020,'Shah Rukh Khan, ',25,'Kolkatta','ED has attached assets worth over Rs 70 crore of three firms, including a company linked to an IPL cricket team promoted by actor Shah Rukh Khan, in connection with a money laundering probe in the Rose Valley ponzi scam case, the agency said. The three firms are Multiple Resorts Pvt Ltd, St Xaviers College, Kolkata, and Knight Riders Sports Pvt Ltd.')";
			Statement st = connect.createStatement();

			st.execute(query20);
			ResultSet result = st.getResultSet();
			ScamDTO dto = null;

			// System.out.println(dto);
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}

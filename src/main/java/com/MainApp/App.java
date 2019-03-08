package com.MainApp;

import org.hibernate.Session;

/*
 * Encontrar porta SQL Server: netstat -ano | findstr *PID* ((PID do sqlservr.exe))
 * Verificar se está rodando: telnet localhost porta
 * 
 * powerBI
 * 
 * */
 
public class App {
 
	 public static void main(String[] args) {
	       try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            // start a transaction
	          
	        	System.out.println("Seção iniciada.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	    }
}
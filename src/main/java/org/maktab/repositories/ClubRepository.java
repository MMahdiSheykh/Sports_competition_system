package org.maktab.repositories;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.maktab.dbConnection.DbConnection;
import org.maktab.entities.Club;

public class ClubRepository {
    
    public void createClub(Club club){
        Session session = null;
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(club);
            session.getTransaction().commit();
        } catch (Exception sqlException){
            System.out.println("----------Transaction is bieng rolled back!----------");
            session.getTransaction().rollback();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public void updateClub(Club club, int id){
        Session session = null;
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            session.update(club);
            session.getTransaction().commit();
        } catch (Exception sqlException){
            System.out.println("----------Transaction is bieng rolled back!----------");
            session.getTransaction().rollback();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public void deleteClub(Club club){
        Session session = null;
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            session.delete(club);
            session.getTransaction().commit();
        } catch (Exception sqlException){
            System.out.println("----------Transaction is bieng rolled back!----------");
            session.getTransaction().rollback();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    public List<Club> findAllClubs(){
        Session session = null;
        List<Club> ClubList = new ArrayList<>();
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            ClubList = session.createQuery("FROM Club").list();
            return ClubList;
        }catch(Exception sqlException){
            System.out.println("----------Transaction is bieng rolled back!----------");
            session.getTransaction().rollback();
        }finally{
            if(session != null){
                session.close();
            }
        }
        return null;
    }

}

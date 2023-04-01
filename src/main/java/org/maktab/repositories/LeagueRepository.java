package org.maktab.repositories;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.maktab.dbConnection.DbConnection;
import org.maktab.entities.League;

public class LeagueRepository {

    public void createLeague(League league){
        Session session = null;
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            session.save(league);
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

    public void updateLeagud(League league, int id){
        Session session = null;
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            session.update(league);
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

    public void deleteLeague(League league){
        Session session = null;
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            session.delete(league);
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

    public List<League> findAllLeagues(){
        Session session = null;
        List<League> leagueList = new ArrayList<>();
        try{
            session = DbConnection.buildSessionFactory().openSession();
            session.beginTransaction();
            leagueList = session.createQuery("FROM League").list();
            return leagueList;
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

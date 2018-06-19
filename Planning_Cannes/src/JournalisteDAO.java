import java.sql.SQLException;


interface JournalisteDAO {
    Journaliste getById(int id) throws SQLException, ClassNotFoundException;

}
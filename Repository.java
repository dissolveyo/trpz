package Repository;

import java.sql.SQLException;

public interface Repository<T> {
    void get(int entityId) throws SQLException;
    void create(T entity) throws SQLException;
    void delete (int entityId) throws SQLException;
    void update (int entityId, T newEntity) throws SQLException;
}

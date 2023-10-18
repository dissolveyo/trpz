package Repository;

import Entities.Hint;

import java.sql.Connection;
import java.sql.SQLException;

public class HintRepository implements Repository<Hint> {
    private Connection connection;
    @Override
    public void get(int entityId) throws SQLException {

    }

    @Override
    public void create(Hint hint) throws SQLException {

    }

    @Override
    public void delete(int entityId) throws SQLException {

    }

    @Override
    public void update(int entityId, Hint newEntity) throws SQLException {

    }
}

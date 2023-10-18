package Repository;

import Entities.Snippet;

import java.sql.Connection;
import java.sql.SQLException;

public class SnippetRepository implements Repository<Snippet> {
    private Connection connection;
    @Override
    public void get(int entityId) throws SQLException {

    }

    @Override
    public void create(Snippet snippet) throws SQLException {

    }

    @Override
    public void delete(int entityId) throws SQLException {

    }

    @Override
    public void update(int entityId, Snippet newEntity) throws SQLException {

    }
}

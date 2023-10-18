package Repository;

import Entities.Bookmark;

import java.sql.Connection;
import java.sql.SQLException;

public class BookmarkRepository implements Repository<Bookmark> {
    private Connection connection;
    @Override
    public void get(int entityId) throws SQLException {

    }

    @Override
    public void create(Bookmark bookmark) throws SQLException {

    }

    @Override
    public void delete(int entityId) throws SQLException {

    }

    @Override
    public void update(int entityId, Bookmark newEntity) throws SQLException {

    }
}

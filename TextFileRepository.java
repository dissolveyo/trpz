package Repository;

import Entities.TextFile;
import java.sql.Connection;
import java.sql.SQLException;

public class TextFileRepository implements Repository<TextFile> {
    private Connection connection;
    @Override
    public void get(int entityId) throws SQLException {

    }

    @Override
    public void create(TextFile textFile) throws SQLException {

    }

    @Override
    public void delete(int entityId) throws SQLException {

    }

    @Override
    public void update(int entityId, TextFile newEntity) throws SQLException {

    }
}

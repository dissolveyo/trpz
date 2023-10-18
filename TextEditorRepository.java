package Repository;
import Entities.TextEditor;
import java.sql.Connection;
import java.sql.SQLException;

public  class TextEditorRepository implements Repository<TextEditor> {
    private Connection connection;
    @Override
    public void get(int entityId) throws SQLException {

    }

    @Override
    public void create(TextEditor textEditor) throws SQLException {

    }

    @Override
    public void delete(int entityId) throws SQLException {

    }

    @Override
    public void update(int entityId, TextEditor newEntity) throws SQLException {

    }
}

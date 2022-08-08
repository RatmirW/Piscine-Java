package edu.school21.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.SQLException;

import static junit.framework.Assert.assertNotNull;

public class EmbeddedDataSourceTest {

    private DataSource dataSource;

    @BeforeEach
    public void init(){
        dataSource = new EmbeddedDatabaseBuilder().
                setType(EmbeddedDatabaseType.HSQL).
                setScriptEncoding("UTF-8").
                addScript("schema.sql").addScript("data.sql").build();
    }

    @Test
    public void connectionTest() throws SQLException{
        assertNotNull(dataSource.getConnection());
    }

}

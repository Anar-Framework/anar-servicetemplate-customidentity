package af.gov.anar.dck.domain.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnection;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;
import org.springframework.beans.factory.annotation.Value;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;


@Data
@Getter
@AllArgsConstructor
public class ConnectionFactory {

    @Value("${spring.datasource.url")
    private  String datasoruceUrl;

	@Value("${spring.datasource.username}")
    private  String username;

    @Value("${spring.datasource.password}")
    private  String password;

 
    @Value("${spring.datasource.driver-class-name}")
    private  String classDriver;
 
    // public static DataSource getConnection() {
    //     DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
    //     dataSourceBuilder.driverClassName("org.postgresql.Driver");
    //     dataSourceBuilder.url("jdbc:postgresql://localhost:5432/asims_test");
    //     dataSourceBuilder.username("asims_user");
    //     dataSourceBuilder.password("secret");
    //     return dataSourceBuilder.build();
    // }
 

    private static interface Singleton {
        final ConnectionFactory INSTANCE = new ConnectionFactory();
    }
 
    private final DataSource dataSource;
 
    public ConnectionFactory() {
        
        Properties properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
        // properties.setProperty("driverClassName", "org.postgresql.Driver");// or get properties from some configuration file
 
        GenericObjectPool<PoolableConnection> pool = new GenericObjectPool<PoolableConnection>();
        DriverManagerConnectionFactory connectionFactory = new DriverManagerConnectionFactory(
            datasoruceUrl, properties
        );

        new PoolableConnectionFactory(
                connectionFactory, pool, null, "SELECT 1", 3, false, false, Connection.TRANSACTION_READ_COMMITTED
        );
 
        this.dataSource = new PoolingDataSource(pool);
    }
 
    public static Connection getDatabaseConnection() throws SQLException {
        return Singleton.INSTANCE.dataSource.getConnection();
    }
  
}
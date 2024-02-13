package xmlbasedspringconfig;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonDao {
    private JdbcConnection jdbcConnection;
}
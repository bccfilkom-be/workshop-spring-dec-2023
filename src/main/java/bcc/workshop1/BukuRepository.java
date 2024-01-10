package bcc.workshop1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BukuRepository extends JpaRepository<Buku, Long> {

    @Query(nativeQuery = true, value = """
     SELECT * FROM buku
     WHERE 
     id=:id       
     """)
    Buku getBukuById(@Param("id") Long id);
}
